package contadorDinero;

import java.util.Scanner;

public class contadorDinero {

	public static void main(String[] args) {
        int cant500 = 0;
        int cant200 = 0;
        int cant100 = 0;
        int cant50 = 0;
        int cant20 = 0;
        int cant10 = 0;
        int cant5 = 0;
        int cant2 = 0;
        int cant1 = 0;

        Scanner sc = new Scanner(System.in);
        int dinero;
        System.out.print("Introduce la cantidad: ");
        dinero = sc.nextInt();

        while (dinero > 0) {
            if (dinero >= 500) {
                cant500++;
                dinero -= 500;
            } else if (dinero >= 200) {
                cant200++;
                dinero -= 200;
            } else if (dinero >= 100) {
                cant100++;
                dinero -= 100;
            } else if (dinero >= 50) {
                cant50++;
                dinero -= 50;
            } else if (dinero >= 20) {
                cant20++;
                dinero -= 20;
            } else if (dinero >= 10) {
                cant10++;
                dinero -= 10;
            } else if (dinero >= 5) {
                cant5++;
                dinero -= 5;
            } else if (dinero >= 2) {
                cant2++;
                dinero -= 2;
            } else if (dinero >= 1) {
                cant1++;
                dinero -= 1;
            }
        }

        System.out.println("Desglose:");
        System.out.println("Billetes de 500€: " + cant500);
        System.out.println("Billetes de 200€: " + cant200);
        System.out.println("Billetes de 100€: " + cant100);
        System.out.println("Billetes de 50€: " + cant50);
        System.out.println("Billetes de 20€: " + cant20);
        System.out.println("Billetes de 10€: " + cant10);
        System.out.println("Billetes de 5€: " + cant5);
        System.out.println("Monedas de 2€: " + cant2);
        System.out.println("Monedas de 1€: " + cant1);

        sc.close();
    }

}
