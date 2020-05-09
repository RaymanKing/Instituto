package clases;

import java.util.ArrayList;

public class Profesor extends Persona {

	// Atributos
	
	ArrayList<String> asignaturas = new ArrayList<String>();
	ArrayList<Integer> horario = new ArrayList<Integer>();
	ArrayList<Integer> tutoria = new ArrayList<Integer>();

	// Constructor
	
	public Profesor() {
	}

	public Profesor(String nombre, String apellidos, String tipo, String dni, int telefono,
			ArrayList<String> asignaturas, ArrayList<Integer> horario, ArrayList<Integer> tutoria) {
		super(nombre, apellidos, tipo, dni, telefono);
		this.asignaturas = asignaturas;
		this.horario = horario;
		this.tutoria = tutoria;
	}
	
	// Métodos
	
	public void addAsignatura(String asignatura) {}
	
	public void addTutoria(int horaTutoria) {}
}
