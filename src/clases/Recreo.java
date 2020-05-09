package clases;

import java.util.ArrayList;

public class Recreo extends Estructura {

	// Atributos

	int capacidad;
	ArrayList<String> zonas = new ArrayList<String>();

	// Constructores

	public Recreo() {
	}

	public Recreo(String name, String type, String used, int capacidad, ArrayList<String> zonas) {
		super(name, type, used);
		this.capacidad = capacidad;
		this.zonas = zonas;
	}
	
	// Métodos
	
	public void addZonas(String zonaNueva) {}
}
