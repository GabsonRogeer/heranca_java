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


}
