package Presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JTextField;

import Domain.Usuario;

import javax.swing.JScrollPane;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CrearModificarUsuario{

	private JFrame frame;
	private JLabel lblNombre;
	private JLabel lblTelfono;
	private JLabel lblCorreo;
	private JLabel lblDireccion;
	private JButton btnGuardarCambios;
	private JTextField tfNombre;
	private JTextField tfTelefono;
	private JTextField tfCorreo;
	private JTextField tfDireccion;
	private JScrollPane scrollPane;
	private JButton btnModificarImagen;
	private JLabel lblImagen;
	private JLabel lblEspaciadora;
	private JLabel lblEspaciadora2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearModificarUsuario window = new CrearModificarUsuario();
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
	public CrearModificarUsuario(Usuario logged) {
		initialize();
		leerDatos(logged);
	}
	
	public CrearModificarUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frame.setVisible(true);
		frame.setBounds(100, 100, 638, 348);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 189, 88, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 53, 32, 37, 40, 38, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		lblEspaciadora = new JLabel("    ");
		GridBagConstraints gbc_lblEspaciadora = new GridBagConstraints();
		gbc_lblEspaciadora.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspaciadora.gridx = 0;
		gbc_lblEspaciadora.gridy = 0;
		frame.getContentPane().add(lblEspaciadora, gbc_lblEspaciadora);
		
		lblEspaciadora2 = new JLabel("      ");
		GridBagConstraints gbc_lblEspaciadora2 = new GridBagConstraints();
		gbc_lblEspaciadora2.insets = new Insets(0, 0, 5, 0);
		gbc_lblEspaciadora2.gridx = 4;
		gbc_lblEspaciadora2.gridy = 0;
		frame.getContentPane().add(lblEspaciadora2, gbc_lblEspaciadora2);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 4;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		frame.getContentPane().add(scrollPane, gbc_scrollPane);
		
		lblImagen = new JLabel("");
		scrollPane.setViewportView(lblImagen);
		
		lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 1;
		frame.getContentPane().add(lblNombre, gbc_lblNombre);
		
		tfNombre = new JTextField();
		GridBagConstraints gbc_tfNombre = new GridBagConstraints();
		gbc_tfNombre.insets = new Insets(0, 0, 5, 5);
		gbc_tfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNombre.gridx = 3;
		gbc_tfNombre.gridy = 1;
		frame.getContentPane().add(tfNombre, gbc_tfNombre);
		tfNombre.setColumns(10);
		
		lblTelfono = new JLabel("Teléfono");
		GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
		gbc_lblTelfono.anchor = GridBagConstraints.EAST;
		gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelfono.gridx = 2;
		gbc_lblTelfono.gridy = 2;
		frame.getContentPane().add(lblTelfono, gbc_lblTelfono);
		
		tfTelefono = new JTextField();
		GridBagConstraints gbc_tfTelefono = new GridBagConstraints();
		gbc_tfTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_tfTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfTelefono.gridx = 3;
		gbc_tfTelefono.gridy = 2;
		frame.getContentPane().add(tfTelefono, gbc_tfTelefono);
		tfTelefono.setColumns(10);
		
		lblCorreo = new JLabel("Correo");
		GridBagConstraints gbc_lblCorreo = new GridBagConstraints();
		gbc_lblCorreo.anchor = GridBagConstraints.EAST;
		gbc_lblCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreo.gridx = 2;
		gbc_lblCorreo.gridy = 3;
		frame.getContentPane().add(lblCorreo, gbc_lblCorreo);
		
		tfCorreo = new JTextField();
		GridBagConstraints gbc_tfCorreo = new GridBagConstraints();
		gbc_tfCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_tfCorreo.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfCorreo.gridx = 3;
		gbc_tfCorreo.gridy = 3;
		frame.getContentPane().add(tfCorreo, gbc_tfCorreo);
		tfCorreo.setColumns(10);
		
		lblDireccion = new JLabel("Dirección");
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.anchor = GridBagConstraints.EAST;
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 2;
		gbc_lblDireccion.gridy = 4;
		frame.getContentPane().add(lblDireccion, gbc_lblDireccion);
		
		tfDireccion = new JTextField();
		GridBagConstraints gbc_tfDireccion = new GridBagConstraints();
		gbc_tfDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_tfDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfDireccion.gridx = 3;
		gbc_tfDireccion.gridy = 4;
		frame.getContentPane().add(tfDireccion, gbc_tfDireccion);
		tfDireccion.setColumns(10);
		
		btnModificarImagen = new JButton("Modificar Imagen");
		GridBagConstraints gbc_btnModificarImagen = new GridBagConstraints();
		gbc_btnModificarImagen.insets = new Insets(0, 0, 0, 5);
		gbc_btnModificarImagen.gridx = 1;
		gbc_btnModificarImagen.gridy = 5;
		frame.getContentPane().add(btnModificarImagen, gbc_btnModificarImagen);
		
		btnGuardarCambios = new JButton("Guardar Cambios");
		GridBagConstraints gbc_btnGuardarCambios = new GridBagConstraints();
		gbc_btnGuardarCambios.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardarCambios.gridx = 3;
		gbc_btnGuardarCambios.gridy = 5;
		frame.getContentPane().add(btnGuardarCambios, gbc_btnGuardarCambios);
	}

	public void leerDatos(Usuario logged) {
		tfNombre.setText(logged.getNombre());
		tfTelefono.setText(logged.getTelefono());
		tfCorreo.setText(logged.getCorreo());
		tfDireccion.setText(logged.getDireccion());
		if (logged.getPath()!=null) {
			//Imagen
		}
	}
	
	
}
