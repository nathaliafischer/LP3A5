
public class TarefaAdicionaElemento implements Runnable{
	private Lista lista;
	int numeroDaThread;
	
	public TarefaAdicionaElemento(Lista lista, int numeroDaThread) {
		this.lista = lista;
		this.numeroDaThread=numeroDaThread;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<100; i++) {
			lista.adicionaElementos("Thread "+numeroDaThread+ " - " + i);
		}
	}
	
}
