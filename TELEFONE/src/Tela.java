public class Tela {
    public Tela(ModeloTelefone modelo) {
        modelo.adicionarObservador(new ObservadorDigito());
        modelo.adicionarObservador(new ObservadorNumeroCompleto(modelo));
    }
}
