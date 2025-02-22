/**  Operações Aritméticas

Escreva um programa Java para imprimir os resultados das seguintes operações.
Dados de teste:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Saída esperada :
43
1
19
13 */
class operacoesAritmeticas{
    public static void main(String[] args) {
       int a = -5 +8 * 6;
       int b =(55+9) %9;
       int c = 20 + -3*5/8;
       int d = 5 + 15/3*2 -8 %3;
       System.out.println("O resultado de A foi:" + a);
       System.out.println("O resultado de B foi:" + b);
       System.out.println("O resultado de C foi:" + c);
       System.out.println("O resultado de D foi:" + d);
    }   
}