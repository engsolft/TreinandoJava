package basico;

public class OpLogicos14 {

	public static void main(String[] args) {
		//  &&  ||   !
		int idade = 18;
		boolean temCarteira=false;
		
		if (idade >= 18 || temCarteira == true){
			System.out.println("Pode dirigir");
		}else{
				System.out.println("Não pode dirigir");
		}
		
		if (true){
			System.out.println("Pode dirigir");
		}else{
				System.out.println("Não pode dirigir");
		}
}
}
