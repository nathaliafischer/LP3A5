package aula01;

import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TarefaSoma implements Runnable{
	private JTextField primeiroSoma;
	private JTextField segundoSoma;
	private JLabel resultadoSoma;
	
	public TarefaSoma(JTextField primeiroSoma,  JTextField segundoSoma, JLabel resultadoSoma) {
		this.primeiroSoma = primeiroSoma;
		this.segundoSoma = segundoSoma;
		this.resultadoSoma = resultadoSoma;
	}
	
	@Override
	public void run () {
		float valor1 = Integer.parseInt(primeiroSoma.getText());
		float valor2 = Integer.parseInt(segundoSoma.getText());
		double calculo = 0;
	
		double i=1;
		while (i<1000000) {
			calculo = valor1+valor2;
			i=i+0.0000001;
		}
		
		resultadoSoma.setText(Double.toString(calculo));
		
		
	}
}