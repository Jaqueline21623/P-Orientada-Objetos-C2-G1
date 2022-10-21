/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pe.edu.upeu.app;

import javax.swing.JOptionPane;
import pe.edu.upeu.app.dao.ClienteDAO;
import pe.edu.upeu.app.dao.ClienteDaoI;
import pe.edu.upeu.app.gui.Login;
import pe.edu.upeu.app.modelo.ClienteTO;
import pe.edu.upeu.app.util.MsgBox;


/**
 *
 * @author DELL
 */
public class HeladosMauricio {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        new Login().setVisible(true);
        ClienteDaoI dao=new ClienteDAO();
        for (ClienteTO listarCliente : dao.listarClientes()) {
            System.out.println(""+listarCliente.getDniruc()+"\t"+listarCliente.nombres + listarCliente.tipo);
        }
            

}
}
