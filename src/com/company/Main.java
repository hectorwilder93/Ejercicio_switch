package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int numero = 0;
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Introduce un numero");
            numero = leer.nextInt();
        }

        switch (numero){
            case 1:
                System.out.println("Otoño");
                break;

            case 2:
                System.out.println("Otoño");
                break;

            case 3:
                System.out.println("Otoño");
                break;

            case 4:
                System.out.println("Invierno");
                break;

            case 5:
                System.out.println("Invierno");
                break;

            case 6:
                System.out.println("Invierno");
                break;

            case 7:
                System.out.println("Primavera");
                break;

            case 8:
                System.out.println("Primavera");
                break;

            case 9:
                System.out.println("Primavera");
                break;

            case 10:
                System.out.println("Verano");
                break;

            case 11:
                System.out.println("Verano");
                break;

            case 12:
                System.out.println("Verano");
                break;

            default:
                System.out.println("Esto no es un numero válido");
                break;


        }

        System.out.println("Fin del programa");

    }
}








