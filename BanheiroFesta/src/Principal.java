
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banheiro banheiro = new Banheiro();
		
		Thread nome1 = new Thread (new Numero1(banheiro), "Thiago");
		Thread nome2 = new Thread (new Numero2(banheiro), "Nathy");
		Thread nome3 = new Thread (new Numero1(banheiro), "Fulano");
		Thread limpeza = new Thread (new TarefaLimpeza(banheiro), "Auxiliar de limpeza");
		
		//não faz sentido a limpeza continuar verificando o banheiro quando não houver mais nenhuma thread ativa
		limpeza.setDaemon(true);
		
		nome1.start();
		nome2.start();
		nome3.start();
		limpeza.start();
		
	}

}
