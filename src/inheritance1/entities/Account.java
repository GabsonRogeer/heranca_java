package inheritance1.entities;

public class Account {

    private Integer numero;
    private String nome;
    protected double saldo;

    public Account () {

    }

    public Account(Integer numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        saldo -= valor + 5.0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

}
