/**
 *  Círculo: Área e Perímetro

Escreva um programa Java para imprimir a área e o perímetro de um círculo.
Dados de teste:
Raio = 7,5
Saída esperada
Perímetro é = 47,12388980384689
Área é = 176,71458676442586
 */
class perimetroAreadoCirculo{
    public static void main(String[]args){
        double raio = 7.5;
        double perimetro= 2 * (3.14159265358979323846 * 7.5);
        double area =  3.14159265358979323846 * (raio * raio);

        System.out.println("Perimetro :"+ perimetro);
        System.out.println("Area :" + area);
    }
}