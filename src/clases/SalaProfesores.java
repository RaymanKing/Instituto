package clases;

public class SalaProfesores extends Estructura {

	// Atributos

	int capacidad;
	int maquinasExpendedoras;
	int mesas;

	// Constructores

	public SalaProfesores() {
	}

	public SalaProfesores(String name, String type, String used, int capacidad, int maquinasExpendedoras, int mesas) {
		super(name, type, used);
		this.capacidad = capacidad;
		this.maquinasExpendedoras = maquinasExpendedoras;
		this.mesas = mesas;
	}
	
	// Métodos
	
	public void addMesas(int mesasNuevas) {}
	public void addMaquinas(int maquinasNuevas) {}
}
