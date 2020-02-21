package BuscaNome;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomeProcurado = "J";
		Thread autores = new Thread (new TarefaBuscaNome("autores.txt", nomeProcurado));
		Thread assinaturas1 = new Thread (new TarefaBuscaNome("assinaturas1.txt", nomeProcurado));
		Thread assinaturas2 = new Thread (new TarefaBuscaNome("assinaturas2.txt", nomeProcurado));
		
		String mulherProcurada = "J";
		Thread mulheres = new Thread (new TarefaBuscaMulheresImportantes("MulheresMaisImportantes.txt", mulherProcurada));
		
		autores.start();
		assinaturas1.start();
		assinaturas2.start();
		mulheres.start();
		
		
	}

}
