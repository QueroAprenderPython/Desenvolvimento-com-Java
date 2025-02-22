/**4. Utilizando a estrutura switch, faça um programa Java que receba um número do usuário de 1 a 12 e retorne o valor do mês correspondente. Ex: Para a entrada 5 gerar a saída MAIO; Para a entrada 11 gerar a saída NOVEMBRO; Se o valor de entrada for diferente do intervalo 1-12, gerar a saída INVÁLIDO.  */

import java.awt.Component;
import javax.swing.JOptionPane; 

class  RetornarMespeloNome{
      public static void main(String[] args) {   
        String str = JOptionPane.showInputDialog("Mes"); 
          int mes = Integer.parseInt(str);  
           switch (mes) {   
            case 1 -> {
                Component parentComponent= null;
                JOptionPane.showMessageDialog(parentComponent, "Janeiro");
            }
            case 2 -> {
                Component parentComponent= null;
                JOptionPane.showMessageDialog(parentComponent, "Fevereiro");
            }
            case 3 -> {
                Component parentComponent= null;
                JOptionPane.showMessageDialog(parentComponent, "Março");
            }

            case 4 -> {
                Component parentComponent = null;
                JOptionPane.showMessageDialog(parentComponent, "Abril");
            }
             case 5 -> {
                Component parentComponent = null;
                JOptionPane.showMessageDialog(parentComponent, "Maio");
            }
             case 6 -> {
                Component parentComponent = null;
                JOptionPane.showMessageDialog(parentComponent, "Junho");
            }
             case 7 -> {
                Component parentComponent = null;
                JOptionPane.showMessageDialog(parentComponent, "Julho");
            }
             case 8 -> {
                Component parentComponent = null;
                JOptionPane.showMessageDialog(parentComponent, "Agosto");
            }
             case 9 -> {
                Component parentComponent = null;
                JOptionPane.showMessageDialog(parentComponent, "Setembro");
            }
             case 10 -> {
                Component parentComponent = null;
                JOptionPane.showMessageDialog(parentComponent, "Outubro");
            }
             case 11 -> {
                Component parentComponent = null;
                JOptionPane.showMessageDialog(parentComponent, "Novembro");
            }
             case 12 -> {
                Component parentComponent = null;
                JOptionPane.showMessageDialog(parentComponent, "Dezembro");
            }
            default -> {
                Component parentComponent = null;
                JOptionPane.showMessageDialog(parentComponent, "Inválido");
            }
        }          
   }
}