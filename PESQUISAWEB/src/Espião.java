public class Espião {

    public Espião(ModeloBuscaWeb modelo) {
        // Observador que imprime "Oh Yes! <consulta>" se a consulta contém a palavra 'friend'.
        modelo.adicionarObservadorConsulta(new ModeloBuscaWeb.ObservadorConsulta() {
            @Override
            public void aoReceberConsulta(String consulta) {
                System.out.println("Oh Yes! " + consulta);
            }

            @Override
            public FiltroConsulta getFiltro() {
                return consulta -> consulta.toLowerCase().contains("friend");
            }
        });

        // Observador que imprime "So long.... <consulta>" se a consulta tiver mais de 60 caracteres.
        modelo.adicionarObservadorConsulta(new ModeloBuscaWeb.ObservadorConsulta() {
            @Override
            public void aoReceberConsulta(String consulta) {
                System.out.println("So long.... " + consulta);
            }

            @Override
            public FiltroConsulta getFiltro() {
                return consulta -> consulta.length() > 60;
            }
        });
    }
}
