package BuilderComputador.builder;

import java.security.InvalidParameterException;

public class Computador {

    private String processador;
    private int memoriaRam;
    private int armazenamento;
    private String placaVideo;
    private double preco;

    public Computador(Builder builder) {
        this.processador = builder.processador;
        this.memoriaRam = builder.memoriaRam;
        this.armazenamento = builder.armazenamento;
        this.placaVideo = builder.placaVideo;
        this.preco = builder.preco;
    }

    public static class Builder {

        protected String processador;
        protected int memoriaRam;
        protected int armazenamento;
        protected String placaVideo;
        protected double preco;

        public Builder processador(String processador) {
            this.processador = processador;
            return this;
        }

        public Builder memoriaRam(int memoriaRam) {
            if (memoriaRam <= 0) {
                throw new InvalidParameterException(
                    "A memória RAM deve ser maior que zero"
                );
            }

            this.memoriaRam = memoriaRam;
            return this;
        }

        public Builder armazenamento(int armazenamento) {
            if (armazenamento <= 0) {
                throw new InvalidParameterException(
                    "O armazenamento deve ser maior que zero"
                );
            }

            this.armazenamento = armazenamento;
            return this;
        }

        public Builder placaVideo(String placaVideo) {
            this.placaVideo = placaVideo;
            return this;
        }

        public Builder preco(double preco) {
            if (preco < 0) {
                throw new InvalidParameterException(
                    "O preço não pode ser negativo"
                );
            }

            this.preco = preco;
            return this;
        }

        public Computador build() {
            if (processador == null || processador.isEmpty()) {
                throw new InvalidParameterException(
                    "O processador é obrigatório"
                );
            }

            return new Computador(this);
        }
    }

    public String getProcessador() {
        return processador;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public String getPlacaVideo() {
        return placaVideo;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirInformacoes() {
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRam + " GB");
        System.out.println("Armazenamento: " + armazenamento + " GB");
        System.out.println("Placa de vídeo: " + placaVideo);
        System.out.println("Preço: R$ " + preco);
    }
}