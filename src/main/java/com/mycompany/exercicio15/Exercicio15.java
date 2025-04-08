/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio15;

/**
 *
 * @author Fabricio de Aguiar
 */

/** Solicitar nome e idade de uma pessoa.
Se a pessoa possuir idade entre 15 e 25 anos, imprimir o nome e a
mensagem: “ACEITA”.
Caso contrário, imprimir o nome e a mensagem: “NÃO ACEITA”.*/

import javax.swing.JOptionPane;

public class Exercicio15 {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));

        if (idade >= 15 && idade <= 25) {
            JOptionPane.showMessageDialog(null, nome + ", Aceito(a)");
        } else {
            JOptionPane.showMessageDialog(null, nome + ", Não aceito(a)");
        }
    }
}