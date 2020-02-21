package BuscaNome;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaNome implements Runnable{
	
	public String nomeArquivo;
	public String nome;
	
	public TarefaBuscaNome(String nomeArquivo, String nome) {
		super();
		this.nomeArquivo = nomeArquivo;
		this.nome = nome;
	}
	
	@Override
	public void run () {
		
		try {
			Scanner scanner = new Scanner (new File(nomeArquivo));
			int numeroLinha=1;
			
			while(scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				if (linha.contains(nome)) {
					System.out.println(nomeArquivo+" - "+numeroLinha+" - "+linha);
				}
				numeroLinha++;
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
