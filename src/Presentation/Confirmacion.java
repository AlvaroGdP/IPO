package Presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Confirmacion {

	private JFrame frame;
	private JLabel lblEliminar;
	private JButton btnConfirmar;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Confirmacion window = new Confirmacion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @return 
	 */
	public   Confirmacion() {
		
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 347, 150);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		{
			lblEliminar = new JLabel("\u00BFDesea elimiar el elemento seleccionado por completo?");
			frame.getContentPane().add(lblEliminar, BorderLayout.CENTER);
		}
		{
			btnConfirmar = new JButton("Confirmar");
			btnConfirmar.setIcon(new ImageIcon(Confirmacion.class.getResource("/Presentation/confirmar.png")));
			btnConfirmar.addActionListener(new BtnConfirmarActionListener());
			frame.getContentPane().add(btnConfirmar, BorderLayout.SOUTH);
		}
		
	}

	private class BtnConfirmarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			frame.dispose();
			
		}
	}

	
}
