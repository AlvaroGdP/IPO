package Presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Hardcode.Hardcode;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Login {

	private JFrame frame;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JTextField tfUsuario;
	private JButton btnConectar;
	private JLabel lblLoginIncorrecto;
	private JLabel lblVersion;
	private JLabel lblLogo;
	
	private Hardcode hc;
	private JPasswordField pwfPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//Cargar InformaciÃ³n
		hc = new Hardcode();
		

		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Presentation/marcador-de-posicion.png")));
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(183, 74, 46, 35);
		frame.getContentPane().add(lblUsuario);
		
		lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(183, 120, 81, 26);
		frame.getContentPane().add(lblContrasea);
		
		tfUsuario = new JTextField();
		tfUsuario.setBounds(259, 81, 120, 20);
		frame.getContentPane().add(tfUsuario);
		tfUsuario.setColumns(10);
		
		btnConectar = new JButton("Conectar");
		btnConectar.addMouseListener(new BtnConectarMouseListener());
		btnConectar.setBounds(226, 210, 89, 23);
		frame.getContentPane().add(btnConectar);
		
		lblLoginIncorrecto = new JLabel("");
		lblLoginIncorrecto.setBounds(183, 156, 241, 27);
		frame.getContentPane().add(lblLoginIncorrecto);
		
		lblVersion = new JLabel("Version Final");
		lblVersion.setBounds(241, 26, 134, 26);
		frame.getContentPane().add(lblVersion);
		
		lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Login.class.getResource("/Presentation/factura.png")));
		lblLogo.setBounds(24, 52, 142, 163);
		frame.getContentPane().add(lblLogo);
		
		pwfPassword = new JPasswordField();
		pwfPassword.setEchoChar('*');
		pwfPassword.setBounds(259, 123, 120, 20);
		frame.getContentPane().add(pwfPassword);
	}
	
	private class BtnConectarMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			
			for (int i=0; i<hc.listaUsuarios.size(); i++) {
				if (String.valueOf(tfUsuario.getText()).equals(hc.listaUsuarios.get(i).getNick()) && String.valueOf(pwfPassword.getPassword()).equals(hc.listaUsuarios.get(i).getPassword())) {
					MainFrame mainframe = new MainFrame(hc, hc.listaUsuarios.get(i));
					frame.dispose();
				}else {
					lblLoginIncorrecto.setText("Credenciales incorrectos");
				}
			}
			
		}
	}
	
}
