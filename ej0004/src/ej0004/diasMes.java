package ej0004;

import java.util.Scanner;

public class diasMes {

	public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un mes: ");
        String mes = sc.nextLine();
        System.out.println(mes);

        if (mes.equals("Enero") || mes.equals("Marzo") || mes.equals("Mayo") || mes.equals("Julio") || mes.equals("Agosto") || mes.equals("Octubre") || mes.equals("Diciembre")) {
            System.out.println(mes + " tiene 31 días");
        } else if (mes.equals("Abril") || mes.equals("Junio") || mes.equals("Septiembre") || mes.equals("Noviembre")) {
            System.out.println(mes + " tiene 30 días");
        } else if (mes.equals("Febrero")) {
            System.out.println(mes + " tiene 28 días");
        } else {
            System.out.println("No es un mes");
        }
        sc.close();
    }

}
