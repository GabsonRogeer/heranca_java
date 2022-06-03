package inheritance1.entities;

public class BusinessAccount extends Account{

    private Double limiteDeEmprestimo;

    public BusinessAccount() {
        super();

    }

    public BusinessAccount(Integer numero, String nome, double saldo, Double limiteDeEmprestimo) {
        super(numero, nome, saldo);
        this.limiteDeEmprestimo = limiteDeEmprestimo;
    }

    public Double getLimiteDeEmprestimo() {
        return limiteDeEmprestimo;
    }

    public void setLimiteDeEmprestimo(Double limiteDeEmprestimo) {
        this.limiteDeEmprestimo = limiteDeEmprestimo;
    }

    public void emprestimo (double valor) {
        if (valor <= limiteDeEmprestimo) {
            saldo += valor - 10.0;
        }
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
        saldo -= 2.0;
    }
}
