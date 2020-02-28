
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista lista = new Lista ();
		
		for (int i=0; i<10; i++) {
			new Thread (new TarefaAdicionaElemento(lista, i)).start();
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for (int i=0; i<lista.tamanho();i++) {
			System.out.println(i + " - "+ lista.pegaElemento(i));
		}
	}

}
