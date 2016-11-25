/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cycle;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author notebook
 */
public class Cycle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //задание 1
        int i = 1000;
        while (i <= 9999) {
            System.out.println(i);
            i = i + 3;
        }
        System.out.println("");

        //Задание 2
        int count = 1;
        i = -1;
        while (count <= 55) {
            i = i + 2;
            System.out.println(i);
            count = count + 1;
        }
        System.out.println("");

        //Задание 3
        i = 90;
        while (i > 0) {
            System.out.println(i);
            i = i - 5;
        }
        System.out.println("");

        //Задание 4
        count = 1;
        i = 1;
        while (count <= 20) {
            i = i * 2;
            System.out.println(i);
            count = count + 1;
        }
        System.out.println("");

        //Задание 5
        System.out.println("Введите число ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Факториал n=" + fact);
        System.out.println("");

        //Задание 6
        for (i = 1; i <= 50; i++) {
            System.out.println(2 * i - 1);
        }
        System.out.println("");

        //Задание 7
        i = 1;
        while (i <= 99) {
            System.out.println(i);
            i = i + 2;
        }
        System.out.println("");

        //Задание 8
        System.out.println("Введите число n");
        double n1 = sc.nextInt();
        System.out.println("Введите число x");
        double x = sc.nextInt();

        System.out.println("число x^n=" + pow(x, n1));
        System.out.println("");

        //Задание 9
        count = 1;
        i = 0;
        while (count <= 10) {
            System.out.println(i);
            i = i - 5;
            count = count + 1;
        }
        System.out.println("");

         //Задание 10
         
    }

}
