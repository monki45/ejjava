package ej0008;

import java.util.Scanner;

public class numMayorMenorPar {

	public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int cantidad;
        System.out.print("Escriba cuántos números quieres: ");
        cantidad = n.nextInt();
        double[] valores = new double[cantidad];
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba " + cantidad + " números: ");
        for (int valor = 0; valor < cantidad; valor++) {
            valores[valor] = sc.nextDouble();
        }

        System.out.println("Valores almacenados: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Número " + (i + 1) + ": " + valores[i]);
        }

        double numMayor = valores[0];
        double numMenor = valores[0];
        for (int i = 1; i < cantidad; i++) {
            if (valores[i] > numMayor) {
                numMayor = valores[i];
            }
            if (valores[i] < numMenor) {
                numMenor = valores[i];
            }
        }

        System.out.println("Número mayor: " + numMayor);
        System.out.println("Número menor: " + numMenor);

        double sumPares = 0;
        int cantidadPares = 0;
        for (int i = 0; i < cantidad; i++) {
            if (valores[i] % 2 == 0) {
                sumPares += valores[i];
                cantidadPares++;
            }
        }

        if (cantidadPares > 0) {
            double mediaPares = sumPares / cantidadPares;
            System.out.println("Media de los números pares: " + mediaPares);
        } else {
            System.out.println("No se han introducido números pares.");
        }

        n.close();
        sc.close();
    }

}
