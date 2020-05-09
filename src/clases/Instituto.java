package clases;

import java.util.ArrayList;

public class Instituto {
	
	// Atributos
	
	String nombre;
	ArrayList<String> modulos = new ArrayList<String>();
	int capacidad;
	
	// Constructor
	
	public Instituto() {}
	public Instituto(String nombre, ArrayList<String> modulos, int capacidad) {
		this.nombre = nombre;
		this.modulos = modulos;
		this.capacidad = capacidad;
	}
	
	
	// Metodos
	
	public void addModulo(String nombreModulo) {}
	
	public void changeName(String name) {}
	
	public void addCapacidad(int capacidadNueva) {}
	
}
