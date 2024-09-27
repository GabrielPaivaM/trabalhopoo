import dataclass.Livro;

import java.util.List;
import java.util.Scanner;

public class CadastroDeLivros {

    Livro CadastrarLivro() {
        Livro livro = new Livro();

        String titulo = "Harry Potter e a Pedra Filosofal";
        livro.setTitulo(titulo);

        String autor = "Clarice Lispector";
        livro.setAutor(autor);

        String genero = "Aventura";
        livro.setGenero(genero);

        int exemplares = 200;
        livro.setExemplares(exemplares);

        String ISBN = "2304-7686-3477-2349-3914";
        livro.setISBN(ISBN);

        String editora = "Warner";
        livro.setEditora(editora);

        int numeroDePaginas = 351;
        livro.setNumeroDePaginas(numeroDePaginas);

        String dataDeLançamento = "1977";
        livro.setDataDeLançamento(dataDeLançamento);

        return livro;
    }
}
