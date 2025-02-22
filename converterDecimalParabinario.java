/** Conversor decimal para binário

Escreva um programa Java para converter um número inteiro em um número binário.
Dados de entrada:
Insira um número decimal: 5
Saída esperada

O número binário é: 101  */

import java.util.Scanner;
class converterDecimalParabinario{
    public static void main(String[] args) {
         /* Declara variáveis ​​para armazenar números decimais, quociente e um array para dígitos binários.*/

        int dec_num, quociente, i = 1, j;
        int bin_num[] = new int[100];
        
        // Cria um objeto Scanner para ler a entrada do usuário.
        Scanner scan = new Scanner(System.in);

        // Solicita ao usuário que insira um número decimal.
        System.out.print("Insira o Numero Decimal: ");
        dec_num = scan.nextInt();

        // Inicializa o quociente com o número decimal.
        quociente = dec_num;

        // Converte o número decimal em binário e armazena dígitos binários.

        while (quociente != 0) {
            bin_num[i++] = quociente % 2;
            quociente = quociente / 2;
        }

        // Exibe a representação binária do número decimal.
        System.out.print("Numero em binario e : ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
    }
}