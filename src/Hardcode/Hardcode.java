package Hardcode;

import java.util.ArrayList;

import Domain.Proyecto;
import Domain.Tarea;
import Domain.Usuario;

public class Hardcode {

	public  ArrayList<Usuario> listaUsuarios;
	
	public ArrayList<Usuario> equipotarea1;
	public ArrayList<Usuario> equipotarea2;
	public ArrayList<Usuario> equipotarea3;
	public ArrayList<Usuario> equipotarea4;
	
	public ArrayList<Usuario> equipotarea5;
	public ArrayList<Usuario> equipotarea6;
	public ArrayList<Usuario> equipotarea7;
	public ArrayList<Usuario> equipotarea8;
	

	public ArrayList<Usuario> equipoproyecto1;
	public ArrayList<Usuario> equipoproyecto2;
	
	public ArrayList<Proyecto> listaProyectos;
	
	public Hardcode() {
		initialize();
	}
	
	public void initialize() {
		
		//Crear Usuarios
		Usuario user1 = new Usuario("Alvaro Guerrero del Pozo", "Alvaro", "ipo1", "123456789", "alvaroguerrero@email.com", "C/ Verdadera 7", null, "20/10/2017");
		Usuario user2 = new Usuario("Manuel Hurtado Lillo", "Manuel", "ipo2", "987654321","manuelhurtado@email.com", "C/ No tanto 12", null, "12/11/2017");
		Usuario user3 = new Usuario("Ana Isabel Molina", "Ana", "ipo3", "112233445","anaisabel@email.com", "C/ ESI 27", null, "16/12/2017");
		Usuario user4 = new Usuario("Fulanito de Tal", "Fulanito", "ipo4", "135792468","fulanito@email.com", "C/ Original 10", null, "8/9/2017");
		
		listaUsuarios= new ArrayList();
		listaUsuarios.add(user1);
		listaUsuarios.add(user2);
		listaUsuarios.add(user3);
		listaUsuarios.add(user4);
		
		//Crear equipos
		equipotarea1 = new ArrayList();
		equipotarea1.add(user1);
		equipotarea1.add(user2);

		equipotarea2 = new ArrayList();
		equipotarea2.add(user1);
		equipotarea2.add(user3);
		
		equipotarea3 = new ArrayList();
		equipotarea3.add(user2);
		equipotarea3.add(user3);
		
		equipotarea4 = new ArrayList();
		equipotarea4.add(user1);
		equipotarea4.add(user2);
		equipotarea4.add(user3);
		
		equipotarea5 = new ArrayList();
		equipotarea5.add(user1);
		equipotarea5.add(user2);

		equipotarea6 = new ArrayList();
		equipotarea6.add(user1);
		equipotarea6.add(user3);
		
		equipotarea7 = new ArrayList();
		equipotarea7.add(user2);
		equipotarea7.add(user3);
		
		equipotarea8 = new ArrayList();
		equipotarea8.add(user1);
		equipotarea8.add(user2);
		equipotarea8.add(user3);
		
		equipoproyecto1 = new ArrayList();
		equipoproyecto1.add(user1);
		equipoproyecto1.add(user2);
		equipoproyecto1.add(user3);
		
		equipoproyecto2 = new ArrayList();
		equipoproyecto2.add(user1);
		equipoproyecto2.add(user2);
		equipoproyecto2.add(user3);
		
		//Crear Tareas
		Tarea tarea1 = new Tarea("Hito1", user1, "10/10/2017", "11/11/2017", 2, 2, "Tarea cerada para la parte central el Hito 1", equipotarea1);
		Tarea tarea2 = new Tarea("Revisión Hito1", user3, "30/10/2017", "1/11/2017", 1, 0, "Correción del Hito 1", equipotarea2);
		Tarea tarea3 = new Tarea("Hito1 Memoria", user2, "2/11/2017", "20/11/2017", 2, 1, "Crear Memoria del Hito1 ", equipotarea1);
		Tarea tarea4 = new Tarea("Entrega Memoria Hito1", user2, "21/11/2017", "22/11/2017", 0, 1, "Entregar Memoria del Hito 1", equipotarea3);
		

		Tarea tarea21 = new Tarea("Hito2", user1, "25/11/2017", "10/12/2017", 2, 0, "Segunda entrega ipo2: Prototipo", equipotarea1);
		Tarea tarea22 = new Tarea("Revisión Hito2", user3, "10/12/2017", "12/12/2017", 1, 2, "Correción Hito 2", equipotarea2);
		Tarea tarea23 = new Tarea("Hito2 Memoria", user2, "13/12/2017", "22/12/2017", 2, 1, "Crear Memoria Hito2 ", equipotarea1);
		Tarea tarea24 = new Tarea("Entrega Memoria Hito2", user2, "25/11/2017", "27/12/2017", 0, 2, "Entregar Memoria Hito2", equipotarea3);
		
		//Crear Lista de Tareas
		ArrayList<Tarea> listaTareas1 = new ArrayList();
		listaTareas1.add(tarea1);
		listaTareas1.add(tarea2);
		listaTareas1.add(tarea3);
		listaTareas1.add(tarea4);
		
		ArrayList<Tarea> listaTareas2 = new ArrayList();
		listaTareas2.add(tarea21);
		listaTareas2.add(tarea22);
		listaTareas2.add(tarea23);
		listaTareas2.add(tarea24);
		
		//Crear Proyectos
		
		
		Proyecto proyecto1 = new Proyecto("Proyecto Hito1", user2, "10/10/2017", "23/11/2017", 2, 2, "Proyecto creado para almacenar\nlas tareas necesarias para el hito 1", equipoproyecto1, listaTareas1);
		Proyecto proyecto2 = new Proyecto("Proyecto Hito2", user1, "25/11/2017", "28/12/2017", 1, 2, "Proyecto creado para almacenar\nlas tareas necesarias para el hito 2", equipoproyecto2, listaTareas2);
		
		listaProyectos = new ArrayList();
		listaProyectos.add(proyecto1);
		listaProyectos.add(proyecto2);
		
		
	}
	
	
	
}
