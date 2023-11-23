package ej0009;

import java.util.Scanner;

public class conversorRomano {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número (menor o igual que 1000): ");
        int num = scanner.nextInt();

        if (num <= 0 || num > 1000) {
            System.out.println("El número debe ser mayor que 0 y menor o igual que 1000.");
        } else {
            String numRomano = Romano(num);
            System.out.println("Número romano: " + numRomano);
        }

        scanner.close();
    }

    public static String Romano(int numero) {
        if (numero <= 0 || numero > 1000) {
            return "Número no válido";
        }

        String[] unidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] decenas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] centenas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

        int unidad = numero % 10;
        int decena = (numero / 10) % 10;
        int centena = (numero / 100) % 10;
        int mil = numero / 1000;

        String a = "M".repeat(mil) + centenas[centena] + decenas[decena] + unidades[unidad];
        return a;
    }

}
