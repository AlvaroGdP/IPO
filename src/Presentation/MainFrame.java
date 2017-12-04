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
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.border.BevelBorder;

public class MainFrame {

	private JFrame frame;
	private JLabel lblLblhome;
	private JLabel lblUsuario;
	private JLabel lblUsuario_1;
	private JLabel lblUltimoAcceso;
	private JLabel lblUltimoAcceso_1;
	private JButton btnModificarDatosPersonales;
	private JSplitPane splitPane;
	private JPanel pnlProyectos;
	private JPanel pnlInformacion;
	private JSplitPane splitPane_1;
	private JPanel pnlUsuarios;
	private JPanel pnlMensajes;
	private JPanel panel;
	private JPanel panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setLocation(new Point(1, 1));
		frame.setMinimumSize(new Dimension(1200, 700));
		frame.getContentPane().setMinimumSize(new Dimension(2147483647, 2147483647));
		frame.setBounds(100, 100, 660, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{62, 0, 0, 0, 0, 341, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		lblLblhome = new JLabel("lblHome");
		GridBagConstraints gbc_lblLblhome = new GridBagConstraints();
		gbc_lblLblhome.gridheight = 2;
		gbc_lblLblhome.insets = new Insets(0, 0, 5, 5);
		gbc_lblLblhome.gridx = 0;
		gbc_lblLblhome.gridy = 0;
		frame.getContentPane().add(lblLblhome, gbc_lblLblhome);
		
		lblUsuario = new JLabel("Usuario:");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.WEST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 1;
		gbc_lblUsuario.gridy = 0;
		frame.getContentPane().add(lblUsuario, gbc_lblUsuario);
		
		lblUsuario_1 = new JLabel("Usuario");
		GridBagConstraints gbc_lblUsuario_1 = new GridBagConstraints();
		gbc_lblUsuario_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario_1.gridx = 2;
		gbc_lblUsuario_1.gridy = 0;
		frame.getContentPane().add(lblUsuario_1, gbc_lblUsuario_1);
		
		lblUltimoAcceso = new JLabel("Último Acceso:");
		GridBagConstraints gbc_lblUltimoAcceso = new GridBagConstraints();
		gbc_lblUltimoAcceso.anchor = GridBagConstraints.WEST;
		gbc_lblUltimoAcceso.insets = new Insets(0, 0, 5, 5);
		gbc_lblUltimoAcceso.gridx = 1;
		gbc_lblUltimoAcceso.gridy = 1;
		frame.getContentPane().add(lblUltimoAcceso, gbc_lblUltimoAcceso);
		
		lblUltimoAcceso_1 = new JLabel("ultimo acceso");
		GridBagConstraints gbc_lblUltimoAcceso_1 = new GridBagConstraints();
		gbc_lblUltimoAcceso_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblUltimoAcceso_1.gridx = 2;
		gbc_lblUltimoAcceso_1.gridy = 1;
		frame.getContentPane().add(lblUltimoAcceso_1, gbc_lblUltimoAcceso_1);
		
		btnModificarDatosPersonales = new JButton("Modificar datos personales");
		GridBagConstraints gbc_btnModificarDatosPersonales = new GridBagConstraints();
		gbc_btnModificarDatosPersonales.gridheight = 2;
		gbc_btnModificarDatosPersonales.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificarDatosPersonales.gridx = 3;
		gbc_btnModificarDatosPersonales.gridy = 0;
		frame.getContentPane().add(btnModificarDatosPersonales, gbc_btnModificarDatosPersonales);
		
		splitPane = new JSplitPane();
		splitPane.setMinimumSize(new Dimension(300, 400));
		GridBagConstraints gbc_splitPane = new GridBagConstraints();
		gbc_splitPane.gridheight = 3;
		gbc_splitPane.gridwidth = 6;
		gbc_splitPane.insets = new Insets(0, 0, 0, 5);
		gbc_splitPane.fill = GridBagConstraints.BOTH;
		gbc_splitPane.gridx = 0;
		gbc_splitPane.gridy = 3;
		frame.getContentPane().add(splitPane, gbc_splitPane);
		
		pnlProyectos = new JPanel();
		pnlProyectos.setMinimumSize(new Dimension(275, 10));
		pnlProyectos.setBorder(new TitledBorder(null, "Proyectos y tareas", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		splitPane.setLeftComponent(pnlProyectos);
		
		panel = new VentanaProyectos();
		panel.setBorder(null);
		panel.setPreferredSize(new Dimension(250, 560));
		panel.setMinimumSize(new Dimension(500, 1500));
		pnlProyectos.add(panel);
		
		pnlInformacion = new JPanel();
		pnlInformacion.setMinimumSize(new Dimension(150, 10));
		pnlInformacion.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		splitPane.setRightComponent(pnlInformacion);
		
		panel_1 = new VentanaInfo();
		panel_1.setMinimumSize(new Dimension(465, 600));
		pnlInformacion.add(panel_1);
		
		splitPane_1 = new JSplitPane();
		splitPane_1.setPreferredSize(new Dimension(217, 500));
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		GridBagConstraints gbc_splitPane_1 = new GridBagConstraints();
		gbc_splitPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_splitPane_1.fill = GridBagConstraints.BOTH;
		gbc_splitPane_1.gridx = 6;
		gbc_splitPane_1.gridy = 3;
		frame.getContentPane().add(splitPane_1, gbc_splitPane_1);
		
		pnlUsuarios = new JPanel();
		pnlUsuarios.setBorder(new TitledBorder(null, "Usuarios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlUsuarios.setMinimumSize(new Dimension(10, 150));
		splitPane_1.setLeftComponent(pnlUsuarios);
		
		pnlMensajes = new JPanel();
		pnlMensajes.setBorder(new TitledBorder(null, "Mensajes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlMensajes.setMinimumSize(new Dimension(10, 150));
		splitPane_1.setRightComponent(pnlMensajes);
	}

}
