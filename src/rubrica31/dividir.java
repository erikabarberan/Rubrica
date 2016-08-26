/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rubrica31;

import java.util.Scanner;

/**
 *
 * @author FACCI
 */
public class dividir {
    public static void main(String[] args) {
        // TODO code application logic here

      int sum = 0, firstNumber, secondNumber;
      Scanner inputNumScanner = new Scanner(System.in);
      System.out.println("Enter First Number: ");
      firstNumber = inputNumScanner.nextInt();
 
      System.out.println("Enter Second Number: ");
      secondNumber = inputNumScanner.nextInt();
 
      sum = firstNumber / secondNumber;
      
      System.out.println("The sum of the two numbers you entered = " + sum);
      
      
      
    }
    
}
