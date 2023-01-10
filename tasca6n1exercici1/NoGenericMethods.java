package tasca6n1exercici1;

public class NoGenericMethods {
		
		private String nombre;
		private String apellidos;
		private String edad;
		
		
		public NoGenericMethods (String nombre, String apellidos, String edad) {
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


		public String getEdad() {
			return edad;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}


		public void setEdad(String edad) {
			this.edad = edad;
		}


		@Override
		public String toString() {
			return "NoGenericMethods [nombre=" + this.nombre + ", apellidos=" + this.apellidos + ", edad=" + this.edad + "]";
		}

				
	}

