package Presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import Domain.Usuario;
import Hardcode.Hardcode;

import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Window;

import javax.swing.border.BevelBorder;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{

	private JFrame frame;
	private JLabel lblUsuario;
	private JLabel lblUsuario_1;
	private JLabel lblUltimoAcceso;
	private JLabel lblUltimoAcceso_1;
	private JButton btnModificarDatosPersonales;
	private JPanel pnlVentanaProyectos;
	private JPanel pnlVentanaInfo;
	private JPanel pnlProyectos;
	private JPanel pnlInformacion;
	private JLabel lblEspaciadora2;
	private JLabel lblEspaciadora;
	private JLabel lblEspaciadora3;
	private JPanel pnlUsuarios;
	private JPanel pnlEnviarMensaje;
	private JPanel pnlVentanaEnviarMensaje;
	private JPanel pnlVentanaUsuarios;
	
	private static Hardcode hc;
	private static Usuario logged;
	private JButton btnHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame(hc, logged);
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
	public MainFrame(Hardcode hc, Usuario logged) {
		this.hc = hc;
		this.logged=logged;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frame = new JFrame();
		frame.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frame.setVisible(true);
		frame.setMinimumSize(new Dimension(1300, 700));
		frame.getContentPane().setMinimumSize(new Dimension(2147483647, 2147483647));
		frame.setBounds(100, 100, 1300, 849);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{307, 107, 0, 0, 0, 130, 352, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 191, 352, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		lblEspaciadora = new JLabel("     ");
		GridBagConstraints gbc_lblEspaciadora = new GridBagConstraints();
		gbc_lblEspaciadora.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspaciadora.gridx = 0;
		gbc_lblEspaciadora.gridy = 0;
		frame.getContentPane().add(lblEspaciadora, gbc_lblEspaciadora);
		
		btnHome = new JButton("Home");
		btnHome.addActionListener(new BtnHomeActionListener());
		GridBagConstraints gbc_btnHome = new GridBagConstraints();
		gbc_btnHome.gridheight = 2;
		gbc_btnHome.insets = new Insets(0, 0, 5, 5);
		gbc_btnHome.gridx = 0;
		gbc_btnHome.gridy = 1;
		frame.getContentPane().add(btnHome, gbc_btnHome);
		
		lblUsuario = new JLabel("Usuario:");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.WEST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 1;
		gbc_lblUsuario.gridy = 1;
		frame.getContentPane().add(lblUsuario, gbc_lblUsuario);
		
		lblUsuario_1 = new JLabel(logged.getNombre());
		GridBagConstraints gbc_lblUsuario_1 = new GridBagConstraints();
		gbc_lblUsuario_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario_1.gridx = 2;
		gbc_lblUsuario_1.gridy = 1;
		frame.getContentPane().add(lblUsuario_1, gbc_lblUsuario_1);
		
		lblEspaciadora3 = new JLabel("       ");
		GridBagConstraints gbc_lblEspaciadora3 = new GridBagConstraints();
		gbc_lblEspaciadora3.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspaciadora3.gridx = 3;
		gbc_lblEspaciadora3.gridy = 1;
		frame.getContentPane().add(lblEspaciadora3, gbc_lblEspaciadora3);
		
		btnModificarDatosPersonales = new JButton("Modificar datos personales");
		btnModificarDatosPersonales.addMouseListener(new BtnModificarDatosPersonalesMouseListener());
		GridBagConstraints gbc_btnModificarDatosPersonales = new GridBagConstraints();
		gbc_btnModificarDatosPersonales.gridheight = 2;
		gbc_btnModificarDatosPersonales.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificarDatosPersonales.gridx = 4;
		gbc_btnModificarDatosPersonales.gridy = 1;
		frame.getContentPane().add(btnModificarDatosPersonales, gbc_btnModificarDatosPersonales);
		
		lblUltimoAcceso = new JLabel("Último Acceso:");
		GridBagConstraints gbc_lblUltimoAcceso = new GridBagConstraints();
		gbc_lblUltimoAcceso.anchor = GridBagConstraints.WEST;
		gbc_lblUltimoAcceso.insets = new Insets(0, 0, 5, 5);
		gbc_lblUltimoAcceso.gridx = 1;
		gbc_lblUltimoAcceso.gridy = 2;
		frame.getContentPane().add(lblUltimoAcceso, gbc_lblUltimoAcceso);
		
		lblUltimoAcceso_1 = new JLabel(logged.getUltimoAcceso());
		GridBagConstraints gbc_lblUltimoAcceso_1 = new GridBagConstraints();
		gbc_lblUltimoAcceso_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblUltimoAcceso_1.gridx = 2;
		gbc_lblUltimoAcceso_1.gridy = 2;
		frame.getContentPane().add(lblUltimoAcceso_1, gbc_lblUltimoAcceso_1);
		
		lblEspaciadora2 = new JLabel("             ");
		GridBagConstraints gbc_lblEspaciadora2 = new GridBagConstraints();
		gbc_lblEspaciadora2.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspaciadora2.gridx = 0;
		gbc_lblEspaciadora2.gridy = 3;
		frame.getContentPane().add(lblEspaciadora2, gbc_lblEspaciadora2);
		
		
		pnlInformacion = new JPanel();
		pnlInformacion.setMaximumSize(new Dimension(3000, 3000));
		pnlInformacion.setMinimumSize(new Dimension(320, 600));
		pnlInformacion.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		GridBagConstraints gbc_pnlInformacion = new GridBagConstraints();
		gbc_pnlInformacion.gridheight = 3;
		gbc_pnlInformacion.gridwidth = 5;
		gbc_pnlInformacion.insets = new Insets(0, 0, 5, 5);
		gbc_pnlInformacion.fill = GridBagConstraints.BOTH;
		gbc_pnlInformacion.gridx = 1;
		gbc_pnlInformacion.gridy = 4;
		frame.getContentPane().add(pnlInformacion, gbc_pnlInformacion);
		pnlInformacion.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlVentanaInfo = new VentanaInfo(hc);
		GridBagLayout gbl_pnlVentanaInfo = (GridBagLayout) pnlVentanaInfo.getLayout();
		gbl_pnlVentanaInfo.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 124, 0};
		gbl_pnlVentanaInfo.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		pnlInformacion.add(pnlVentanaInfo);
		pnlVentanaInfo.setMinimumSize(new Dimension(400, 700));
		
		
		pnlProyectos = new JPanel();
		pnlProyectos.setBorder(new TitledBorder(null, "Proyectos y Tareas", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		GridBagConstraints gbc_pnlProyectos = new GridBagConstraints();
		gbc_pnlProyectos.gridheight = 4;
		gbc_pnlProyectos.insets = new Insets(0, 0, 5, 5);
		gbc_pnlProyectos.fill = GridBagConstraints.BOTH;
		gbc_pnlProyectos.gridx = 0;
		gbc_pnlProyectos.gridy = 4;
		frame.getContentPane().add(pnlProyectos, gbc_pnlProyectos);
		
		pnlVentanaProyectos = new VentanaProyectos(hc, pnlVentanaInfo);
		pnlVentanaProyectos.setAlignmentX(Component.LEFT_ALIGNMENT);
		pnlProyectos.add(pnlVentanaProyectos);
		pnlVentanaProyectos.setBorder(null);
		pnlVentanaProyectos.setPreferredSize(new Dimension(250, 560));
		pnlVentanaProyectos.setMinimumSize(new Dimension(185, 1800));
		
		((VentanaInfo) pnlVentanaInfo).setVentanaProyectos((VentanaProyectos) pnlVentanaProyectos);
		
		pnlEnviarMensaje = new JPanel();
		pnlEnviarMensaje.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Enviar Mensaje", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		GridBagConstraints gbc_pnlEnviarMensaje = new GridBagConstraints();
		gbc_pnlEnviarMensaje.anchor = GridBagConstraints.SOUTH;
		gbc_pnlEnviarMensaje.gridwidth = 2;
		gbc_pnlEnviarMensaje.gridheight = 6;
		gbc_pnlEnviarMensaje.fill = GridBagConstraints.HORIZONTAL;
		gbc_pnlEnviarMensaje.gridx = 6;
		gbc_pnlEnviarMensaje.gridy = 6;
		frame.getContentPane().add(pnlEnviarMensaje, gbc_pnlEnviarMensaje);
		
		pnlVentanaEnviarMensaje = new VentanaMensaje();
		pnlVentanaEnviarMensaje.setMinimumSize(new Dimension(300, 300));
		pnlEnviarMensaje.add(pnlVentanaEnviarMensaje);
		
		
		
		pnlUsuarios = new JPanel();
		pnlUsuarios.setPreferredSize(new Dimension(300, 300));
		pnlUsuarios.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Usuarios", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		GridBagConstraints gbc_pnlUsuarios = new GridBagConstraints();
		gbc_pnlUsuarios.gridheight = 2;
		gbc_pnlUsuarios.gridwidth = 2;
		gbc_pnlUsuarios.insets = new Insets(0, 0, 5, 0);
		gbc_pnlUsuarios.fill = GridBagConstraints.BOTH;
		gbc_pnlUsuarios.gridx = 6;
		gbc_pnlUsuarios.gridy = 4;
		frame.getContentPane().add(pnlUsuarios, gbc_pnlUsuarios);
		
		pnlVentanaUsuarios = new VentanaUsuarios(hc, (VentanaMensaje) pnlVentanaEnviarMensaje);
		pnlVentanaUsuarios.setPreferredSize(new Dimension(300, 230));
		pnlVentanaUsuarios.setMinimumSize(new Dimension(300, 250));
		pnlUsuarios.add(pnlVentanaUsuarios);
		
		
	}

	private class BtnModificarDatosPersonalesMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			CrearModificarUsuario newFrame = new CrearModificarUsuario(logged, false, hc, (VentanaUsuarios) pnlVentanaUsuarios);
		}
	}
	private class BtnHomeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Login newLogin = new Login();
			frame.dispose();
		}
	}
}
