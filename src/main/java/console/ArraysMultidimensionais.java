package console;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        InicializadorArrays();
        ArraysMulti();
    }

    public static void ArraysMulti() {
        String[][] tabela = new String[3][3];
        tabela[0][0] = "NOME";
        tabela[0][1] = "IDADE";
        tabela[0][2] = "CIDADE";

        tabela[1][0] = "Simba";
        tabela[1][1] = "12";
        tabela[1][2] = "Campinas";

        tabela[2][0] = "Pudim";
        tabela[2][1] = "0";
        tabela[2][2] = "Paulínia";

        //Estrutura FOR
        for (int i = 0; i < tabela.length; i++) {
            for (int j = 0; j < tabela[i].length; j++) {
                System.out.print(" " + tabela[i][j] + " ");
            }
            System.out.println();
        }

        //Estrutura FOREACH
        for (String[] arrayBase : tabela) {
            for (String campo : arrayBase) {
                System.out.print(" " + campo + " ");
            }
            System.out.println();
        }
    }

    /**
     * Exemplo de Arrays Multidimensionais com tamanhos diferentes
     */
    public static void InicializadorArrays() {
        int[] numeros = new int[]{2, 4, 6, 8};

        int[][] dias = new int[4][];
        dias[0] = new int[2];
        dias[1] = numeros;
        dias[2] = new int[10];
        dias[3] = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        for (int[] arrayBase : dias) {
            for (int dia : arrayBase) {
                System.out.print(" " + dia + " ");
            }
            System.out.println();
        }
    }
}
