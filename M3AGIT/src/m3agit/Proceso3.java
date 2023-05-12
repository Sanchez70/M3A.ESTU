/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3agit;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Joseline
 */
public class Proceso3 extends Thread {
String[] nom={"Desayuno","Almuerzo","Cena"};
private JLabel nombre;
public Proceso3(JLabel nombre){
    this.nombre = nombre;
}
    public void run(){
        int i=0;
        while(true){
            this.nombre.setText(nom[i]);
            //System.out.println(nom[i]+" "+i);
            i++;
            if(i==nom.length){
                i=0;
                Thread.yield();
                //System.out.println("entre al yield");
            }
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Proceso2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
