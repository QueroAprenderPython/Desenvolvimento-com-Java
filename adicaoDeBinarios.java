/** Adição binária

Escreva um programa Java para adicionar dois números binários.
Dados de entrada:
Insira o primeiro número binário: 10
Insira o segundo número binário: 11
Saída esperada

Soma de dois números binários: 101 */

import java.util.Scanner;

class adicaoDeBinarios{
    public static void main(String[] args){
        // Declare variáveis para armazenar dois números binários,  um índice, e um resto.
        long binary1,binary2;
        int i = 0, resto = 0;

        // Crie uma matriz para armazenar a soma dos números dígitos binários.
        int[] soma = new int[20];

        // Cria um objeto Scanner para ler a entrada do usuário.
         Scanner entrada = new Scanner(System.in);

         // Solicita ao usuário para inserir o primeiro número binário
         System.out.println("Insira o primeiro numero binario:");
         binary1 = entrada.nextLong();

         // Solicita ao usuário para inserir o segundo número binário
         System.out.println("Insira o segundo numero binario:");
         binary2 = entrada.nextLong();

        //Executa a adição binária enquanto houver dígitos nos números binários.
        while (binary1 != 0 || binary2 !=0)
         { 
            //Calcula a soma dos dígitos binários e atualiza o restante. Aqui transformamos os números binários, para base 10. Antes de transformá - los para base 2.
            soma[i++] = (int)((binary1 % 10 + binary2 % 10 + resto) % 2);
            resto = (int)((binary1 % 10 + binary2 % 10 + resto) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
         }

         //Se houver um resto(sobra) restante, adicione-o à soma.
         if(resto != 0) {
            soma[i++] = resto;
         }

         //Diminui o índice para preparar a impressão.
         --i;
         
        //Exibe a soma dos dois números binários.
        System.out.println("A soma dos dois numeros binarios sao: ");
        while(i >= 0) {
            System.out.println(soma[i--]);
        }

        System.out.println("\n");
        
    } 
}