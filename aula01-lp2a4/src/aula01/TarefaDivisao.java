package aula01;

import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TarefaDivisao implements Runnable{
	private JTextField primeiroDivisao;
	private JTextField segundoDivisao;
	private JLabel resultadoDivisao;
	
	public TarefaDivisao(JTextField primeiroDivisao,  JTextField segundoDivisao, JLabel resultadoDivisao) {
		this.primeiroDivisao = primeiroDivisao;
		this.segundoDivisao = segundoDivisao;
		this.resultadoDivisao = resultadoDivisao;
	}
	
	@Override
	public void run () {
		float valor1 = Integer.parseInt(primeiroDivisao.getText());
		float valor2 = Integer.parseInt(segundoDivisao.getText());
		double calculo = 0;
	
		double i=1;
		
		if (valor2==0) {
				JOptionPane.showMessageDialog(null,
					"Digite um valor numérico válido no campo", 
					"Erro de validação", 
					JOptionPane.ERROR_MESSAGE 
				);
				
			}		
		else {
			while (i<1000000) {
				calculo = valor1/valor2;
				i=i+0.0000001;
			}
		
			resultadoDivisao.setText(Double.toString(calculo));
		}
		
	}
}