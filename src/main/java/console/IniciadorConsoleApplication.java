package console;

/**
 * Revisão da sintaxe para loop em array em Java
 */
public class IniciadorConsoleApplication {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        nomes[0] = "Pudim";
        nomes[1] = "Simba";
        nomes[2] = "Smeagol";
        nomes[3] = "Careca";
        nomes[4] = "Lady";

        //Formato For padrão
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("FOR: " + nomes[i]);
        }

        //Formato Foreach
        for (String nome : nomes) {
            System.out.println("FOREACH: " + nome);
        }
    }
}
