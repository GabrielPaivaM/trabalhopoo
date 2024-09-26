import dataclass.Livro;

import java.util.List;
import java.util.Scanner;

public class CadastroDeLivros {

    Livro CadastrarLivro() {
        Livro livro = new Livro();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o Titulo do livro? ");
        String titulo = scanner.nextLine();
        livro.setTitulo(titulo);

        System.out.print("\nQual o Autor do livro? ");
        String autor = scanner.nextLine();
        livro.setAutor(autor);

        System.out.print("\nQual o Genero do livro? ");
        String genero = scanner.nextLine();
        livro.setGenero(genero);

        System.out.print("\nQuantos exemplares disponiveis do livro? ");
        int exemplares = scanner.nextInt();
        scanner.nextLine();
        livro.setExemplares(exemplares);

        System.out.print("\nQual o código ISBN do livro? ");
        String ISBN = scanner.nextLine();
        livro.setISBN(ISBN);

        System.out.print("\nQual o editora do livro? ");
        String editora = scanner.nextLine();
        livro.setEditora(editora);

        System.out.print("\nQual o numero de paginas do livro? ");
        int numeroDePaginas = scanner.nextInt();
        scanner.nextLine();
        livro.setNumeroDePaginas(numeroDePaginas);

        System.out.print("\nQual a data de lançamento do livro? ");
        String dataDeLançamento = scanner.nextLine();
        livro.setDataDeLançamento(dataDeLançamento);

        return livro;
    }
}
