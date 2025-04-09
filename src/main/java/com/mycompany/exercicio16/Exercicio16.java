package com.mycompany.exercicio16;

import javax.swing.JOptionPane;

public class Exercicio16 {

    public static void main(String[] args) {

        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um segundo número: "));

        String opcao = JOptionPane.showInputDialog(
                "Escolha uma operação:\n"
                + "1 - Adição\n"
                + "2 - Subtração\n"
                + "3 - Multiplicação\n"
                + "4 - Divisão"
        );

        double resultado;

        switch (opcao) {
            case "1":
                resultado = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "O resultado da adição é: " + resultado);
                break;

            case "2":
                resultado = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + resultado);
                break;
                
            case "3":
                resultado = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + resultado);
                break;
                
            case "4":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + resultado);

                } else {
                    JOptionPane.showMessageDialog(null, "Não é possível dividir por zero! ");
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida! Escolha apenas 1, 2, 3 ou 4");
                break;

        }

    }
}
