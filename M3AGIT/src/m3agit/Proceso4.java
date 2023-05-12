/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m3agit;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Santana
 */
public class Proceso4 extends Thread{
    private List<String> nombres;
    private List<Color> colores;
    private int index = 0;
    private JLabel label;

    public Proceso4(JLabel label) {
        this.label = label;
    }
    
    @Override
    public void run() {
               
        nombres = new ArrayList<>();
        nombres.add("Bryan Flores");
        nombres.add("Edisson León");
        nombres.add("Sebastian Medina");
        nombres.add("Carlos Oleas");
        nombres.add("Kevin Sanchez");
        
        colores = new ArrayList<>();
        colores.add(Color.RED);
        colores.add(Color.BLUE);
        colores.add(Color.GREEN);
        colores.add(Color.ORANGE);
        colores.add(Color.GRAY);
                
        Thread hilo = new Thread(() -> {
            while (true) {
                SwingUtilities.invokeLater(() -> {
                    label.setText(nombres.get(index));
                    label.setForeground(colores.get(index));
                });

                index = (index + 1) % nombres.size(); // Avanza al siguiente nombre y color en las listas

                try {
                    Thread.sleep(2000); // Pausa de 2 segundos
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        hilo.start();
    }
}   