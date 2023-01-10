package tasca6n2exercici1;

public class Tasca6n2exercici1 {

	public static void main(String[] args) {

		String str = "Hello World";
		int number = 103;
		Persona persona1 = new Persona("Milos", "Vasovic", 35);

		
		GenericAndNoGenericMethods.methodd(str, persona1, number);
		GenericAndNoGenericMethods.methodd(persona1, str, number);
		

	}

}
