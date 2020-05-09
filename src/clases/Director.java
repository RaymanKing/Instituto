package clases;

import java.util.ArrayList;

public class Director extends Persona {

	// Atributos

	ArrayList<String> funciones = new ArrayList<String>();
	int yearsOfCargue;

	// Constructores

	public Director() {
	}

	public Director(String nombre, String apellidos, String tipo, String dni, int telefono, ArrayList<String> funciones,
			int yearsOfCargue) {
		super(nombre, apellidos, tipo, dni, telefono);
		this.funciones = funciones;
		this.yearsOfCargue = yearsOfCargue;
	}

	// Métodos

	public void addFunctions(String funcion) {
	}

	public void deleteFunctions(String funcion) {
	}
	
}
