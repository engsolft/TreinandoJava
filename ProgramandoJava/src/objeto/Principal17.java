package objeto;

public class Principal17 {
	
	//#20 Métodos com N parâmetros 
	int somarNumeros(int ... numeros){
		int soma = 0;
		for(int n : numeros){
			soma += n;			
		}
		return soma;
	}

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		
		//Métodos Simples
		p.dormir();
		
		//Métodos com Retorno
		System.out.println(p.apresentar());
		
		//Métodos com Parâmetros
		p.mostrarNome("Carlos");
		
		//Métodos com parâmetros e com retorno: Calculando Idade
		int idade = p.calcularIdade(1986, 2015);		
		System.out.println(idade);
		
		//Parâmetros Idefinidos
		Principal17 teste = new Principal17();
		int soma = teste.somarNumeros(12,12);
		
		System.out.println(soma);
		
	}

}
