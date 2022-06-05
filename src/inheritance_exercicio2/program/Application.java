package inheritance_exercicio2.program;

import inheritance_exercicio2.entities.ImpostoDeRenda;
import inheritance_exercicio2.entities.PessoaFisica;
import inheritance_exercicio2.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<ImpostoDeRenda> list = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data: ");
            System.out.println("Individual or company (i/c)?");
            char ch = sc.next().charAt(0);
            if (ch == 'i') {
                System.out.print("Nome: ");
                String nome = sc.next();
                System.out.print("Ganhos anual: ");
                Double renda = sc.nextDouble();
                System.out.print("Gastos com saúde: ");
                Double gastosSaude = sc.nextDouble();
                list.add(new PessoaFisica(nome, renda, gastosSaude));
            }
            else {
                System.out.print("Nome: ");
                String nome = sc.next();
                System.out.print("Ganhos anual: ");
                Double renda = sc.nextDouble();
                System.out.print("Quantidade de Funcionarios: ");
                Integer qntFuncionarios = sc.nextInt();
                list.add(new PessoaJuridica(nome, renda, qntFuncionarios));
            }

            Double soma = 0.0;
            System.out.println();
            System.out.println("TAXES PAID:");
            for (ImpostoDeRenda imp: list) {
                Double taxa = imp.imposto();
                System.out.println(imp.getNome()+" $ " + String.format("%.2f", taxa));
                soma += taxa;
            }

            System.out.println();
            System.out.println("TOTAL DE IMPOSTO RECOLHIDO: $ " + String.format("%.2f", soma));


        }
        sc.close();
    }
}
