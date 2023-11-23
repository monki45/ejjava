package tipoTriangulo;

import java.util.Scanner;

public class tipoTriangulo {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Escribe el valor de a: ");
        a = sc.nextInt();
        int b;
        System.out.print("Escribe el valor de b: ");
        b = sc.nextInt();
        int c;
        System.out.print("Escribe el valor de c: ");
        c = sc.nextInt();
        int a2 = a*a;
        int b2 = b*b;
        int c2 = c*c;
        if (a2 + b2 == c2) {
            System.out.println("Es un triángulo rectángulo.");
        } else if (a == b & a!=c | b==c & a!=c | a==c & a!=b) {
            System.out.println("Es un triángulo isósceles.");
        } else if (a == b & b == c) {
            System.out.println("Es un triángulo equilátero.");
        } else {
            System.out.println("Es un triángulo escaleno.");
        }
        sc.close();
    }

}
