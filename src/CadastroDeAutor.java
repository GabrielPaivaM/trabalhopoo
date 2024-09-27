import dataclass.Autor;

import java.util.Scanner;

public class CadastroDeAutor {

    Autor CadastrarAutor() {
        Autor autor = new Autor();

        String nome = "Clarice Lispector";
        autor.setNome(nome);

        int idade = 57;
        autor.setIdade(idade);

        return autor;
    }
}
