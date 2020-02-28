package Mercado;

public class Principal {
    public static void main(String[] args) {
        Vaga vaga = new Vaga();

        Thread carro1 = new Thread(new CompraRapida(vaga), "Gol");
        Thread carro2 = new Thread(new CompraRapida(vaga), "Uno");
        Thread carro3 = new Thread(new CompraRapida(vaga), "Palio");
        
        carro1.start();
        carro2.start();
        carro3.start();
    }
}