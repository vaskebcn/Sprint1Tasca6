package tasca6n2exercici1;

public class Persona {

	private String nombre;
	private String apellidos;
	private int edad;

	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona: [nombre=" + this.nombre + ", apellidos=" + this.apellidos + ", edad=" + this.edad
				+ "]";
	}

}