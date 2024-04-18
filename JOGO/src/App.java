import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a localização:");
        System.out.println("1 - Amazônia");
        System.out.println("2 - Sertão");
        System.out.println("3 - Rio de Janeiro");
        System.out.print("Digite o número da localização desejada: ");
        int escolha = scanner.nextInt();

        LocalizacaoFactory factory = escolherLocalizacao(escolha);
        Inimigo inimigo = factory.criarInimigo();
        inimigo.atacar();

        scanner.close();
    }

    private static LocalizacaoFactory escolherLocalizacao(int escolha) {
        switch (escolha) {
            case 1:
                return new AmazoniaFactory();
            case 2:
                return new SertaoFactory();
            case 3:
                return new RioDeJaneiroFactory();
            default:
                System.out.println("Escolha inválida. Defaulting to Amazônia.");
                return new AmazoniaFactory();
        }
    }
}
