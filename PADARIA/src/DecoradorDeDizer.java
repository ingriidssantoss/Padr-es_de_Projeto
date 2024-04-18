/**
 * Decorador para adicionar uma frase ao bolo.
 */
public class DecoradorDeDizer extends DecoradorDeBolo {
    private String dizer;

    public DecoradorDeDizer(Bolo boloDecorado, String dizer) {
        super(boloDecorado);
        this.dizer = dizer;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " com dizer '" + dizer + "'";
    }
}
