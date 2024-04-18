public class App {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarBolo(new BoloDeChocolate());
        
        // Bolo de baunilha "PLAIN"
        pedido.adicionarBolo(new DecoradorDeDizer(new BoloDeBaunilha(), "PLAIN"));
        
        // Bolo de baunilha com granulado "FANCY"
        pedido.adicionarBolo(new DecoradorDeDizer(new DecoradorDeGranulado(new BoloDeBaunilha()), "FANCY"));
        
        // Camadas múltiplas de bolo de morango com duplo granulado "EVERYTHING"
        Bolo boloComplexo = new DecoradorDeCamadas(new BoloDeMorango());
        boloComplexo = new DecoradorDeGranulado(boloComplexo); // Uma camada de granulado
        boloComplexo = new DecoradorDeGranulado(boloComplexo); // Duas camadas de granulado
        boloComplexo = new DecoradorDeDizer(boloComplexo, "EVERYTHING");
        pedido.adicionarBolo(boloComplexo);

        pedido.imprimirPedido();
    }
}
