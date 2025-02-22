/** Cálculo de Fórmulas

Escreva um programa Java para calcular uma fórmula especificada.
Fórmula especificada:
4,0 * (1 - (1,0/3) + (1,0/5) - (1,0/7) + (1,0/9) - (1,0/11))
Saída esperada
2,9760461760461765 */
class calculoDeFormulas{
    public static void main(String[] args) {
        double formula = 4.0 * (1 - 1.0 / 3 + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
        
        System.out.println(formula);
    }
}