public abstract class Veiculo {
    private String placa;
    private double capacidadeCarga;

    public Veiculo(String placa, double capacidadeCarga) {
        setPlaca(placa);
        setCapacidadeCarga(capacidadeCarga);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.isEmpty()) {
            throw new IllegalArgumentException("Placa inválida");
        }
        this.placa = placa;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        if (capacidadeCarga <= 0) {
            throw new IllegalArgumentException("Capacidade deve ser positiva");
        }
        this.capacidadeCarga = capacidadeCarga;
    }
}