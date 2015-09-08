package objeto;

public class Estatic24 {

	public static void main(String[] args) {
		SalaDeAula24.professor = "Leo";
		
		SalaDeAula24 a1 = new SalaDeAula24();
		a1.aluno = "Rael";
		
		System.out.println(a1.professor);
		
		SalaDeAula24.ensinar();
		
		

	}

}
