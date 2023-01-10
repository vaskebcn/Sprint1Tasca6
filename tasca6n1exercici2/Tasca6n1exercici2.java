package tasca6n1exercici2;

public class Tasca6n1exercici2 {

	public static void main(String[] args) {

		String str = "Hello World";
		int number = 103;
		Persona persona1 = new Persona("Milos", "Vasovic", 35);

		GenericMethods.methodd(str, persona1, number);
		GenericMethods.methodd(number, str, persona1);
		

	}

}
