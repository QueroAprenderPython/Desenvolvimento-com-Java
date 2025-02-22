/** Retângulo: Área e Perímetro

Escreva um programa Java para imprimir a área e o perímetro de um retângulo.
Dados de teste:
Largura = 5,5 Altura = 8,5

A área de saída esperada
é 5,6 * 8,5 = 47,60
O perímetro é 2 * (5,6 + 8,5) = 28,20 */

class retanguloAreaEperimetro {
    public static void main(String[] args)
    {
        double largura = 5.6;
        double altura =  8.5;
        double area = (largura * altura);
        double perimetro = 2 * (5.6 + 8.5);

        System.out.println(area + "\n" + perimetro);
        
    }
}