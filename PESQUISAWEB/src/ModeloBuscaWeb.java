import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ModeloBuscaWeb {
    private final File arquivoFonte;
    private final List<ObservadorConsulta> observadores = new ArrayList<>();

    public interface ObservadorConsulta {
        void aoReceberConsulta(String consulta);
        FiltroConsulta getFiltro();
    }

    public ModeloBuscaWeb(File arquivoFonte) {
        this.arquivoFonte = arquivoFonte;
    }

    public void simularBusca() {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoFonte))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                notificarTodosObservadores(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void adicionarObservadorConsulta(ObservadorConsulta observadorConsulta) {
        observadores.add(observadorConsulta);
    }

    private void notificarTodosObservadores(String linha) {
        for (ObservadorConsulta observador : observadores) {
            if (observador.getFiltro().deveNotificar(linha)) {
                observador.aoReceberConsulta(linha);
            }
        }
    }
}
