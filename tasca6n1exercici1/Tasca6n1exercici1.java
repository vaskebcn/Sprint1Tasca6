package tasca6n1exercici1;

public class Tasca6n1exercici1 {

	public static void main(String[] args) {

		String name = "milos";
		String apellidos = "vasovic";
		String edad = "37";

		NoGenericMethods persona1 = new NoGenericMethods(name, apellidos, edad);
		NoGenericMethods persona2 = new NoGenericMethods(apellidos, edad, name);

		System.out.println(persona1.toString());
		System.out.println(persona2.toString());

	}

}
