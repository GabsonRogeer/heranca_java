package inheritance_exercicio2.entities;

public class PessoaFisica extends TaxaImposto{

    private Double gostosComSaude;

    public PessoaFisica(String nome, Double rendaAnual, Double gostosComSaude) {
        super(nome, rendaAnual);
        this.gostosComSaude = gostosComSaude;
    }

    @Override
    public Double taxa() {
        return null;
    }
}
