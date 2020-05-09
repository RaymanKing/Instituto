package clases;

public class Persona {

	// Atributos
	
	String nombre;
	String apellidos;
	String tipo;
	String dni;
	int telefono;
	
	// Constructores
	
	public Persona() {}
	public Persona(String nombre, String apellidos, String tipo, String dni, int telefono) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.tipo = tipo;
		this.dni = dni;
		this.telefono = telefono;
	}
	
	// Métodos
	
	public void addPersona(Persona persona) {}
	
	public void deletePersona(Persona persona) {}
	
}
