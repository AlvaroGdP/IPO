package Presentation;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Dimension;

public class VentanaMensaje extends JPanel {
	private JScrollPane scrollPane;
	private JTextArea taMensaje;
	private JButton btnEnviarMensaje;

	/**
	 * Create the panel.
	 */
	public VentanaMensaje() {
		setPreferredSize(new Dimension(300, 280));
		setMinimumSize(new Dimension(300, 150));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		scrollPane = new JScrollPane();
		scrollPane.setMinimumSize(new Dimension(300, 300));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		add(scrollPane, gbc_scrollPane);
		
		taMensaje = new JTextArea();
		taMensaje.setMinimumSize(new Dimension(300, 300));
		taMensaje.setText("Escribe aquí tu mensaje");
		scrollPane.setViewportView(taMensaje);
		
		btnEnviarMensaje = new JButton("Enviar Mensaje");
		GridBagConstraints gbc_btnEnviarMensaje = new GridBagConstraints();
		gbc_btnEnviarMensaje.anchor = GridBagConstraints.EAST;
		gbc_btnEnviarMensaje.gridx = 1;
		gbc_btnEnviarMensaje.gridy = 1;
		add(btnEnviarMensaje, gbc_btnEnviarMensaje);

	}

}
