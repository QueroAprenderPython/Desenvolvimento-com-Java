/** Variáveis ​​de troca

Escreva um programa Java para trocar duas variáveis. */

public class  variaveisDetroca {
 
 public static void main(String[] args) {
   // Declare  valores para as variáveis que deseja fazer a troca.
   int a, b, temp;
   
   // Declare valores para atribuir as variáveis a e b.
   a = 15;
   b = 27;
   
   // Exibe os valores das variáveis antes da troca.
   System.out.println("Antes da troca : a, b = " + a + ", " + b);
   
   // Antes de realizar a trocar, utilizaremos uma variável temporária para armazenar, os valores para a e b.
   temp = a;
   a = b;
   b = temp;   
   
   // Exibe os valores das variáveis após a troca.
   System.out.println("Depois da troca : a, b = " + a + ", " + b);
 }
}
