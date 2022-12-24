/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pe.edu.upeu.ej55;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Ej55 {
    
    Scanner lector=new Scanner (System.in);

    public Ej55(){
    
        String radio_esfera, mensaje;
        double radio_esferaAux, area_esfera, volumen_esfera;
        
        radio_esfera=JOptionPane.showInputDialog("Ingrese el radio de la esfera: ");
        radio_esferaAux=Double.parseDouble(radio_esfera);
        
        area_esfera= 4 * Math.PI * Math.pow (radio_esferaAux, 2);
        volumen_esfera= (4 * Math.PI * Math.pow (radio_esferaAux, 3))/3;
        
        
        mensaje=("El área de la esfera es: "+ area_esfera+"\n El volumen de la esfera es: "+ volumen_esfera);
        JOptionPane.showMessageDialog(null, mensaje);
}
    
    public static void main(String[] args) {
        Ej55 solucion = new Ej55();
    }
}
