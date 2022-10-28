/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fccalkulator;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Fccalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner scan = new Scanner(System.in);
        System.out.println("Перевод температуры по Цельсию (1)");
        System.out.println("Перевод температуры по Фарингейту(2)");
        int result = scan.nextInt();
       
        if (result == 1){       //из фпрингейта в цельсий
           
            System.out.println("Вы выбрали Перевод из Фаренгейта в Цельсий");
            System.out.println("Число по Фаренгейту: ");
            double value = scan.nextDouble();
            double valueFinal = (value - 32) * 5/9;
            System.out.print("Температура по Цельсию: ");
            System.out.println(Math.round(valueFinal*10.0)/10.0);
       
       
        }else if (result == 2){      //из цельсия в фарингейт
           
            System.out.println("Вы выбрали Перевод из Цельсия в Фарингейт");
            System.out.println("Число по Цельсию: ");
            double value2 = scan.nextDouble();
            double finalresult = value2 *1.8 + 32;
            System.out.print("Температура по Фарингейту: ");
            System.out.println(Math.round(finalresult *10.0)/10.0);
       
       
        }else {         // если не выбраны оба числа 1 или 2
           
            System.out.println("Не правильный выбор!");
            
           
        }
    }
    
}
