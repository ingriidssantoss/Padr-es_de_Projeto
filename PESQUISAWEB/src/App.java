import java.io.File;

public class App {
    public static void main(String[] args) {
        File arquivoTextoEntrada = new File("PESQUISAWEB/src/Hamlet.txt");

        ModeloBuscaWeb modelo = new ModeloBuscaWeb(arquivoTextoEntrada);
        new Espião(modelo);

        modelo.simularBusca();
    }
}
