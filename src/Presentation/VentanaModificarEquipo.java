package Presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.Arrays;

import javax.swing.border.TitledBorder;

import Domain.Tarea;
import Hardcode.Hardcode;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Dimension;

public class VentanaModificarEquipo extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JLabel lblMiembrosDelEquipo;
	private JList lstEquipo;
	private JScrollPane scrollPane_1;
	private JLabel lblListaDeUsuarios;
	private JList lstUsuarios;
	private JButton btnGuardarCambios;
	private JLabel lblEliminar;
	private JLabel lblAñadir;

	/**
	 * Create the frame.
	 */
	public VentanaModificarEquipo(Tarea tarea, Hardcode hc) {
		
		boolean contains = false;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 481, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{204, 45, 204, 0};
		gbl_contentPane.rowHeights = new int[]{0, 71, 56, 69, 27, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 4;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		lblMiembrosDelEquipo = new JLabel("Miembros del equipo");
		lblMiembrosDelEquipo.setForeground(Color.BLUE);
		scrollPane.setColumnHeaderView(lblMiembrosDelEquipo);
		
		//Lista del equipo de la tarea actual
		DefaultListModel<String> model = new DefaultListModel<>();
		lstEquipo = new JList(model);
		for (int i=0; i<tarea.getEquipo().size(); i++) {
			model.addElement(tarea.getEquipo().get(i).getNombre());
		}
		scrollPane.setViewportView(lstEquipo);
		
		scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridheight = 4;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 2;
		gbc_scrollPane_1.gridy = 0;
		contentPane.add(scrollPane_1, gbc_scrollPane_1);
		
		lblListaDeUsuarios = new JLabel("Lista de usuarios");
		lblListaDeUsuarios.setForeground(Color.BLUE);
		scrollPane_1.setColumnHeaderView(lblListaDeUsuarios);
		
		//Lista de todos los usuarios totales
		DefaultListModel<String> modelAll = new DefaultListModel<>();
		lstUsuarios = new JList(modelAll);
		for (int i=0; i<hc.listaUsuarios.size(); i++) {
			for (int j=0; j<tarea.getEquipo().size(); j++) {
				if (hc.listaUsuarios.get(i).getNombre().equals(tarea.getEquipo().get(j).getNombre())) {
					contains=true;
				}
			}
			
			if (!contains) {
				modelAll.addElement(hc.listaUsuarios.get(i).getNombre());
			}
			contains=false;
		}
		scrollPane_1.setViewportView(lstUsuarios);
		
		lblEliminar = new JLabel("-->");
		GridBagConstraints gbc_lblEliminar = new GridBagConstraints();
		gbc_lblEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_lblEliminar.gridx = 1;
		gbc_lblEliminar.gridy = 1;
		contentPane.add(lblEliminar, gbc_lblEliminar);
		
		lblAñadir = new JLabel("<--");
		GridBagConstraints gbc_lblAñadir = new GridBagConstraints();
		gbc_lblAñadir.insets = new Insets(0, 0, 5, 5);
		gbc_lblAñadir.gridx = 1;
		gbc_lblAñadir.gridy = 2;
		contentPane.add(lblAñadir, gbc_lblAñadir);
		
		btnGuardarCambios = new JButton("Guardar Cambios");
		GridBagConstraints gbc_btnGuardarCambios = new GridBagConstraints();
		gbc_btnGuardarCambios.gridx = 2;
		gbc_btnGuardarCambios.gridy = 4;
		contentPane.add(btnGuardarCambios, gbc_btnGuardarCambios);
	}

}
