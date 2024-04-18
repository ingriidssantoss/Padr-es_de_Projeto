/**
 * Classe para Bolo de Morango.
 */
public class BoloDeMorango extends Bolo {
    @Override
    public String getDescricao() {
        return "Bolo de morango";
    }

    @Override
    public int getCusto() {
        return 20;  // Assume que o custo padrão é 10, então o dobro é 20
    }
}
