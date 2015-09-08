package objeto;

public class Sobrecarga23 {
	
	int somar(int num1, int num2){
		return num1 + num2;
	}
	
	int somar(int num1, int num2, int num3){
		return num1 + num2 + num3;
	}

	public static void main(String[] args) {
		Sobrecarga23 objeto = new Sobrecarga23();
		
		int soma = objeto.somar(10, 20);
		System.out.println(soma);

	}

}
