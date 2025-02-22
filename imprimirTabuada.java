/** Tabela de multiplicação

Escreva um programa Java que receba um número como entrada e imprima sua tabuada de multiplicação até 10.
Dados de teste:
Insira um número: 8
Saída esperada :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80 */
import java.util.Scanner;
class imprimirTabuada{
    public static void main(String[]args){
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 10:");
        num= entrada.nextInt();
        for(int i = 1; i <= 10; i++) {
            int mult = num * i;
            System.out.println("Numero: " + num +  " X " + i + " = " + mult);
        }
    }
}