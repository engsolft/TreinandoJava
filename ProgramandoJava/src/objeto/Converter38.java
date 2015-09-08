package objeto;

import javax.swing.JOptionPane;

public class Converter38 {

	public static void main(String[] args) {
		int teste = Integer.parseInt("17");
		System.out.println(teste + teste);
		
		JOptionPane.showMessageDialog(null, teste);
		
		double teste2 = Double.parseDouble("3.5");
		System.out.println(teste2);
		
		JOptionPane.showMessageDialog(null, teste2);
		
		boolean teste3 = Boolean.parseBoolean("true");
		System.out.println(teste3);
		
		JOptionPane.showMessageDialog(null, teste3);
		
		String num = String.valueOf(4);
		System.out.println(num);
		
		JOptionPane.showMessageDialog(null, num);
		
	}

}
