package console;

/**
 * VarArgs nos possibilita passar o array com os dados individualmente. (int... numeros)
 * Em C# temos o params que faz o equivalente. (params int[] numeros)
 */
public class Varargs {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};

        ListarNumeros();
        ListarNumeros(numeros);
        ListarNumeros(10, 9, 8, 7, 6);
    }

    public static void ListarNumeros(int... numeros) {
        for (int numero : numeros) {
            System.out.println(numero);
        }
        System.out.println("Quantidade: " + numeros.length);
        System.out.println("-------------");
    }
}
