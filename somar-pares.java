import java.util.Scanner;

class SomarPares{
        public static void main(String [] args){
            Scanner imprimir = new Scanner(System.in);
            int a,b;
            int soma = 0;

            for (int i = 0; i <= 6; i++) {
               System.out.println("Digite o primeiro numero par:");
               a = imprimir.nextInt();
               System.out.println("Digite o segundo numero par:");
               b = imprimir.nextInt();

               if(a %2 == 0 && b % 2 == 0) {
                System.out.println("Os numeros a e b sao pares!" + "Entao vamos soma-los:");
                  soma = soma + a + b;
               } else if(a % 2 == 1 && b % 2 == 1){
                System.out.println("Os numeros sao impares!");
                soma = soma + 0;
                System.out.println("O resultado da soma dos pares sao:" + soma);
                break;
           }     
        }   
    }
}