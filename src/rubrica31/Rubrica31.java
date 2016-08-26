/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rubrica31;

import javax.swing.JOptionPane;

/**
 *
 * @author FACCI
 */
public class Rubrica31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int n1, n2,suma;
 
    n1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese primer numero"));
    n2= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese segundo numero"));
    suma=n1+n2;
    JOptionPane.showMessageDialog(null, suma); 
    }
    
}
