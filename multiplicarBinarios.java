/** Multiplicação Binária

Escreva um programa Java para multiplicar dois números binários.
Dados de entrada:
Insira o primeiro número binário: 10
Insira o segundo número binário: 11
Saída esperada

Produto de dois números binários: 110  */

import java.util.Scanner;

public class multiplicarBinarios {
 public static void main(String[] args) {

  // Declara variáveis ​​para armazenar números binários e o produto.
  long binary1, binary2, multi = 0;
  
  // Inicializa variáveis ​​de dígito e fator para processamento de binário2.
  int digito, factor = 1;
  
 // Cria um objeto Scanner para ler a entrada do usuário.
  Scanner in = new Scanner(System.in);
  
  //Solicita ao usuário que insira o primeiro número binário.
  System.out.print("Insira o primeiro numero binario: ");
  binary1 = in.nextLong();
  
  //Solicita ao usuário que insira o segundo número binário.
  System.out.print("Insira o segundo numero binario: ");
  binary2 = in.nextLong();
  
  // Processa binary2 para calcular o produto.
  while (binary2 != 0) {
   digito = (int)(binary2 % 10);
   if (digito == 1) {
    binary1 = binary1 * factor;
    multi = binaryproduct((int) binary1, (int) multi);
   } else {
    binary1 = binary1 * factor;
   }
   binary2 = binary2 / 10;
   factor = 10;
  }
  
  // Exibe o produto dos dois números binários.
  System.out.print("Produto da soma dos dois numeros binarios: " + multi + "\n");
 }

 // Método para calcular o produto de dois números binários.
 static int binaryproduct(int binary1, int binary2) {
  int i = 0, resto = 0;
  int[] soma = new int[20];
  int binary_prod_result = 0;

  while (binary1 != 0 || binary2 != 0) {
   soma[i++] = (binary1 % 10 + binary2 % 10 + resto) % 2;
   resto = (binary1 % 10 + binary2 % 10 + resto) / 2;
   binary1 = binary1 / 10;
   binary2 = binary2 / 10;
  }

  if (resto != 0) {
   soma[i++] = resto;
  }
  
  --i;
  
  while (i >= 0) {
   binary_prod_result = binary_prod_result * 10 + soma[i--];
  }

  return binary_prod_result;
 }
}
 