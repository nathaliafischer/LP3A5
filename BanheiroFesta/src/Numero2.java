
public class Numero2 implements Runnable {
	public Banheiro banheiro;

	public Numero2 (Banheiro banheiro) {
		this.banheiro = banheiro;
	}
	
	@Override
	public void run() {
		this.banheiro.numero2();
	}
	
	
	
}
