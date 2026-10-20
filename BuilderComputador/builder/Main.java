package BuilderComputador.builder;

public class Main {

    public static void main(String[] args) {

        ComputadorGamer gamer = ComputadorGamer.criar();

        System.out.println("=== COMPUTADOR GAMER ===");
        gamer.exibirInformacoes();

        System.out.println();

        ComputadorNormal normal = ComputadorNormal.criar();

        System.out.println("=== COMPUTADOR NORMAL ===");
        normal.exibirInformacoes();
    }
}