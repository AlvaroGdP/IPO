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
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;

import Domain.Proyecto;
import Domain.Tarea;
import Domain.Usuario;
import Hardcode.Hardcode;

import Presentation.VentanaInfo;

import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeModelListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.ImageIcon;

public class VentanaProyectos extends JPanel {
	private JButton btnAnadirProyecto;
	private JButton btnAnadirTatea;
	private JButton btnBorrar;
	private JScrollPane scrollPane;
	private JTree tree;

	private JPanel pnlInfo;
	private Hardcode hc;
	
	/**
	 * Create the panel.
	 */
	public VentanaProyectos(Hardcode hc, JPanel pnlInfo) {
		this.pnlInfo = pnlInfo;
		this.hc = hc;
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
		
		createTree();
		
		btnAnadirProyecto = new JButton("Proyecto");
		btnAnadirProyecto.setIcon(new ImageIcon(VentanaProyectos.class.getResource("/Presentation/carpeta.png")));
		btnAnadirProyecto.addActionListener(new BtnAnadirProyectoActionListener());
		GridBagConstraints gbc_btnAnadirProyecto = new GridBagConstraints();
		gbc_btnAnadirProyecto.gridwidth = 2;
		gbc_btnAnadirProyecto.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnadirProyecto.gridx = 0;
		gbc_btnAnadirProyecto.gridy = 1;
		add(btnAnadirProyecto, gbc_btnAnadirProyecto);
		
		btnAnadirTatea = new JButton("Tarea");
		btnAnadirTatea.setIcon(new ImageIcon(VentanaProyectos.class.getResource("/Presentation/tarea.png")));
		btnAnadirTatea.addActionListener(new BtnAnadirTareaActionListener());
		GridBagConstraints gbc_btnAnadirTatea = new GridBagConstraints();
		gbc_btnAnadirTatea.anchor = GridBagConstraints.WEST;
		gbc_btnAnadirTatea.gridwidth = 3;
		gbc_btnAnadirTatea.insets = new Insets(0, 0, 5, 0);
		gbc_btnAnadirTatea.gridx = 2;
		gbc_btnAnadirTatea.gridy = 1;
		add(btnAnadirTatea, gbc_btnAnadirTatea);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setIcon(new ImageIcon(VentanaProyectos.class.getResource("/Presentation/cubo-de-basura.png")));
		btnBorrar.addActionListener(new BtnBorrarActionListener());
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.gridwidth = 5;
		gbc_btnBorrar.insets = new Insets(0, 0, 0, 5);
		gbc_btnBorrar.gridx = 0;
		gbc_btnBorrar.gridy = 2;
		add(btnBorrar, gbc_btnBorrar);
		
		
		

	}

	
	
	private class BtnAnadirTareaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			String padre = (tree.getLastSelectedPathComponent()).toString();
			ArrayList<Usuario> equipotareanuevo = new ArrayList();
			Tarea nueva = new Tarea("Nueva Tarea", hc.listaUsuarios.get(1), Integer.toString(Calendar.DATE), " ", 2, 2, " ", equipotareanuevo);
			for (int i=0; i<hc.listaProyectos.size(); i++) {
				if (padre.equals(hc.listaProyectos.get(i).getNombre())){
					hc.listaProyectos.get(i).getTareas().add(nueva);
					
				}
			}
			
			
			DefaultMutableTreeNode nodo = (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
			DefaultTreeModel mdl= (DefaultTreeModel)tree.getModel();
			DefaultMutableTreeNode child = new DefaultMutableTreeNode("Nueva tarea");
			
			mdl.insertNodeInto(child, nodo, nodo.getChildCount());
			
			
		}
	}
	
	private class TreeTreeSelectionListener implements TreeSelectionListener{
		public void valueChanged(TreeSelectionEvent e) {
			if (!tree.isSelectionEmpty()) {
				
				
				
				String nodo = (e.getPath().getLastPathComponent()).toString();
				for (int i=0; i<hc.listaProyectos.size(); i++) {
					if (nodo.equals(hc.listaProyectos.get(i).getNombre())){
						((VentanaInfo) pnlInfo).updateValues(hc.listaProyectos.get(i));
						return;
					}
					for (int j=0; j<hc.listaProyectos.get(i).getTareas().size(); j++) {
						
						if (nodo.equals(hc.listaProyectos.get(i).getTareas().get(j).getNombre())) {
							((VentanaInfo) pnlInfo).updateValues(hc.listaProyectos.get(i).getTareas().get(j));
						}
					}
				}
				
			}
		}
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private class BtnAnadirProyectoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		
			ArrayList<Usuario> equipoproyectonuevo = new ArrayList();
			ArrayList<Tarea> listaTareasnueva = new ArrayList();
			Tarea nueva = new Tarea("Nueva Tarea", hc.listaUsuarios.get(1), Integer.toString(Calendar.DATE), " ", 2, 2, " ", equipoproyectonuevo);
			listaTareasnueva.add(nueva);
			Proyecto nuevo = new Proyecto("Nuevo Proyecto", hc.listaUsuarios.get(0), Integer.toString(Calendar.DATE), " ", 2, 2, " ", equipoproyectonuevo, listaTareasnueva);
			
			
			hc.listaProyectos.add(nuevo);
			
			DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
			DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();

			DefaultMutableTreeNode newProject = new DefaultMutableTreeNode("Nuevo Proyecto");

			DefaultMutableTreeNode child = new DefaultMutableTreeNode("Nueva tarea");
			newProject.add(child);
			
			model.insertNodeInto(newProject, root, root.getChildCount());
			
			
		}
	}	
	private class BtnBorrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			DefaultMutableTreeNode nodo = (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
			DefaultTreeModel mdl= (DefaultTreeModel)tree.getModel();
			
			
			Confirmacion confirmacion = new Confirmacion();
				
			mdl.removeNodeFromParent(nodo);
			
			
		}
	}
	
	
	
	
	
	public void createTree() {
		tree = new JTree();
		tree.addTreeSelectionListener(new TreeTreeSelectionListener());
		tree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Proyectos") {
				{
					DefaultMutableTreeNode node_1;
					for (int i=0; i<hc.listaProyectos.size();i++) {
						node_1 = new DefaultMutableTreeNode(hc.listaProyectos.get(i).getNombre());
						for (int j=0; j<hc.listaProyectos.get(i).getTareas().size(); j++) {
							node_1.add(new DefaultMutableTreeNode (hc.listaProyectos.get(i).getTareas().get(j).getNombre()));
						}
						add(node_1);
					}
				}
			}
		));
		scrollPane.setViewportView(tree);
	}
	
	
}
