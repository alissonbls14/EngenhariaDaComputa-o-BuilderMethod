package BuilderComputador.builder;

public class ComputadorGamer extends Computador {

    private ComputadorGamer(Builder builder) {
        super(builder);
    }

    public static ComputadorGamer criar() {
        return new ComputadorGamer(
            new Computador.Builder()
                .processador("AMD Ryzen 7")
                .memoriaRam(32)
                .armazenamento(1000)
                .placaVideo("NVIDIA RTX 4070")
                .preco(7500.00)
        );
    }
}