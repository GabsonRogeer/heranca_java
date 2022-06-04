package abstractmethod.program;

import abstractmethod.entities.Circulo;
import abstractmethod.entities.Forma;
import abstractmethod.entities.Retangulo;
import abstractmethod.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Forma> list = new ArrayList<>();

        System.out.println("Insira o número de formas: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Forma #"+ i+" :");
            System.out.print("Retangulo ou Circulo? (r/c)");
            char ch = sc.next().charAt(0);
            System.out.print("Cor (Black/Blue/Red): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r'){
                System.out.println("Largura: ");
                Double largura = sc.nextDouble();
                System.out.println("Altura: ");
                Double altura = sc.nextDouble();
                list.add(new Retangulo(color, largura, altura));
            }
            else {
                System.out.println("Raio: ");
                Double raio = sc.nextDouble();
                list.add(new Circulo(color, raio));
            }
        }

        System.out.println();
        System.out.println("Area das Formas");
        for (Forma forma: list){
            System.out.printf("%.2f%n", forma.area());
        }

        sc.close();
    }
}
