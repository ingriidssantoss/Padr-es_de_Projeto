// Classe principal para construir e calcular o peso do carro
public class App {
    public static void main(String[] args) {
        ConjuntoDePartes carro = new ConjuntoDePartes("Carro Completo");
        carro.adicionar(new Parte("Suspensão", 150));
        carro.adicionar(montarCarroceria());
        carro.adicionar(montarTremDeForca());

        System.out.println("Peso total do carro: " + carro.calcularPeso() + " kg");
    }

    private static ConjuntoDePartes montarCarroceria() {
        ConjuntoDePartes carroceria = new ConjuntoDePartes("Carroceria");
        carroceria.adicionar(new Parte("Para-lamas", 50));
        carroceria.adicionar(new Parte("Portas", 60));
        carroceria.adicionar(new Parte("Painéis", 90));
        carroceria.adicionar(new Parte("Porta-malas", 30));
        carroceria.adicionar(new Parte("Capô", 25));
        return carroceria;
    }

    private static ConjuntoDePartes montarTremDeForca() {
        ConjuntoDePartes tremDeForca = new ConjuntoDePartes("Trem de Força");
        tremDeForca.adicionar(new Parte("Motor", 300));
        tremDeForca.adicionar(new Parte("Transmissão", 100));
        tremDeForca.adicionar(new Parte("Diferencial", 70));
        tremDeForca.adicionar(new Parte("Rodas", 80));
        return tremDeForca;
    }
}

