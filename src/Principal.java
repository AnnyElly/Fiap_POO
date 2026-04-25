public class Principal {
    public static void main(String[] args) {

        Veiculo caminhao = new Caminhao("ABC1234", 1000.0, 4);

        Pacote pacote = new Pacote("BR999", 10.5);

        Rota rota = new Rota(pacote, caminhao);
        rota.iniciarEntrega();
    }
}