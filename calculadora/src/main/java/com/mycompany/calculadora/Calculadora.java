package com.mycompany.calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame {

    private JTextField txtNumero1 = new JTextField(10);
    private JTextField txtNumero2 = new JTextField(10);
    private JComboBox<String> operacoes = new JComboBox<>(new String[]{"+", "-", "*", "/"});
    private JTextField txtResultado = new JTextField(15);
    private JButton btnCalcular = new JButton("Calcular");

    public Calculadora() {
        super("Calculadora Simples");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        txtResultado.setEditable(false);

        this.add(new JLabel("Número 1:"));
        this.add(txtNumero1);

        this.add(new JLabel("Número 2:"));
        this.add(txtNumero2);

        this.add(new JLabel("Operação:"));
        this.add(operacoes);

        this.add(btnCalcular);

        this.add(new JLabel("Resultado:"));
        this.add(txtResultado);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });

        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void calcular() {
        try {
            double num1 = Double.parseDouble(txtNumero1.getText());
            double num2 = Double.parseDouble(txtNumero2.getText());
            String op = (String) operacoes.getSelectedItem();
            double resultado = 0;

            switch (op) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        txtResultado.setText("Erro: divisão por 0");
                        return;
                    }
                    resultado = num1 / num2;
                    break;
            }

            txtResultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException ex) {
            txtResultado.setText("Entrada inválida");
        }
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
