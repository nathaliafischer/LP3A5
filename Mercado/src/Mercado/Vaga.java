package Mercado;

public class Vaga {

	
	public void compraRapida() {
		
		String nome = Thread.currentThread().getName();
		
		System.out.println(nome + " procurando vaga no estacionamento");
		
		synchronized (this) {
			System.out.println(nome + " Entrou na vaga!");
			System.out.println(nome + " fazendo compra r�pida!");
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(nome +  " colocando as compras no carro");
			System.out.println(nome +  " entrando no carro");
			System.out.println(nome +  " saindo da vaga");

		}

	}
	
	
	public void compraDemorada() {
		
		String nome = Thread.currentThread().getName();
		
		System.out.println(nome + " procurando vaga no estacionamento");
		synchronized (this) {
			System.out.println(nome + " Entrou na vaga!");
			System.out.println(nome + " fazendo compra demorada!");
			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(nome +  " colocando as compras no carro");
			System.out.println(nome +  " entrando no carro");
			System.out.println(nome +  " saindo da vaga");
		}
		
	}

	
}
