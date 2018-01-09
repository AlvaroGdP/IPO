package Presentation;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;

import Domain.Usuario;
import Hardcode.Hardcode;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ImageIcon;

public class VentanaUsuarios extends JPanel {
	
	private JFrame frame;
	private VentanaUsuarios vu;
	private JScrollPane scrollPane;
	private JList lstUsuarios;
	private JButton btnAñadirUsuario;
	private JButton btnEliminarUsuario;

	private Hardcode hc;
	private VentanaMensaje pnlMensaje;
	
	/**
	 * Create the panel.
	 * @param pnlVentanaProyectos 
	 */
	public VentanaUsuarios(Hardcode hc, VentanaMensaje pnlVentanaEnviarMensaje) {
		
		this.vu = this;
		this.hc = hc;
		this.pnlMensaje = pnlVentanaEnviarMensaje;
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		add(scrollPane, gbc_scrollPane);
		
		llenarLista();
		
		
		btnAñadirUsuario = new JButton("A\u00F1adir ");
		btnAñadirUsuario.setIcon(new ImageIcon(VentanaUsuarios.class.getResource("/Presentation/nuevo-usuario.png")));
		btnAñadirUsuario.addMouseListener(new BtnAñadirUsuarioMouseListener());
		GridBagConstraints gbc_btnAñadirUsuario = new GridBagConstraints();
		gbc_btnAñadirUsuario.gridwidth = 2;
		gbc_btnAñadirUsuario.insets = new Insets(0, 0, 0, 5);
		gbc_btnAñadirUsuario.gridx = 0;
		gbc_btnAñadirUsuario.gridy = 1;
		add(btnAñadirUsuario, gbc_btnAñadirUsuario);
		
		btnEliminarUsuario = new JButton("Eliminar ");
		btnEliminarUsuario.setIcon(new ImageIcon(VentanaUsuarios.class.getResource("/Presentation/borrar-usuario.png")));
		btnEliminarUsuario.addActionListener(new BtnEliminarUsuarioActionListener());
		GridBagConstraints gbc_btnEliminarUsuario = new GridBagConstraints();
		gbc_btnEliminarUsuario.gridwidth = 2;
		gbc_btnEliminarUsuario.gridx = 2;
		gbc_btnEliminarUsuario.gridy = 1;
		add(btnEliminarUsuario, gbc_btnEliminarUsuario);

	}

	
	private class BtnAñadirUsuarioMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			Usuario nuevo = new Usuario();
			CrearModificarUsuario newFrame = new CrearModificarUsuario(nuevo, true, hc, vu);
		}
	}
	
	private class LstUsuariosListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			pnlMensaje.setDestinatario(String.valueOf(lstUsuarios.getSelectedValue()));
		}
	}
	
	private class LstUsuariosMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() == 2) {

				try {
					for (int i=0; i<hc.listaUsuarios.size(); i++) {

						if (lstUsuarios.getSelectedValue().equals(hc.listaUsuarios.get(i).getNombre())) {
							Usuario seleccionado = hc.listaUsuarios.get(i);
							CrearModificarUsuario newFrame = new CrearModificarUsuario(seleccionado, false, hc, vu);
						}
					}
				}catch (Exception ex) {
					
				}
				
			}
		}
	}
	private class BtnEliminarUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				Confirmacion confirmacion = new Confirmacion();
				String usuario = (String) lstUsuarios.getSelectedValue();
				for (int i=0; i<hc.listaUsuarios.size(); i++) {
					if (usuario.equals(hc.listaUsuarios.get(i).getNombre())) {
						hc.listaUsuarios.remove(i);
						llenarLista();
					}
				}
			}catch (Exception ex) {
				
			}
		}
	}
	
	public void llenarLista() {
		DefaultListModel<String> model = new DefaultListModel<>();
		lstUsuarios = new JList(model);
		lstUsuarios.addMouseListener(new LstUsuariosMouseListener());
		lstUsuarios.addListSelectionListener(new LstUsuariosListSelectionListener());
		for (int i=0; i<hc.listaUsuarios.size(); i++) {
			model.addElement(hc.listaUsuarios.get(i).getNombre());
		}
		scrollPane.setViewportView(lstUsuarios);
	}
}
