package inheritance_exercicio2.entities;

public class PessoaJuridica extends ImpostoDeRenda{

    private Integer qntFunc;

    public PessoaJuridica(String nome, Double rendaAnual, Integer qntFunc) {
        super(nome, rendaAnual);
        this.qntFunc = qntFunc;
    }

    public Integer getQntFunc() {
        return qntFunc;
    }

    public void setQntFunc(Integer qntFunc) {
        this.qntFunc = qntFunc;
    }

    @Override
    public Double imposto() {
        double taxa = 0;
        if (qntFunc >= 10) {
            taxa = rendaAnual * 14/ 100;
        } else {
            taxa = rendaAnual * 16 / 100;
        }
        return taxa;
    }
}
