package basico;

public class SwitchCase8 {

	public static void main(String[] args) {
		int diaDaSemana = 3;
		String nomeDoDia;
		
		switch (diaDaSemana){
		case 1: nomeDoDia = "Domingo";break;
		case 2: nomeDoDia = "Segunda";break;
		case 3: nomeDoDia = "Ter�a";break;
		case 4: nomeDoDia = "Quarta";break;
		case 5: nomeDoDia = "Quinta";break;
		case 6: nomeDoDia = "Sexta";break;
		case 7: nomeDoDia = "S�bado";break;
		
		default: nomeDoDia = "Dia INV�LIDO";break;		
		}
		
		System.out.println(nomeDoDia);

	}

}
