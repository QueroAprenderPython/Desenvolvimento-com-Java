/* Conversor decimal para octal

Escreva um programa Java para converter um número decimal em um número octal.
Dados de entrada:
Insira um número decimal: 15
Saída esperada

O número octal é: 17  */

import java.util.Scanner;

public class decimalParaoctal {
    public static void main(String args[]) {
        // Declare variáveis para armazenar números decimais, resto, quociente, e uma matriz para dígitos octais.
        int dec_num, resto, quociente, i = 1, j;
        int oct_num[] = new int[100];
        
        // Cria um objeto Scanner para receber a entrada digitada pelo o usuário.
        Scanner scan = new Scanner(System.in);

        // Insira a entrada fornecida pelo o usuário como um número decimal.
        System.out.print("Insira um numero decimal: ");
        dec_num = scan.nextInt();

        // Inicialize o quociente com um número decimal.
        quociente = dec_num;

        // Converta o número decimal para octal, e armazene os dígitos octais.
        while (quociente != 0) {
            oct_num[i++] = quociente % 8;
            quociente = quociente / 8;
        }

        // Exiba a representação do número decimal em octal.
        System.out.print("O numero octal e: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(oct_num[j]);
        }
        
        System.out.print("\n");
    }
}