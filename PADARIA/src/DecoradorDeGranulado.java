/**
 * Decorador para adicionar granulado ao bolo.
 */
public class DecoradorDeGranulado extends DecoradorDeBolo {
    public DecoradorDeGranulado(Bolo boloDecorado) {
        super(boloDecorado);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " com granulado";
    }

    @Override
    public int getCusto() {
        return super.getCusto() + 2;
    }
}
