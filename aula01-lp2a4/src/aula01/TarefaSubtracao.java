package aula01;

import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TarefaSubtracao implements Runnable{
	private JTextField primeiroSubtracao;
	private JTextField segundoSubtracao;
	private JLabel resultadoSubtracao;
	
	public TarefaSubtracao(JTextField primeiroSubtracao,  JTextField segundoSubtracao, JLabel resultadoSubtracao) {
		this.primeiroSubtracao = primeiroSubtracao;
		this.segundoSubtracao = segundoSubtracao;
		this.resultadoSubtracao = resultadoSubtracao;
	}
	
	@Override
	public void run () {
		float valor1 = Integer.parseInt(primeiroSubtracao.getText());
		float valor2 = Integer.parseInt(segundoSubtracao.getText());
		double calculo = 0;
	
		double i=1;
		while (i<1000000) {
			calculo = valor1-valor2;
			i=i+0.0000001;
		}
		
		resultadoSubtracao.setText(Double.toString(calculo));
		
		
	}
}