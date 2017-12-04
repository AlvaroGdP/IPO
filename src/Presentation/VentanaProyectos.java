package Presentation;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaProyectos extends JPanel {
	private JButton btnAnadirProyecto;
	private JButton btnAnadirTatea;
	private JButton btnBorrar;
	private JScrollPane scrollPane;
	private JTree tree;

	/**
	 * Create the panel.
	 */
	public VentanaProyectos() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 67, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		add(scrollPane, gbc_scrollPane);
		
		tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Proyectos") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("Proyecto_1");
						node_1.add(new DefaultMutableTreeNode("Tarea_1"));
						node_1.add(new DefaultMutableTreeNode("Tarea_2"));
						node_1.add(new DefaultMutableTreeNode("Tarea_3"));
						node_1.add(new DefaultMutableTreeNode("Tarea_4"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("Proyecto_2");
						node_1.add(new DefaultMutableTreeNode("Tarea_1"));
						node_1.add(new DefaultMutableTreeNode("Tarea_2"));
						node_1.add(new DefaultMutableTreeNode("Tarea_3"));
					add(node_1);
				}
			}
		));
		scrollPane.setViewportView(tree);
		
		btnAnadirProyecto = new JButton("Añadir Proyecto");
		GridBagConstraints gbc_btnAnadirProyecto = new GridBagConstraints();
		gbc_btnAnadirProyecto.gridwidth = 2;
		gbc_btnAnadirProyecto.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnadirProyecto.gridx = 0;
		gbc_btnAnadirProyecto.gridy = 1;
		add(btnAnadirProyecto, gbc_btnAnadirProyecto);
		
		btnAnadirTatea = new JButton("Añadir Tarea");
		btnAnadirTatea.addActionListener(new BtnAnadirTateaActionListener());
		GridBagConstraints gbc_btnAnadirTatea = new GridBagConstraints();
		gbc_btnAnadirTatea.anchor = GridBagConstraints.WEST;
		gbc_btnAnadirTatea.gridwidth = 3;
		gbc_btnAnadirTatea.insets = new Insets(0, 0, 5, 0);
		gbc_btnAnadirTatea.gridx = 2;
		gbc_btnAnadirTatea.gridy = 1;
		add(btnAnadirTatea, gbc_btnAnadirTatea);
		
		btnBorrar = new JButton("Borrar");
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.gridwidth = 5;
		gbc_btnBorrar.insets = new Insets(0, 0, 0, 5);
		gbc_btnBorrar.gridx = 0;
		gbc_btnBorrar.gridy = 2;
		add(btnBorrar, gbc_btnBorrar);

	}

	private class BtnAnadirTateaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}
}
