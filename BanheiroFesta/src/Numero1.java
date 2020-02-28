

public class Numero1 implements Runnable{

	private Banheiro banheiro;
	
	public Numero1(Banheiro banheiro) {
		this.banheiro = banheiro;
	}
	
	@Override
	public void run() {
		try {
		this.banheiro.numero1();}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

