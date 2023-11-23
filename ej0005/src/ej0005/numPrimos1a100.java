package ej0005;

public class numPrimos1a100 {

	public static void main(String[] args) {

        boolean encontrado;
        int valor;
        int contador=2;
        System.out.println("El numero 1 es primo");
        System.out.println("El numero 2 es primo");
        for (int num = 3; num <= 100 ; num++) {
            encontrado=false;
            valor=2;
            do {
                if (num %valor==0) {
                    encontrado=true;
                }
                valor++;
            } while (!encontrado && (valor<num));
            if (!encontrado){
                System.out.println("El numero " +num+" es primo" );
                contador++;
            }
        }
        System.out.println("Hay" +contador+" numeros primos entre el 1 y el 10");

    }

}
