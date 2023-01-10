package tasca6n2exercici2;

public class Tasca6n2exercici2 {

	public static void main(String[] args) {

		String str = "Hello World";
		int number = 103;
		Persona persona1 = new Persona("Milos", "Vasovic", 35);

		String stringArray[] = { "marc", "leo", "sara", "laia" };

		Methods.methodd(str, persona1, number, stringArray);
		Methods.methodd(persona1, str, number, stringArray);

	}

}
