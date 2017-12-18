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

public class VentanaUsuarios extends JPanel {
	
	private JFrame frame;
	private JScrollPane scrollPane;
	private JList lstUsuarios;
	private JButton btnAñadirUsuario;
	private JButton btnEliminarUsuario;

	private Hardcode hc;
	
	/**
	 * Create the panel.
	 */
	public VentanaUsuarios(Hardcode hc) {
		this.hc = hc;
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
		
		
		btnAñadirUsuario = new JButton("Añadir Usuario");
		btnAñadirUsuario.addMouseListener(new BtnAñadirUsuarioMouseListener());
		GridBagConstraints gbc_btnAñadirUsuario = new GridBagConstraints();
		gbc_btnAñadirUsuario.gridwidth = 2;
		gbc_btnAñadirUsuario.insets = new Insets(0, 0, 0, 5);
		gbc_btnAñadirUsuario.gridx = 0;
		gbc_btnAñadirUsuario.gridy = 1;
		add(btnAñadirUsuario, gbc_btnAñadirUsuario);
		
		btnEliminarUsuario = new JButton("Eliminar usuario");
		GridBagConstraints gbc_btnEliminarUsuario = new GridBagConstraints();
		gbc_btnEliminarUsuario.gridwidth = 2;
		gbc_btnEliminarUsuario.gridx = 2;
		gbc_btnEliminarUsuario.gridy = 1;
		add(btnEliminarUsuario, gbc_btnEliminarUsuario);

	}

	
	private class BtnAñadirUsuarioMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			CrearModificarUsuario newFrame = new CrearModificarUsuario();
		}
	}
	
	public void llenarLista() {
		DefaultListModel<String> model = new DefaultListModel<>();
		lstUsuarios = new JList(model);
		for (int i=0; i<hc.listaUsuarios.size(); i++) {
			model.addElement(hc.listaUsuarios.get(i).getNombre());
		}
		scrollPane.setViewportView(lstUsuarios);
	}
}
