package aula01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AcaoBotaoSubtracao implements ActionListener{

	private JTextField primeiroSubtracao;
	private JTextField segundoSubtracao;
	private JLabel resultadoSubtracao;
	
	public AcaoBotaoSubtracao(JTextField primeiroSubtracao,  JTextField segundoSubtracao, JLabel resultadoSubtracao) {
		this.primeiroSubtracao = primeiroSubtracao;
		this.segundoSubtracao = segundoSubtracao;
		this.resultadoSubtracao = resultadoSubtracao;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		TarefaSubtracao subtracao = new TarefaSubtracao(primeiroSubtracao, segundoSubtracao, resultadoSubtracao);	
		Thread minhathreadSubtracao = new Thread(subtracao, "Subtracao");
		minhathreadSubtracao.start();
	}
}
