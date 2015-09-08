package objeto;

public class Separar39 {

	public static void main(String[] args) {
		String nome = "Israel Tavares da Costa";
		String[] nomes = nome.split(" ",3);
		System.out.println(nomes[2]);	
		
		String nome1 = "IsraelsepararTavaresseparardasepararCosta";
		String[] nomes1 = nome1.split("separar");
		System.out.println(nomes1[1]);

		
	}

}
