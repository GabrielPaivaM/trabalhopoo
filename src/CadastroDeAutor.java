import dataclass.Autor;

import java.util.Scanner;

public class CadastroDeAutor {

    Autor CadastrarAutor() {
        Autor autor = new Autor();
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nQual o nome do autor? ");
        String nome = scanner.nextLine();
        autor.setNome(nome);

        System.out.print("\nQual a idade do autor? ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        autor.setIdade(idade);

        return autor;
    }
}
