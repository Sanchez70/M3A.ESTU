/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3agit;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

/**
 *
 * @author Joseline
 */
public class Progress extends Thread {
    private boolean vida;
    private int prog;
    private JProgressBar barra;
    
    public Progress(JProgressBar barra){
        this.barra = barra;
        this.vida = true;
        this.prog = 0;
        
    }
    
    @Override
    public void run(){
        while(vida==true){
            
                System.out.println("Corriendo "+this.prog);
                this.barra.setVisible(true);
                this.prog++;
                this.barra.setValue(this.prog);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Progress.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            
            if(this.prog==100){
                vida=false;
                System.out.println("Terminado");
            }
        }
    }
}
