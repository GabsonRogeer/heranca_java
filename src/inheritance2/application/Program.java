package inheritance2.application;

import inheritance2.entities.Funcionario;
import inheritance2.entities.FuncionarioTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> list = new ArrayList<>();

        System.out.print("Insira a quantidade de funcionarios: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Dados do funcionário #" + i + " :");
            System.out.print("O funcionário é terceirizado? (y/n)");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por horas: ");
            double valorPorHora = sc.nextDouble();
            if (ch == 'y') {
                System.out.print("Taxa adicional: ");
                double taxaAdicional = sc.nextDouble();
                list.add(new FuncionarioTerceirizado(nome, horas, valorPorHora, taxaAdicional));
            } else {
                list.add(new Funcionario(nome, horas, valorPorHora));
            }
        }
        System.out.println();
        System.out.println("PAGAMENTOS:");
        for (Funcionario emp : list){
            System.out.println(emp.getNome() + " - $" + String.format("%.2f", emp.pagamento()) );
        }

        sc.close();
    }
}
