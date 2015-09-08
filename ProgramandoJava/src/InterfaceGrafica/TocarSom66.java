
package InterfaceGrafica;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TocarSom66 extends JFrame {
    
    JButton tocar = new JButton("Voz");
    
    public TocarSom66(){
        
        setTitle("JLabel na Tela");
	setSize(500,400);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setVisible(true);
        
        add(tocar);
        
        tocar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                play("SejaOCentro");
            }
        });
    }
    
    public void play(String nomeAudio){
        URL url = TocarSom66.class.getResource(nomeAudio+".mp3");
        AudioClip audio = Applet.newAudioClip(url);
        audio.play();       
    }
    
    public static void main (String[] args){
        new TocarSom66();       
    }
}
