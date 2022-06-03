package inheritance2.entities;

public class FuncionarioTerceirizado extends Funcionario{

    private double custoExtra;

    public FuncionarioTerceirizado() {
        super();
    }

    public FuncionarioTerceirizado(String nome, Integer horas, double valorPorHoras, double custoExtra) {
        super(nome, horas, valorPorHoras);
        this.custoExtra = custoExtra;
    }

    public double getCustoExtra() {
        return custoExtra;
    }

    public void setCustoExtra(double custoExtra) {
        this.custoExtra = custoExtra;
    }

    @Override
    public double pagamento(){
        return super.pagamento() + custoExtra * 1.1;
    }
}
