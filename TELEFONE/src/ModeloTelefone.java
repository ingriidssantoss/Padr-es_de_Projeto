import java.util.ArrayList;
import java.util.List;

public class ModeloTelefone {
    private List<Integer> digitos = new ArrayList<>();
    private List<Observador> observadores = new ArrayList<>();

    public void adicionarDigito(int novoDigito) {
        digitos.add(novoDigito);
        notificarObservadores(novoDigito);
    }

    public List<Integer> getDigitos() {
        return digitos;
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    private void notificarObservadores(int novoDigito) {
        for (Observador observador : observadores) {
            observador.atualizar(novoDigito);
        }
    }
}
