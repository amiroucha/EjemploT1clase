package org.example;

import java.util.Scanner;

public class Lector {

    public static void main(String[] args) {
        System.out.println("Soy lector");
        Scanner entrada = new Scanner(System.in);
        int n;
        try {
            for (int i = 0; i <= 9; i++) {

                n = Integer.parseInt(entrada.nextLine()) ;


            }
        }catch (Exception e)
        {
            System.out.println("No es un numero");
        }
    }

}
