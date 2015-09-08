package objeto;

public class Pessoa {
	String nome;
	int idade;
	

	//#22 this
	Pessoa(String nome, int i){
		this.nome = nome;
		this.idade = i;
	}
	
	Pessoa(){
		
	}
	
	void dormir(){
		System.out.println("ZZZzzzzZzZz");
	}
	
	String apresentar(){
		return "Prazer, meu nome é " + nome;
	}
	
	void mostrarNome(String nome1){
		System.out.println("Nome é: "+ nome1);
	}
	
	int calcularIdade(int nascimento, int atual){
		return atual - nascimento;
		
	}
	
	
	

}
