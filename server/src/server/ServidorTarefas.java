package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServidorTarefas {
	public static void main (String[] args) throws IOException {
		System.out.println("--Iniciando Servidor--");
		ServerSocket servidor = new ServerSocket(12345);
		
		//Fazendo um pool de threads com número fixo de threads:
		//ExecutorService poolDeThread = Executors.newFixedThreadPool(2);
		
		//Fazendo um pool com número de conexões conforme a demanda
		ExecutorService poolDeThread = Executors.newCachedThreadPool();
		
		while (true) {
			Socket socket = servidor.accept();
			System.out.println("Aceitando novo cliente na porta: "+socket.getPort());
			
			DistribuirTarefas distribuirTarefas = new DistribuirTarefas(socket);
			
			poolDeThread.execute(distribuirTarefas);
			//new Thread (distribuirTarefas).start();

		}
		
	}
}
