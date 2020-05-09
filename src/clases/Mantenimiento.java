package clases;

import java.util.ArrayList;

public class Mantenimiento extends Persona {

	// Atributos

	ArrayList<String> funciones = new ArrayList<String>();
	ArrayList<Integer> horario = new ArrayList<Integer>();
	int salario;

	// Constructores

	public Mantenimiento() {
	}

	public Mantenimiento(String nombre, String apellidos, String tipo, String dni, int telefono,
			ArrayList<String> funciones, ArrayList<Integer> horario, int salario) {
		super(nombre, apellidos, tipo, dni, telefono);
		this.funciones = funciones;
		this.horario = horario;
		this.salario = salario;
	}
	
	// Métodos
	
	public void addFuncion(String funcon) {}
	public void deleteFuncion(String funcion) {}
}
