package inheritance2.entities;

public class Funcionario {

    private String nome;
    private Integer horas;
    private double valorPorHoras;

    public Funcionario () {

    }

    public Funcionario(String nome, Integer horas, double valorPorHoras) {
        this.nome = nome;
        this.horas = horas;
        this.valorPorHoras = valorPorHoras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public double getValorPorHoras() {
        return valorPorHoras;
    }

    public void setValorPorHoras(double valorPorHoras) {
        this.valorPorHoras = valorPorHoras;
    }

    public double pagamento () {
        return valorPorHoras * horas;
    }
}
