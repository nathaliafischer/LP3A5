package Cliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteTarefas {
	public static void main (String[] args) throws IOException, InterruptedException {
	Socket socket = new Socket ("localhost", 12345);
	System.out.println("Conexão Estabelecida");
	
	//saida.println("c1");
		
	//recebe dados do servidor
	/*Scanner respostaServidor = new Scanner(System.in);
		while (respostaServidor.hasNextLine()) {
			String linha = respostaServidor.nextLine();
			System.out.println(linha);
		}
		respostaServidor.close();*/
	
	Thread threadEnviaDadosServidor = new Thread (new Runnable() {
		@Override
		public void run() {
		try {
			System.out.println("Pode enviar comandos!");
			PrintStream saida = new PrintStream(socket.getOutputStream());
			//envia dados pro servidor
			Scanner teclado = new Scanner(System.in);
			while(teclado.hasNextLine()) {
				String linha = teclado.nextLine();
				if (linha.trim().equals("")) {
					break;
				}
				saida.println(linha);
			}
			saida.close();
			teclado.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	});
	
	Thread threadRecebeResposta = new Thread (new Runnable() {
		
		@Override
		public void run() {
			try {
			System.out.println("Recebendo dados do servidor: ");
			Scanner respostaServidor = new Scanner(socket.getInputStream());
			while (respostaServidor.hasNextLine()) {
				String linha = respostaServidor.nextLine();
				System.out.println(linha);
			}
			respostaServidor.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	});
	
	threadEnviaDadosServidor.start();
	threadRecebeResposta.start();
	//método join sincroniza as threads pra que elas não conflitem e que execute cada uma até o fim
	threadEnviaDadosServidor.join();
	System.out.println("Fechando o socket do cliente");
	socket.close();
	}
}