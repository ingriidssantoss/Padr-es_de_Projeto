/**
 * Decorador para adicionar múltiplas camadas ao bolo.
 */
public class DecoradorDeCamadas extends DecoradorDeBolo {
    public DecoradorDeCamadas(Bolo boloDecorado) {
        super(boloDecorado);
    }

    @Override
    public String getDescricao() {
        return "Camadas múltiplas " + super.getDescricao();
    }

    @Override
    public int getCusto() {
        return super.getCusto() + 5;
    }
}
