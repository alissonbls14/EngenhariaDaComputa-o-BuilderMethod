package BuilderComputador.builder;

public class ComputadorNormal extends Computador {

    private ComputadorNormal(Builder builder) {
        super(builder);
    }

    public static ComputadorNormal criar() {
        return new ComputadorNormal(
            new Computador.Builder()
                .processador("Intel Core i5")
                .memoriaRam(8)
                .armazenamento(512)
                .placaVideo("Gráficos integrados")
                .preco(2500.00)
        );
    }
}