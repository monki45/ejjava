package precioUva;

import java.util.Scanner;

public class precioUva {

	public static void main(String[] args) {
        String tipo;
        Scanner sc = new Scanner (System.in);
        System.out.print("Indica el precio del kilo: ");
        double precio = sc.nextInt();
        System.out.print("Indica cuantos kilos quiere vender: ");
        int peso = sc.nextInt();
        System.out.println("¿De que tipo es la uva?");
        tipo = sc.next();
        System.out.println("¿De que tamaño es la uva?");
        int tamanho = sc.nextInt();


        if (tipo.equals("A"))
        {
            if (tamanho == 1)
            {
                precio = precio + 0.20;
            }
            else if (tamanho == 2)
            {
                precio = precio + 0.30;
            }
        }
        if (tipo.equals("B"))
        {
            if (tamanho == 1)
            {
                precio = precio - 0.30;
            }
            else if (tamanho == 2)
            {
                precio = precio - 0.50;
            }
        }
        sc.close();
        System.out.println("El precio para la Uva de tipo " + tipo + " y tamaño " + tamanho + " es " + precio * peso);
    }

}
