package objeto;

public class SobrecEmConstr {
	
	String nome;
	int idade;

	SobrecEmConstr(String nome) {
		this.nome = nome;
	}
	
	SobrecEmConstr(String nome, int idade) {
		this(nome);
		this.idade = idade;
	}
	
	public static void main(String[] args) {
		SobrecEmConstr sc = new SobrecEmConstr("Alex", 35);

	}

}
