/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rubrica31;

import java.util.Scanner;
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
       int precio = 0;
   
       System.out.println("Escribe el precio");
      
          if (precio > 100){
           precio = (int) (precio + (precio *0.15));
        }
       System.out.println("El precio total es: "+precio);
            
  
    }
    
}
