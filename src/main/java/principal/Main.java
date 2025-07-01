package principal;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        while(x != 0 && y != 0){
             x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
             y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y: "));

            if(x > 0 && y > 0){
                JOptionPane.showMessageDialog(null,"Primeiro quadrante");
            }else if(x < 0 && y > 0){
                JOptionPane.showMessageDialog(null,"Segundo quadrante");
            }else if(x < 0 && y < 0){
                JOptionPane.showMessageDialog(null,"Terceiro quadrante");
            }else if(x > 0 && y < 0){
                JOptionPane.showMessageDialog(null,"Quarto quadrante");
            }

        }

    }
}