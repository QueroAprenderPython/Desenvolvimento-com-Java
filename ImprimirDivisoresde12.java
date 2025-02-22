/**1. Faça uma programa Java que receba um número inteiro positivo como entrada do usuário através da classe JOptionPane e imprima seus divisores (Ex: Divisores de 12 são os números 1, 2, 3, 4, 6 e 12).  */
import java.awt.Component;
import javax.swing.JOptionPane;
class ImprimirDivisoresde12{
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Digite um numero:");
        int num = Integer.parseInt(str);
        
        for(int i = 1; i <= num; i++) {
            if(num % i == 0){       
                int divisor = num / i;        
                Component parentComponent = null;
                JOptionPane.showMessageDialog(parentComponent, divisor); 
            }
        }

    }
}