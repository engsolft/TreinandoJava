package objeto;

public class Teste30 {

	public static void barulho(Animal30 animal){
		animal.fazerBarulho();
	}
	
	
	public static void main(String[] args) {
		Cachorro30 c = new Cachorro30();
		c.fazerBarulho();
		
		Galinha30 gal = new Galinha30();
		gal.fazerBarulho();
		
		barulho(gal);
		
		
		
		

	}

}
