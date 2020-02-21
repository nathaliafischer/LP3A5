package aula01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AcaoBotaoDivisao implements ActionListener{

	private JTextField primeiroDivisao;
	private JTextField segundoDivisao;
	private JLabel resultadoDivisao;
	
	public AcaoBotaoDivisao(JTextField primeiroDivisao,  JTextField segundoDivisao, JLabel resultadoDivisao) {
		this.primeiroDivisao = primeiroDivisao;
		this.segundoDivisao = segundoDivisao;
		this.resultadoDivisao = resultadoDivisao;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		TarefaDivisao Divisao = new TarefaDivisao(primeiroDivisao, segundoDivisao, resultadoDivisao);	
		Thread minhathreadDivisao = new Thread(Divisao, "Divisao");
		minhathreadDivisao.start();
	}
}

