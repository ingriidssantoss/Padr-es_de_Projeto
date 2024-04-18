/**
 * Classe abstrata para Bolos.
 */
public abstract class Bolo {
    private final int CUSTO_DO_BOLO = 10;

    public int getCusto() {
        return CUSTO_DO_BOLO;
    }

    public abstract String getDescricao();
}
