package objeto;

public class Alterar40 {

	public static void main(String[] args) {
		String  frase = "Brasil vai ganhar a copa";
		String nova = frase.replace(" ", "_");
		
		System.out.println(nova);
		
		String  frase1 = "Brasil vai ganhar a copa";
		String nova1 = frase1.replaceFirst("s", "z");
		
		System.out.println(nova1);		
		
		

	}

}
