package inheritance_exercicio1.entities;

public class ProdutoImportado extends Produto {

    private Double taxaImportacao;

    public ProdutoImportado(String nome, Double preço, Double taxaImportacao) {
        super(nome, preço);
        this.taxaImportacao = taxaImportacao;
    }

    public Double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(Double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public double total() {
        return getPreço() + taxaImportacao;
    }

    @Override
    public String Etiqueta() {
        return getNome()
                + " $"
                + String.format("%.2f", total())
                + " (Taxa de Importação: $"
                + String.format("%.2f", taxaImportacao)
                + ")";
    }


}
