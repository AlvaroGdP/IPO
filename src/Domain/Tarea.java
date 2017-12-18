package Domain;

import java.util.ArrayList;

public class Tarea {

	String nombre;
	Usuario responsable;
	String fechaInicio;
	String fechaFin;
	int prioridad;
	int estado;
	String descripcion;
	ArrayList<Usuario> equipo;
	
	public Tarea(String nombre, Usuario responsable, String fechaInicio, String fechaFin, int prioridad, int estado,
			String descripcion, ArrayList<Usuario> equipo) {
		this.nombre = nombre;
		this.responsable = responsable;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.prioridad = prioridad;
		this.estado = estado;
		this.descripcion = descripcion;
		this.equipo = equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Usuario getResponsable() {
		return responsable;
	}

	public void setResponsable(Usuario responsable) {
		this.responsable = responsable;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ArrayList<Usuario> getEquipo() {
		return equipo;
	}

	public void setEquipo(ArrayList<Usuario> equipo) {
		this.equipo = equipo;
	}
	
}
