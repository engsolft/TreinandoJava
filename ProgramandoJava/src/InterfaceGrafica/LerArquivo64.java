
package InterfaceGrafica;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class LerArquivo64 {
    
    public static void main (String[] args){
        
        Path caminho = Paths.get("C:/Users/Rael/desktop/Rastreando.txt");
        
        try{            
        byte[] texto = Files.readAllBytes(caminho);
        String leitura = new String(texto);
        
        JOptionPane.showMessageDialog(null, leitura);
        
        
    }catch(Exception erro){
        
    }
    
}
    
}
