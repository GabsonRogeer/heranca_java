package inheritance_exercicio1.entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {


    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dataDeFabricacao;

    public ProdutoUsado(String nome, Double preço, Date dataDeFabricacao) {
        super(nome, preço);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public Date getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(Date dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    @Override
    public String Etiqueta() {
        return getNome()
                + " (Usado) $"
                + String.format("%.2f", getPreço())
                + " (Data de Fabricação: "
                + sdf.format(dataDeFabricacao)
                + ")";
    }
}
