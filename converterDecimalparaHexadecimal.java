/** Conversor decimal para hexadecimal

Escreva um programa Java para converter um número decimal em um número hexadecimal.
Dados de entrada:
Insira um número decimal: 15
Saída esperada

O número hexadecimal é: F  */

import java.util.Scanner;

public class converterDecimalparaHexadecimal {
public static void main(String args[]) {
   
   // Declare variáveis para armazenar números decimais e o resto.
   int dec_num, resto;

   // Inicialize com uma string vazia, para receber o número hexadecimal.
   String hexdec_num = "";

   // Defina os dígitos dos números hexadecimais.
   char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

   // Cria um objeto Scanner que irá ler a entrada fornecida pelo o usuário.
   Scanner entrada = new Scanner(System.in);

   // Insira o número decimal digitado pelo o usuário.
   System.out.println("Insira um numero decimal:");
   dec_num = entrada.nextInt();

   // Converta o número decimal para hexadecimal.
   while(dec_num > 0) {
     resto = dec_num % 16;
     hexdec_num = hex[resto] + hexdec_num;
     dec_num = dec_num / 16;
   }
     // Exibe a representação hexadecimal do número decimal.
     System.out.println("O numero hexadecimal e: " + hexdec_num + "\n");
}
}