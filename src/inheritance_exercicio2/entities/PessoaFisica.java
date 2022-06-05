package inheritance_exercicio2.entities;

public class PessoaFisica extends ImpostoDeRenda{

    private Double gastosComSaude;

    public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    public Double desconto() {
        double taxa = 0;
        if (gastosComSaude > 0) {
            taxa = gastosComSaude * 50 / 100;
        }
        return taxa;
    }

    @Override
    public Double imposto() {
        double taxa = 0;
        if (rendaAnual <= 2000) {
            taxa = rendaAnual * 15 / 100;
        } else {
            taxa = rendaAnual * 25 / 100;
        }
        return taxa - desconto();
    }
}
