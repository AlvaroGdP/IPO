package Domain;

import java.util.ArrayList;

public class Proyecto extends Tarea{
	
	ArrayList<Tarea> tareas;
	
	public Proyecto(String nombre, Usuario responsable, String fechaInicio, String fechaFin, int prioridad, int estado,
			String descripcion, ArrayList<Usuario> equipo, ArrayList<Tarea> tareas) {
		super(nombre, responsable, fechaInicio, fechaFin, prioridad, estado, descripcion, equipo);
		this.tareas = tareas;
	}

	public ArrayList<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(ArrayList<Tarea> tareas) {
		this.tareas = tareas;
	}
	
	
	
}
