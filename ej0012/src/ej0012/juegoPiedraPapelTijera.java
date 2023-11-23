package ej0012;

import java.util.Scanner;
import java.util.Random;

public class juegoPiedraPapelTijera {

	public static void main(String[] args) {
        int contadorP1 = 0;
        int contadorPC = 0;

        while (contadorP1 < 3 && contadorPC < 3) {
            Random random = new Random();
            int jugadaPC = random.nextInt(3) + 1;
            Scanner sc = new Scanner(System.in);
            int jugadaP1;
            System.out.println("Elija su arma: (Piedra[1], Papel[2], Tijera[3])");
            jugadaP1 = sc.nextInt();

            if (jugadaP1 == 1 && jugadaPC == 2 || jugadaP1 == 2 && jugadaPC == 3 || jugadaP1 == 3 && jugadaPC == 1) {
                System.out.println("Ha ganado el PC");
                contadorPC++;
            } else if (jugadaP1 == 2 && jugadaPC == 1 || jugadaP1 == 1 && jugadaPC == 3 || jugadaP1 == 3 && jugadaPC == 2) {
                System.out.println("Ha ganado el P1");
                contadorP1++;
            } else {
                System.out.println("Empate");
            }

            System.out.println("Contador P1: " + contadorP1);
            System.out.println("Contador PC: " + contadorPC);


        }
        System.out.println("¡Juego terminado!");

    }

}
