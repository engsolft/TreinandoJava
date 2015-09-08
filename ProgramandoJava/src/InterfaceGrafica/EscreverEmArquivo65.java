
package InterfaceGrafica;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class EscreverEmArquivo65 {
    
    public static void main (String[] args){
        
        Path caminho = Paths.get("C:/Users/Rael/desktop/Teste.txt");
        //String texto = "Vídeo Aula 65, obrigado por assistir";
        String texto = JOptionPane.showInputDialog("Digite o texto a ser escrito no bloco de notas");
        byte[] textoEmByte = texto.getBytes();
                
        try{
        Files.write(caminho, textoEmByte);
        
        }catch(Exception erro){
            
        }
    }
    
}
