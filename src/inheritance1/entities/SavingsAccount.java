package inheritance1.entities;

public class SavingsAccount extends Account {
    private double taxaDeJuros;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer numero, String nome, double saldo, double taxaDeJuros) {
        super(numero, nome, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public double getInterestRate() {
        return taxaDeJuros;
    }

    public void setInterestRate(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public void updateBalance() {
        saldo += saldo * taxaDeJuros;
    }
}
