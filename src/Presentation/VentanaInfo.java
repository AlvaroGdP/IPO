package Presentation;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import Domain.Tarea;
import Hardcode.Hardcode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaInfo extends JPanel {
	private JLabel lblNombre;
	private JTextField tfNombre;
	private JLabel lblResponsable;
	private JLabel lblFechaInicio;
	private JLabel lblFechaFin;
	private JLabel lblPrioridad;
	private JLabel lblEstado;
	private JComboBox cbResponsable;
	private JTextField tfFechaInicio;
	private JTextField tfFechaFin;
	private JComboBox cbPrioridad;
	private JComboBox cbEstado;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JButton btnModificarEquipo;
	private JButton btnGuardarCambios;
	private JLabel lblEspaciadora2;
	private JLabel lblEspaciadora3;
	private JLabel lblEspaciadora4;
	private JLabel lblEspaciadora7;
	private JLabel lblEspaciadora8;
	private JLabel lblEquipo;
	private JLabel lblEspaciadora9;
	private JLabel lblDescripcion;
	private JTextArea taDescripcion;
	private JLabel lblEspaciadora10;
	private JLabel lblEspaciadora11;
	private JLabel lblEspaciadora12;
	private JLabel lblEspaciadora13;
	private JList lstEquipo;

	
	private Tarea actual;
	private Hardcode hc;
	
	/**
	 * Create the panel.
	 */
	public VentanaInfo(Hardcode hc) {
		
		this.hc = hc;
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{71, 182, 49, 230, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 27, 0, 0, 0, 0, 33, 0, 0, 0, 0, 0, 32, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblEspaciadora10 = new JLabel("    ");
		GridBagConstraints gbc_lblEspaciadora10 = new GridBagConstraints();
		gbc_lblEspaciadora10.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspaciadora10.gridx = 0;
		gbc_lblEspaciadora10.gridy = 0;
		add(lblEspaciadora10, gbc_lblEspaciadora10);
		
		lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 2;
		add(lblNombre, gbc_lblNombre);
		
		tfNombre = new JTextField();
		GridBagConstraints gbc_tfNombre = new GridBagConstraints();
		gbc_tfNombre.insets = new Insets(0, 0, 5, 5);
		gbc_tfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNombre.gridx = 1;
		gbc_tfNombre.gridy = 2;
		add(tfNombre, gbc_tfNombre);
		tfNombre.setColumns(10);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 6;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 3;
		gbc_scrollPane.gridy = 2;
		add(scrollPane, gbc_scrollPane);
		
		lblDescripcion = new JLabel("Descripción");
		lblDescripcion.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblDescripcion.setForeground(Color.BLUE);
		scrollPane.setColumnHeaderView(lblDescripcion);
		
		taDescripcion = new JTextArea();
		scrollPane.setViewportView(taDescripcion);
		
		lblResponsable = new JLabel("Responsable");
		GridBagConstraints gbc_lblResponsable = new GridBagConstraints();
		gbc_lblResponsable.anchor = GridBagConstraints.EAST;
		gbc_lblResponsable.insets = new Insets(0, 0, 5, 5);
		gbc_lblResponsable.gridx = 0;
		gbc_lblResponsable.gridy = 3;
		add(lblResponsable, gbc_lblResponsable);
		
		cbResponsable = new JComboBox();
		GridBagConstraints gbc_cbResponsable = new GridBagConstraints();
		gbc_cbResponsable.insets = new Insets(0, 0, 5, 5);
		gbc_cbResponsable.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbResponsable.gridx = 1;
		gbc_cbResponsable.gridy = 3;
		add(cbResponsable, gbc_cbResponsable);
		
		lblEspaciadora11 = new JLabel("    ");
		GridBagConstraints gbc_lblEspaciadora11 = new GridBagConstraints();
		gbc_lblEspaciadora11.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspaciadora11.gridx = 0;
		gbc_lblEspaciadora11.gridy = 4;
		add(lblEspaciadora11, gbc_lblEspaciadora11);
		
		lblEspaciadora2 = new JLabel("                    ");
		GridBagConstraints gbc_lblEspaciadora2 = new GridBagConstraints();
		gbc_lblEspaciadora2.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspaciadora2.gridx = 0;
		gbc_lblEspaciadora2.gridy = 5;
		add(lblEspaciadora2, gbc_lblEspaciadora2);
		
		lblFechaInicio = new JLabel("Fecha inicio");
		GridBagConstraints gbc_lblFechaInicio = new GridBagConstraints();
		gbc_lblFechaInicio.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblFechaInicio.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaInicio.gridx = 0;
		gbc_lblFechaInicio.gridy = 6;
		add(lblFechaInicio, gbc_lblFechaInicio);
		
		tfFechaInicio = new JTextField();
		GridBagConstraints gbc_tfFechaInicio = new GridBagConstraints();
		gbc_tfFechaInicio.anchor = GridBagConstraints.SOUTH;
		gbc_tfFechaInicio.insets = new Insets(0, 0, 5, 5);
		gbc_tfFechaInicio.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfFechaInicio.gridx = 1;
		gbc_tfFechaInicio.gridy = 6;
		add(tfFechaInicio, gbc_tfFechaInicio);
		tfFechaInicio.setColumns(10);
		
		lblFechaFin = new JLabel("Fecha fin");
		GridBagConstraints gbc_lblFechaFin = new GridBagConstraints();
		gbc_lblFechaFin.anchor = GridBagConstraints.EAST;
		gbc_lblFechaFin.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaFin.gridx = 0;
		gbc_lblFechaFin.gridy = 7;
		add(lblFechaFin, gbc_lblFechaFin);
		
		tfFechaFin = new JTextField();
		GridBagConstraints gbc_tfFechaFin = new GridBagConstraints();
		gbc_tfFechaFin.insets = new Insets(0, 0, 5, 5);
		gbc_tfFechaFin.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfFechaFin.gridx = 1;
		gbc_tfFechaFin.gridy = 7;
		add(tfFechaFin, gbc_tfFechaFin);
		tfFechaFin.setColumns(10);
		
		lblEspaciadora13 = new JLabel("   ");
		GridBagConstraints gbc_lblEspaciadora13 = new GridBagConstraints();
		gbc_lblEspaciadora13.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspaciadora13.gridx = 2;
		gbc_lblEspaciadora13.gridy = 8;
		add(lblEspaciadora13, gbc_lblEspaciadora13);
		
		lblEspaciadora8 = new JLabel("     ");
		GridBagConstraints gbc_lblEspaciadora8 = new GridBagConstraints();
		gbc_lblEspaciadora8.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspaciadora8.gridx = 2;
		gbc_lblEspaciadora8.gridy = 9;
		add(lblEspaciadora8, gbc_lblEspaciadora8);
				
		lblEspaciadora9 = new JLabel("     ");
		GridBagConstraints gbc_lblEspaciadora9 = new GridBagConstraints();
		gbc_lblEspaciadora9.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspaciadora9.gridx = 0;
		gbc_lblEspaciadora9.gridy = 10;
		add(lblEspaciadora9, gbc_lblEspaciadora9);
		
		scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_1.gridheight = 4;
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 3;
		gbc_scrollPane_1.gridy = 10;
		add(scrollPane_1, gbc_scrollPane_1);
		
		lblEquipo = new JLabel("Equipo");
		lblEquipo.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblEquipo.setForeground(Color.BLUE);
		lblEquipo.setBackground(Color.BLUE);
		scrollPane_1.setColumnHeaderView(lblEquipo);
		
		
		lblPrioridad = new JLabel("Prioridad");
		GridBagConstraints gbc_lblPrioridad = new GridBagConstraints();
		gbc_lblPrioridad.anchor = GridBagConstraints.EAST;
		gbc_lblPrioridad.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrioridad.gridx = 0;
		gbc_lblPrioridad.gridy = 11;
		add(lblPrioridad, gbc_lblPrioridad);
		
		cbPrioridad = new JComboBox();
		cbPrioridad.setModel(new DefaultComboBoxModel(new String[] {"Alta", "Media", "Baja"}));
		GridBagConstraints gbc_cbPrioridad = new GridBagConstraints();
		gbc_cbPrioridad.insets = new Insets(0, 0, 5, 5);
		gbc_cbPrioridad.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbPrioridad.gridx = 1;
		gbc_cbPrioridad.gridy = 11;
		add(cbPrioridad, gbc_cbPrioridad);
		
		lblEstado = new JLabel("Estado");
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.anchor = GridBagConstraints.EAST;
		gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstado.gridx = 0;
		gbc_lblEstado.gridy = 12;
		add(lblEstado, gbc_lblEstado);
		
		cbEstado = new JComboBox();
		cbEstado.setModel(new DefaultComboBoxModel(new String[] {"Activo", "Tardío", "Completo"}));
		GridBagConstraints gbc_cbEstado = new GridBagConstraints();
		gbc_cbEstado.insets = new Insets(0, 0, 5, 5);
		gbc_cbEstado.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbEstado.gridx = 1;
		gbc_cbEstado.gridy = 12;
		add(cbEstado, gbc_cbEstado);
		
		lblEspaciadora3 = new JLabel("     ");
		GridBagConstraints gbc_lblEspaciadora3 = new GridBagConstraints();
		gbc_lblEspaciadora3.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspaciadora3.gridx = 0;
		gbc_lblEspaciadora3.gridy = 14;
		add(lblEspaciadora3, gbc_lblEspaciadora3);
		
		lblEspaciadora4 = new JLabel("     ");
		GridBagConstraints gbc_lblEspaciadora4 = new GridBagConstraints();
		gbc_lblEspaciadora4.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspaciadora4.gridx = 0;
		gbc_lblEspaciadora4.gridy = 15;
		add(lblEspaciadora4, gbc_lblEspaciadora4);
		
		btnModificarEquipo = new JButton("Modificar Equipo");
		btnModificarEquipo.addActionListener(new BtnModificarEquipoActionListener());
		GridBagConstraints gbc_btnModificarEquipo = new GridBagConstraints();
		gbc_btnModificarEquipo.insets = new Insets(0, 0, 5, 0);
		gbc_btnModificarEquipo.gridx = 3;
		gbc_btnModificarEquipo.gridy = 15;
		add(btnModificarEquipo, gbc_btnModificarEquipo);
		
		lblEspaciadora7 = new JLabel("       ");
		GridBagConstraints gbc_lblEspaciadora7 = new GridBagConstraints();
		gbc_lblEspaciadora7.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblEspaciadora7.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspaciadora7.gridx = 2;
		gbc_lblEspaciadora7.gridy = 16;
		add(lblEspaciadora7, gbc_lblEspaciadora7);
		
		lblEspaciadora12 = new JLabel("   ");
		GridBagConstraints gbc_lblEspaciadora12 = new GridBagConstraints();
		gbc_lblEspaciadora12.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspaciadora12.gridx = 0;
		gbc_lblEspaciadora12.gridy = 17;
		add(lblEspaciadora12, gbc_lblEspaciadora12);
		
		btnGuardarCambios = new JButton("Guardar Cambios");
		GridBagConstraints gbc_btnGuardarCambios = new GridBagConstraints();
		gbc_btnGuardarCambios.insets = new Insets(0, 0, 5, 0);
		gbc_btnGuardarCambios.gridwidth = 3;
		gbc_btnGuardarCambios.gridx = 1;
		gbc_btnGuardarCambios.gridy = 18;
		add(btnGuardarCambios, gbc_btnGuardarCambios);
		
		initializeResponsable();

	}
	
	public void updateValues(Tarea actual) {
		this.actual=actual;
		tfNombre.setText(actual.getNombre());
		tfFechaInicio.setText(actual.getFechaInicio());
		tfFechaFin.setText(actual.getFechaFin());
		taDescripcion.setText(actual.getDescripcion());
		
		switch (actual.getPrioridad()) {
		case 0:
			cbPrioridad.setSelectedIndex(actual.getPrioridad());
		case 1:
			cbPrioridad.setSelectedIndex(actual.getPrioridad());
		case 2:
			cbPrioridad.setSelectedIndex(actual.getPrioridad());
		}
		cbResponsable.setSelectedItem(actual.getResponsable().getNombre());
		
		switch (actual.getEstado()) {
		case 0:
			cbEstado.setSelectedIndex(actual.getEstado());
		case 1:
			cbEstado.setSelectedIndex(actual.getEstado());
		case 2:
			cbEstado.setSelectedIndex(actual.getEstado());
		}
		

		DefaultListModel<String> model = new DefaultListModel<>();
		lstEquipo = new JList(model);
		for (int i=0; i<actual.getEquipo().size(); i++) {
			model.addElement(actual.getEquipo().get(i).getNombre());
		}
		scrollPane_1.setViewportView(lstEquipo);
			
	}
	
	public void initializeResponsable() {
		for (int i=0; i<hc.listaUsuarios.size(); i++) {
			cbResponsable.addItem(hc.listaUsuarios.get(i).getNombre());
		}
	}

	private class BtnModificarEquipoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			VentanaModificarEquipo newFrame = new VentanaModificarEquipo(actual, hc);
			newFrame.setVisible(true);
		}
	}
}
