import java.util.ArrayList;
import java.util.List;

/**
 * Classe para armazenar uma coleção de bolos pedidos por um cliente.
 */
public class Pedido {
    private final List<Bolo> bolos = new ArrayList<>();

    public void adicionarBolo(Bolo bolo) {
        bolos.add(bolo);
    }

    public void imprimirPedido() {
        for (Bolo bolo : bolos) {
            System.out.printf("   %2d  %s\n", bolo.getCusto(), bolo.getDescricao());
        }
    }
}
