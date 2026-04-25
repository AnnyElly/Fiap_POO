public class Pacote {
    private String codigo;
    private double peso;
    private String status;

    public Pacote(String codigo, double peso) {
        this.codigo = codigo;
        setPeso(peso);
        this.status = "Pendente";
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso inválido");
        }
        this.peso = peso;
    }

    public String getStatus() {
        return status;
    }

    public void atualizarStatus(String status) {
        this.status = status;
    }
}