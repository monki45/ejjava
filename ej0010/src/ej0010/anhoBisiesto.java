package ej0010;

import java.util.Scanner;

public class anhoBisiesto {

	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingresa un año del que quieras saber si es bisiesto o no: ");
        int fecha =scanner.nextInt();
        if ((fecha%4==0&&fecha%100!=0) || (fecha%400==0)) {
            System.out.println(fecha+" Es un año bisiesto.");
        } else {
            System.out.println(fecha+" No es un año bisiesto.");
        }
        scanner.close();
    }

}
