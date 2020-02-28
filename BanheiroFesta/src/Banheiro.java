
public class Banheiro {
	
	public boolean sujo = true; //variável criada para se demonstrar a utilização de método que impeça outras coisas de acontecerem mesmo após sincronização
	
	public void numero1() throws Exception{
		String nome = Thread.currentThread().getName();
		System.out.println(nome+" entrou na fila do banheiro");
		synchronized (this) {
			System.out.println(nome + " entrou no banheiro");
			while (this.sujo) {
				espera(nome);
			} //se estivesse com if no lugar de while: quando a thread é notificada, ela volta a executar o código a partir daqui
			System.out.println(nome + " está fazendo número 1");
			Thread.sleep((5000));
			this.sujo=true;
			System.out.println(nome + " saiu do banheiro");
		}
	}
	
	private void espera(String nome) {
		System.out.println(nome + " não usou o banheiro porque está sujo e vai esperar que limpem.");
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void numero2() {
		String nome = Thread.currentThread().getName();
		System.out.println(nome+" entrou na fila do banheiro");
		
		synchronized (this) {
			System.out.println(nome + " entrou no banheiro");
			while (this.sujo) {
				espera(nome);
			}
			System.out.println(nome + " está fazendo número 2");
			try {
				Thread.sleep((10000));
			} catch (Exception e){
				e.printStackTrace();
			}
			this.sujo=true;
			System.out.println(nome + " saiu do banheiro");
	}
	}
	
	public void limpa () {
		String nome = Thread.currentThread().getName();
		System.out.println(nome+" procurando banheiro para limpar");
		synchronized (this) {
			System.out.println(nome + " entrou no banheiro");
					
			
			if (!this.sujo) {
				System.out.println(nome+ " verificou que o banheiro não está sujo");
				return;
			}
			
			System.out.println(nome + " está limpando o banheiro");
			this.sujo=false;
			try {
				Thread.sleep((5000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(nome + " saiu do banheiro");
			this.notifyAll();
		}
	}
	
}
