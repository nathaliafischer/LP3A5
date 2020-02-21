package aula01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AcaoBotaoSoma implements ActionListener{

	private JTextField primeiroSoma;
	private JTextField segundoSoma;
	private JLabel resultadoSoma;
	
	public AcaoBotaoSoma(JTextField primeiroSoma,  JTextField segundoSoma, JLabel resultadoSoma) {
		this.primeiroSoma = primeiroSoma;
		this.segundoSoma = segundoSoma;
		this.resultadoSoma = resultadoSoma;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		TarefaSoma soma = new TarefaSoma(primeiroSoma, segundoSoma, resultadoSoma);	
		Thread minhathreadSoma = new Thread(soma, "soma");
		minhathreadSoma.start();
	}
}
