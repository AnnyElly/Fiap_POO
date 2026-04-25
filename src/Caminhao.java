public class Caminhao extends Veiculo {
    private int numeroEixos;

    public Caminhao(String placa, double capacidadeCarga, int numeroEixos) {
        super(placa, capacidadeCarga);
        this.numeroEixos = numeroEixos;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }
}