package conversorBinOctHex;

import java.util.Scanner;

public class conversorBinOctHex {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal,modulo,decimal1,decimal2;
        String binario="";
        String octal="";
        String hexa="";
        System.out.print("Ingresa un numero: ");
        decimal= sc.nextInt();
        decimal1=decimal;
        decimal2=decimal;
        while(decimal>0) {
            modulo = (decimal % 2);
            binario = modulo + binario;
            decimal = decimal / 2;
        }
        System.out.println("El numero binario es = "+binario+" ");

        while (decimal1>0){
            modulo = (decimal1 %8);
            octal=modulo+octal;
            decimal1=decimal1/8;
        }
        System.out.println("El numero octal es "+octal+" ");

        while (decimal2>0){
            modulo = (decimal2 %16);
            hexa=modulo+hexa;
            decimal2=decimal2/16;
        }
        System.out.println("El numero hexadecimal es "+hexa+" ");
        sc.close();
    }

}
