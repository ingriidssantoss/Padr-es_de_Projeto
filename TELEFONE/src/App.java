public class App {
    public static void main(String[] args) {
        final int NUM_DIGITOS = 12;

        ModeloTelefone modelo = new ModeloTelefone();
        new Tela(modelo);
        Teclado teclado = new Teclado(modelo);

        teclado.simularPressionamentoTeclas(NUM_DIGITOS);
    }
}
