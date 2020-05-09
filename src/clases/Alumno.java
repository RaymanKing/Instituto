package clases;

import java.util.ArrayList;

public class Alumno extends Persona {
	
	// Atributos

	ArrayList<Integer> horario = new ArrayList<Integer>();
	ArrayList<Integer> notas = new ArrayList<Integer>();
	String tutor;

	// Constructores
	
	public Alumno() {
	}

	public Alumno(String nombre, String apellidos, String tipo, String dni, int telefono, ArrayList<Integer> horario,
			ArrayList<Integer> notas, String tutor) {

		super(nombre, apellidos, tipo, dni, telefono);
		this.horario = horario;
		this.notas = notas;
		this.tutor = tutor;
	}
	
	// Métodos
	
	public void addNota(ArrayList<Integer> notaExamen) {}
	
	public void changeHorario(ArrayList<Integer> horarioNuevo) {}
}
