package clases;

public class Clases extends Estructura{

	// Atributos
	
	int capacidad;
	int numberClass;
	
	// Constructores
	
	public Clases() {}
	public Clases(String name, String type, String used, int capacidad, int numberClass) {
		super(name, type, used);
		this.capacidad = capacidad;
		this.numberClass = numberClass;
	}
	
	// Métodos
	
	public void addClases(Clases clase) {}
	public void deleteClases(Clases clase) {}
}
