/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pe.edu.upeu;

import pe.edu.upeu.facade.CheckFacade;

/**
 *
 * @author DELL
 */
public class Facade {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        CheckFacade cliente1 = new CheckFacade();
        cliente1.buscar("28/12/2022", "05/01/2023", "Juliaca", "Lima");
        
        CheckFacade cliente2 = new CheckFacade();
        cliente2.buscar("24/12/2022", "02/01/2023", "Juliaca", "Cusco");
    }
}
