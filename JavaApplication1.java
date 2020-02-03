/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      double bil1;
        double bil2;
        
     Scanner angka = new Scanner (System.in);
        System.out.print("Masukkan bil 1 = ");
     double a = angka.nextInt();
        System.out.print("Masukkan bil 2 = ");
        double b = angka.nextInt();
        
           bil1 = a + b;
           System.out.println(" penjumlahan "+a+" + "+b+" = "+bil1);
            
           bil1 = a - b;
           System.out.println(" pengurangan "+a+" - "+b+" = "+bil1);
           
           bil1 = a * b;
           System.out.println(" perkalian"+a+" x "+b+" = "+bil1);
         
           bil2 = a / b;
           System.out.println(" pembagian"+a+" : "+b+" = "+bil2);
        }
    }
    
