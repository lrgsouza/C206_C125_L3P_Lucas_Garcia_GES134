import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        //utilitários
        System.out.println("Entre com nome de dois utilitários:");
        nomes.add(in.nextLine());
        nomes.add(in.nextLine());
        //Caminhões
        System.out.println("Entre com nome de dois caminhões:");
        nomes.add(in.nextLine());
        nomes.add(in.nextLine());
        //motocicletas
        System.out.println("Entre com nome de duas motocicletas:");
        nomes.add(in.nextLine());
        nomes.add(in.nextLine());

        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Utilitario(nomes.get(0),new Random().nextDouble()*100 ));
        veiculos.add(new Utilitario(nomes.get(1),new Random().nextDouble()*100 ));
        veiculos.add(new Caminhão(nomes.get(2),new Random().nextDouble()*100 ));
        veiculos.add(new Caminhão(nomes.get(3),new Random().nextDouble()*100 ));
        veiculos.add(new Motocicleta(nomes.get(4),new Random().nextDouble()*100 ));
        veiculos.add(new Motocicleta(nomes.get(5),new Random().nextDouble()*100 ));

        //não ordenanda
        System.out.println("\nLista de veículos não ordenados\n");

        for (Veiculo veiculo :veiculos) {
            System.out.println("Veículo:"+veiculo.marca);
            System.out.println("Velocidade Média: "+veiculo.VelMedia+" km/h");
        }

        //ordenando
        Collections.sort(veiculos);

        //ordenado
        System.out.println("\nLista de veículos ordenados\n");
        for (Veiculo veiculo :veiculos) {
            System.out.println("Veículo:"+veiculo.marca);
            System.out.println("Velocidade Média: "+veiculo.VelMedia+" km/h");
        }

    }
}
