package objeto;

public class Principal17 {
	
	//#20 M�todos com N par�metros 
	int somarNumeros(int ... numeros){
		int soma = 0;
		for(int n : numeros){
			soma += n;			
		}
		return soma;
	}

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		
		//M�todos Simples
		p.dormir();
		
		//M�todos com Retorno
		System.out.println(p.apresentar());
		
		//M�todos com Par�metros
		p.mostrarNome("Carlos");
		
		//M�todos com par�metros e com retorno: Calculando Idade
		int idade = p.calcularIdade(1986, 2015);		
		System.out.println(idade);
		
		//Par�metros Idefinidos
		Principal17 teste = new Principal17();
		int soma = teste.somarNumeros(12,12);
		
		System.out.println(soma);
		
	}

}
