/** Média de três números

Escreva um programa Java que receba três números como entrada para calcular e imprimir a média dos números. */

import java.util.Scanner;
class mediaTresnumeros{
    public static void main(String[] args) {
        int num1,num2,num3;
        float media;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        num1 = entrada.nextInt();

        System.out.println("Digite o segundo numero:");
        num2 = entrada.nextInt();

        System.out.println("Digite o terceiro numero:");
        num3 = entrada.nextInt();

        media = (num1 + num2 + num3) / 3;
  
        System.out.println(media);
   }
}