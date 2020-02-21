package BuscaNome;

import java.io.File;
import java.util.Scanner;

public class TarefaBuscaMulheresImportantes implements Runnable {
	public String arquivo;
	public String palavraProcurada;
	
	public TarefaBuscaMulheresImportantes (String arquivo, String palavraProcurada) {
		super ();
		this.arquivo=arquivo;
		this.palavraProcurada = palavraProcurada;
	}
	
	
	
	@Override
	public void run () {
		try {
			Scanner scanner = new Scanner(new File (arquivo));
			int numeroLinha = 1;
			
			while (scanner.hasNextLine()) {
				String linhaDoArquivo = scanner.nextLine();
				
				if (linhaDoArquivo.contains(palavraProcurada)) {
					System.out.println("Foi encontrada no arquivo "+arquivo+" a palavra "+palavraProcurada+" na linha "+numeroLinha);
				}
				numeroLinha++;
			}
			scanner.close();
		}
		catch (Exception e){ 
			e.printStackTrace();
		}
	}
}
