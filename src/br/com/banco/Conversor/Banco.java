package br.com.banco.Conversor;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class Banco {

	public static void main(String[] args) {
		Moedas m = new Moedas();
        String opcao;
        
        
        do {
        	Object [] opcoes = {"Dolar pra Real", "Real pra Dolar", "Sair"};
            opcao = (String)JOptionPane.showInputDialog(null,"Qual moeda deseja converter: ",
            		"Selecione",JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
           
            
            
            switch (opcao) {
                case "Dolar pra Real": {
                    String valor = JOptionPane.showInputDialog("Valor: ");
                    double n = Double.parseDouble(valor);
                    JOptionPane.showMessageDialog(null, "Valor convertido para Real: R$" + m.dolarPReal(n));
                    break;
                }

                case "Real pra Dolar": {
                    String valor = JOptionPane.showInputDialog("Valor: ");
                    double n = Double.parseDouble(valor);
                    JOptionPane.showMessageDialog(null, "Valor convertido para Dolar: $" + m.RealPdolar(n));
                    break;
                }

                case "Sair": {
                    JOptionPane.showMessageDialog(null, "Programa encerrado");
                    break;
                }

                default: {
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                }
            }
        } while (opcao != "Sair");
		}
	}
		



