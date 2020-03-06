package server;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class DistribuirTarefas implements Runnable {
	private Socket socket;

	public DistribuirTarefas(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
		System.out.println("Distribuindo as tarefas para o cliente "+socket);
		
		//pra eu receber o PrintStream do cliente:
		Scanner entradaCliente = new Scanner(socket.getInputStream());
		PrintStream saidaCliente = new PrintStream(socket.getOutputStream());
			
		while (entradaCliente.hasNextLine()) {
			String comando = entradaCliente.nextLine();
			System.out.println("Comando: "+comando);
			switch (comando) {
			case "ola": saidaCliente.println(" mundo"); break;
			case "oi": saidaCliente.println(" tchau"); break;
			default: saidaCliente.println(" Comando não encontrado");
			}
			
		}
		entradaCliente.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
