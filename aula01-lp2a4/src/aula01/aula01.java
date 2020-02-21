package aula01;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class aula01 {
	public static void main(String[] args) {
		
		JFrame janela = new JFrame ("Calculadora");
		
		JTextField primeiro = new JTextField(10);
		JTextField segundo = new JTextField(10);
		JButton botao = new JButton(" = ");
		JLabel resultado = new JLabel(" Resultado ");
		
		JTextField primeiroSoma = new JTextField(10);
		JTextField segundoSoma = new JTextField(10);
		JButton botaoSoma = new JButton(" = ");
		JLabel resultadoSoma = new JLabel(" Resultado ");
		
		JTextField primeiroSubtracao = new JTextField(10);
		JTextField segundoSubtracao = new JTextField(10);
		JButton botaoSubtracao = new JButton(" = ");
		JLabel resultadoSubtracao = new JLabel(" Resultado ");
		
		JTextField primeiroDivisao = new JTextField(10);
		JTextField segundoDivisao = new JTextField(10);
		JButton botaoDivisao = new JButton(" = ");
		JLabel resultadoDivisao = new JLabel(" Resultado ");
		
		botao.addActionListener(new AcaoBotao(primeiro, segundo, resultado));
		botaoSoma.addActionListener(new AcaoBotaoSoma(primeiroSoma, segundoSoma, resultadoSoma));
		botaoSubtracao.addActionListener(new AcaoBotaoSubtracao(primeiroSubtracao, segundoSubtracao, resultadoSubtracao));
		botaoDivisao.addActionListener(new AcaoBotaoDivisao(primeiroDivisao, segundoDivisao, resultadoDivisao));
		
		JPanel painel = new JPanel();
		painel.add(primeiro);
		painel.add(new JLabel ("x"));
		painel.add(segundo);
		painel.add(botao);
		painel.add(resultado);
		
		painel.add(primeiroSoma);
		painel.add(new JLabel ("+"));
		painel.add(segundoSoma);
		painel.add(botaoSoma);
		painel.add(resultadoSoma);
		
		painel.add(primeiroSubtracao);
		painel.add(new JLabel ("-"));
		painel.add(segundoSubtracao);
		painel.add(botaoSubtracao);
		painel.add(resultadoSubtracao);		
		
		
		painel.add(primeiroDivisao);
		painel.add(new JLabel ("/"));
		painel.add(segundoDivisao);
		painel.add(botaoDivisao);
		painel.add(resultadoDivisao);		
		
		janela.add(painel);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setPreferredSize(new Dimension(450,300));
		janela.pack();
		janela.setVisible(true);
		
	}
}

