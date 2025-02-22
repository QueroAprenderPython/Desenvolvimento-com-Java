import java.util.Scanner;
class produtoDedoisNumeros{
    public static void main (String[]args) {
        int primeiro;
        int segundo;

       Scanner entrada = new Scanner(System.in);

       System.out.println("Insira o primeiro numero:");
       primeiro = entrada.nextInt();

       System.out.println("Insira o segundo numero:");
       segundo = entrada.nextInt();

       int multiplicacao = primeiro * segundo;
       System.out.println("O resultado da multiplicacao do primeiro pelo segundo numero foi: " + multiplicacao);

    }
}