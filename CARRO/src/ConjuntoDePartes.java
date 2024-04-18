import java.util.ArrayList;
import java.util.List;

// Conjunto de Partes (Composite)
public class ConjuntoDePartes implements Componente {
    private String nome;
    private List<Componente> componentes = new ArrayList<>();

    public ConjuntoDePartes(String nome) {
        this.nome = nome;
    }

    public void adicionar(Componente componente) {
        componentes.add(componente);
    }

    @Override
    public double calcularPeso() {
        double somaParcial = 0;
        System.out.println("Calculando peso para " + nome + ":");
        for (Componente componente : componentes) {
            somaParcial += componente.calcularPeso();
        }
        System.out.println("Total parcial para " + nome + ": " + somaParcial);
        return somaParcial;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
