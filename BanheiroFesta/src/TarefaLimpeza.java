
public class TarefaLimpeza implements Runnable {
	private Banheiro banheiro;
		
	public TarefaLimpeza(Banheiro banheiro) {
		this.banheiro = banheiro;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
		this.banheiro.limpa();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		}

}
