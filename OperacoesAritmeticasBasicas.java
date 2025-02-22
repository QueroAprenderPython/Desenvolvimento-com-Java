/**
 * Operações Aritméticas Básicas

Escreva um programa Java para imprimir a soma (adição), multiplicação, subtração, divisão e resto de dois números.
Dados de teste:
Insira o primeiro número: 125
Insira o segundo número: 24
Saída esperada :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/
import java.util.Scanner;

class OperacoesArimeticasBasicas{
    public static void main(String[] args) {
        int num1;
        int num2;
        int soma;
        int sub;
        int mult;
        int div;
        int mod;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o primeiro numero:");
        num1 = entrada.nextInt();

        System.out.println("Insira o segundo numero:");
        num2 = entrada.nextInt();
        
        soma = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;
        System.out.println("num1 + num2 = " + soma);
        System.out.println("num1 - num2 = " + sub);
        System.out.println("num1 * num2 =" + mult);
        System.out.println("num1 / num2 = "  + div);
        System.out.println("num1 % num2 = " + mod);
    }
}