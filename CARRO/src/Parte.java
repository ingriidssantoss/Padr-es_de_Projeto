// Parte concreta do carro (Leaf)
public class Parte implements Componente {
    private String nome;
    private double peso;

    public Parte(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public double calcularPeso() {
        System.out.println("Somando agora o peso de " + nome + ": " + peso + ".");
        return peso;
    }

    @Override
    public String getNome() {
        return nome;
    }
}

