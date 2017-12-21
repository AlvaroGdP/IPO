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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaModificarEquipo extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JLabel lblMiembrosDelEquipo;
	private JList lstEquipo;
	private JScrollPane scrollPane_1;
	private JLabel lblListaDeUsuarios;
	private JList lstUsuarios;
	private JButton btnGuardarCambios;
	private JButton button;
	private JButton button_1;

	private Tarea tarea;
	private Hardcode hc;
	
	private DefaultListModel<String> model;
	private DefaultListModel<String> modelAll; 
	
	private VentanaInfo parent;
	/**
	 * Create the frame.
	 */
	public VentanaModificarEquipo(Tarea tarea, Hardcode hc, VentanaInfo parent) {
		setMinimumSize(new Dimension(500, 300));
		
		
		this.tarea=tarea;
		this.hc=hc;
		this.parent=parent;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 499, 299);
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
		
		button = new JButton("--->");
		button.addActionListener(new ButtonActionListener());
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 1;
		gbc_button.gridy = 1;
		contentPane.add(button, gbc_button);
		
		button_1 = new JButton("<---");
		button_1.addActionListener(new Button_1ActionListener());
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 2;
		contentPane.add(button_1, gbc_button_1);
		
		btnGuardarCambios = new JButton("Guardar Cambios");
		btnGuardarCambios.addActionListener(new BtnGuardarCambiosActionListener());
		GridBagConstraints gbc_btnGuardarCambios = new GridBagConstraints();
		gbc_btnGuardarCambios.gridx = 2;
		gbc_btnGuardarCambios.gridy = 4;
		contentPane.add(btnGuardarCambios, gbc_btnGuardarCambios);
		
		crearListas();
	}

	private class ButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				for (int i=0; i<tarea.getEquipo().size(); i++) {
					if (String.valueOf(lstEquipo.getSelectedValue()).equals(tarea.getEquipo().get(i).getNombre())) {
						tarea.getEquipo().remove(i);
						model.removeElement(lstEquipo.getSelectedValue());
						lstEquipo.setSelectedIndex(-1);
					}
				}
				crearListas();
			}catch (Exception ex) {
			}	
		}
	}
	private class Button_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				for (int i=0; i<hc.listaUsuarios.size(); i++) {
					if (String.valueOf(lstUsuarios.getSelectedValue()).equals(hc.listaUsuarios.get(i).getNombre())) {
						tarea.getEquipo().add(hc.listaUsuarios.get(i));
						modelAll.removeElement(lstUsuarios.getSelectedValue());
						lstUsuarios.setSelectedIndex(-1);
					}
				}
				crearListas();
			}catch (Exception ex) {
			}	
		}
	}
	private class BtnGuardarCambiosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			parent.updateValues(tarea);
		}
	}
	
	public void crearListas() {
			boolean contains = false;
		//Lista del equipo de la tarea actual
				model = new DefaultListModel<>();
				lstEquipo = new JList(model);
				for (int i=0; i<tarea.getEquipo().size(); i++) {
					model.addElement(tarea.getEquipo().get(i).getNombre());
				}
				scrollPane.setViewportView(lstEquipo);
				
				//Lista de todos los usuarios totales
				modelAll = new DefaultListModel<>();
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
	}
}
