package ej0011;

import java.util.Scanner;
import java.util.Random;

public class adivinaNum {

	public static void main(String[] args) {

        int rango;
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba el máximo número posible (de 1 a ...): ");
        rango = sc.nextInt();

        int intento;
        System.out.print("Escribe el número de intentos: ");
        intento = sc.nextInt();
        int x = intento;

        Random numRand = new Random();
        int valorDado = numRand.nextInt(rango)+1;

        for (int i = 1; i <= x; i++) {
            int opcion;
            System.out.print("Intento nº" +i +": Adivina el número ");
            opcion = sc.nextInt();
            System.out.println(opcion);
            if (opcion < valorDado)
            {
                System.out.println("El número es más grande...");
            }
            else if (opcion > valorDado)
            {
                System.out.println("El número es más pequeño...");
            }
            else if (opcion == valorDado)
            {
                System.out.println("Enhorabuena!! Has acertado!!");
            } else
            {
                System.out.println("No lo has adivinado, el número era el: " + valorDado);
            }
        }
        sc.close();
    }

}
