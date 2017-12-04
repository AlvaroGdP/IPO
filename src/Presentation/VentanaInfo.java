package Presentation;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;

public class VentanaInfo extends JPanel {
	private JLabel lblNombre;
	private JTextField textField;
	private JLabel lblResponsable;
	private JLabel lblFechaInicio;
	private JLabel lblFechaFin;
	private JLabel lblPrioridad;
	private JLabel lblEstado;
	private JComboBox comboBox;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JLabel lblDescripcin;
	private JScrollPane scrollPane;
	private JTextField tfDescripcion;
	private JLabel lblEquipo;
	private JScrollPane scrollPane_1;
	private JButton btnModificarEquipo;
	private JButton btnGuardarCambios;
	private JList lstEquipo;

	/**
	 * Create the panel.
	 */
	public VentanaInfo() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{71, 182, 49, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 57, 0, 0, 0, 0, 0, 0, 51, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblDescripcin = new JLabel("Descripción");
		GridBagConstraints gbc_lblDescripcin = new GridBagConstraints();
		gbc_lblDescripcin.insets = new Insets(0, 0, 5, 0);
		gbc_lblDescripcin.gridx = 3;
		gbc_lblDescripcin.gridy = 1;
		add(lblDescripcin, gbc_lblDescripcin);
		
		lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 2;
		add(lblNombre, gbc_lblNombre);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 3;
		gbc_scrollPane.gridy = 2;
		add(scrollPane, gbc_scrollPane);
		
		tfDescripcion = new JTextField();
		scrollPane.setViewportView(tfDescripcion);
		tfDescripcion.setColumns(10);
		
		lblResponsable = new JLabel("Responsable");
		GridBagConstraints gbc_lblResponsable = new GridBagConstraints();
		gbc_lblResponsable.anchor = GridBagConstraints.EAST;
		gbc_lblResponsable.insets = new Insets(0, 0, 5, 5);
		gbc_lblResponsable.gridx = 0;
		gbc_lblResponsable.gridy = 3;
		add(lblResponsable, gbc_lblResponsable);
		
		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 3;
		add(comboBox, gbc_comboBox);
		
		lblFechaInicio = new JLabel("Fecha inicio");
		GridBagConstraints gbc_lblFechaInicio = new GridBagConstraints();
		gbc_lblFechaInicio.anchor = GridBagConstraints.EAST;
		gbc_lblFechaInicio.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaInicio.gridx = 0;
		gbc_lblFechaInicio.gridy = 6;
		add(lblFechaInicio, gbc_lblFechaInicio);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 6;
		add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		lblFechaFin = new JLabel("Fecha fin");
		GridBagConstraints gbc_lblFechaFin = new GridBagConstraints();
		gbc_lblFechaFin.anchor = GridBagConstraints.EAST;
		gbc_lblFechaFin.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaFin.gridx = 0;
		gbc_lblFechaFin.gridy = 7;
		add(lblFechaFin, gbc_lblFechaFin);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 7;
		add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		lblEquipo = new JLabel("Equipo");
		GridBagConstraints gbc_lblEquipo = new GridBagConstraints();
		gbc_lblEquipo.insets = new Insets(0, 0, 5, 0);
		gbc_lblEquipo.gridx = 3;
		gbc_lblEquipo.gridy = 7;
		add(lblEquipo, gbc_lblEquipo);
		
		scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_1.gridheight = 3;
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 3;
		gbc_scrollPane_1.gridy = 8;
		add(scrollPane_1, gbc_scrollPane_1);
		
		lstEquipo = new JList();
		scrollPane_1.setViewportView(lstEquipo);
		
				
				lblPrioridad = new JLabel("Prioridad");
				GridBagConstraints gbc_lblPrioridad = new GridBagConstraints();
				gbc_lblPrioridad.anchor = GridBagConstraints.EAST;
				gbc_lblPrioridad.insets = new Insets(0, 0, 5, 5);
				gbc_lblPrioridad.gridx = 0;
				gbc_lblPrioridad.gridy = 9;
				add(lblPrioridad, gbc_lblPrioridad);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Alta", "Media", "Baja"}));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 9;
		add(comboBox_1, gbc_comboBox_1);
		
		lblEstado = new JLabel("Estado");
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.anchor = GridBagConstraints.EAST;
		gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstado.gridx = 0;
		gbc_lblEstado.gridy = 10;
		add(lblEstado, gbc_lblEstado);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Activo", "Tardío", "Completo"}));
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 1;
		gbc_comboBox_2.gridy = 10;
		add(comboBox_2, gbc_comboBox_2);
		
		btnModificarEquipo = new JButton("Modificar Equipo");
		GridBagConstraints gbc_btnModificarEquipo = new GridBagConstraints();
		gbc_btnModificarEquipo.insets = new Insets(0, 0, 5, 0);
		gbc_btnModificarEquipo.gridx = 3;
		gbc_btnModificarEquipo.gridy = 11;
		add(btnModificarEquipo, gbc_btnModificarEquipo);
		
		btnGuardarCambios = new JButton("Guardar Cambios");
		GridBagConstraints gbc_btnGuardarCambios = new GridBagConstraints();
		gbc_btnGuardarCambios.gridwidth = 3;
		gbc_btnGuardarCambios.gridx = 1;
		gbc_btnGuardarCambios.gridy = 14;
		add(btnGuardarCambios, gbc_btnGuardarCambios);

	}

}
