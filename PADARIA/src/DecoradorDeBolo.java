/**
 * Decorador abstrato para Bolos, seguindo o padrão Decorator.
 */
public abstract class DecoradorDeBolo extends Bolo {
    protected Bolo boloDecorado;

    public DecoradorDeBolo(Bolo boloDecorado) {
        this.boloDecorado = boloDecorado;
    }

    public String getDescricao() {
        return boloDecorado.getDescricao();
    }

    public int getCusto() {
        return boloDecorado.getCusto();
    }
}
