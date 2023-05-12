/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3agit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Joseline
 */
public class Proceso1 extends Thread{
    private JLabel tiempo;
    
    public Proceso1(JLabel tiempo){
        this.tiempo = tiempo;
    }
    @Override
    public void run(){
        while(true){
            Calendar tiempo = Calendar.getInstance();
            int hora = tiempo.get(Calendar.HOUR);
            int minutos = tiempo.get(Calendar.MINUTE);
            int segundos = tiempo.get(Calendar.SECOND);
            String total = hora+": "+minutos+": "+segundos;
            this.tiempo.setText(total);
            
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("ERROR");
            }
            
        }
    }
}
