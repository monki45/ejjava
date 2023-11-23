package ej0006;

import java.util.Scanner;

public class piramidePuntos {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num=sc.nextInt();
        sc.close();
        for (int valor = 0; valor<=num; valor++) {
            for (int espacio = 1; espacio <=num -valor; espacio++) {
                System.out.print(" ");
            }
            for (int asterisco = 1; asterisco <=(valor+1) ; ++asterisco) {
                System.out.print(" "+"*");
            }
            System.out.println();

        }

    }

}
