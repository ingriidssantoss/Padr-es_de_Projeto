public class ObservadorNumeroCompleto implements Observador {
    private final ModeloTelefone modelo;

    public ObservadorNumeroCompleto(ModeloTelefone modelo) {
        this.modelo = modelo;
    }

    @Override
    public void atualizar(int digito) {
        if (modelo.getDigitos().size() == 12) {
            System.out.print("Agora discando ");
            for (Integer d : modelo.getDigitos()) {
                System.out.print(d);
            }
            System.out.println("...");
        }
    }
}
