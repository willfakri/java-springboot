package console;

import com.empresa.iniciardor_app.domain.Pessoa;

public class ModificadoresDeAcesso {
    public static void main(String[] args) {
        var pessoa = new Pessoa();
        pessoa.setNome("Peteco");
        pessoa.setIdade(1);
        pessoa.setGenero('M');

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Gênero: " + pessoa.getGenero());
    }
}
