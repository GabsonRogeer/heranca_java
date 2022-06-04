package inheritance_exercicio1.program;

import inheritance_exercicio1.entities.Produto;
import inheritance_exercicio1.entities.ProdutoImportado;
import inheritance_exercicio1.entities.ProdutoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);
        List<Produto> list = new ArrayList<>();

        System.out.println("Insira o número de Produtos: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Dados do produto #" + n + ": ");
            System.out.println("Comum, Usado ou Importado? (c / u / i)");
            char type = sc.next().charAt(0);
            System.out.print("Nome:");
            String nome = sc.next();
            System.out.print("Preço: ");
            Double preco = sc.nextDouble();
            if (type == 'c') {
                list.add(new Produto(nome, preco));
            } else if (type == 'u') {
                System.out.print("Data de Fabricação: (DD/MM/AAAA)  ");
                Date data = sdf.parse(sc.next());
                list.add(new ProdutoUsado(nome, preco, data));
            } else {
                System.out.print("Taxa de importação: ");
                double taxa = sc.nextDouble();
                list.add(new ProdutoImportado(nome, preco, taxa));
            }
        }

        System.out.println();
        System.out.println("Preço total: ");
        for (Produto prod : list){
            System.out.println(prod.Etiqueta());
        }

        sc.close();



    }
}
