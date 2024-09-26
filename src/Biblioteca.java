import dataclass.Autor;
import dataclass.Livro;
import dataclass.Socio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public abstract class Biblioteca extends ConsoleColors {
    public static void main(String[] args) {
        CadastroDeLivros cdl = new CadastroDeLivros();
        CadastroDeAutor cda = new CadastroDeAutor();

        List<Livro> livrosCadastrados = new ArrayList<>();
        List<Socio> sociosCadastrados = new ArrayList<>();
        List<Autor> autoresCadastrados = new ArrayList<>();

        Boolean t = true;
        while (t) {
            limparConsole();
            System.out.println(WHITE + "Óla seja bem-vindo à biblioteca!\n" + RESET);

            System.out.println(WHITE + "[1] Cadastrar Livro" + RESET);
            System.out.println(WHITE + "[2] Cadastrar Autor" + RESET);
            System.out.println(WHITE + "[3] Cadastrar Socio" + RESET);
            System.out.println(WHITE + "[4] Alugar livro" + RESET);
            System.out.println(WHITE + "[5] Devolver livro" + RESET);
            System.out.println(WHITE + "[6] Sair" + RESET);

            System.out.print(WHITE + "Escolha uma opção: " + RESET);
            Scanner scanner = new Scanner(System.in);
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":

                    limparConsole();
                    Livro adata = cdl.CadastrarLivro();
                    livrosCadastrados.add(adata);
                    autoresCadastrados.forEach( autor -> {
                        if (adata.getAutor() == autor.getNome()) {
                            autor.setLivrosPublicados(adata);
                        }
                    });

                    break;

                case "2":

                    limparConsole();
                    Autor cdata = cda.CadastrarAutor();
                    autoresCadastrados.add(cdata);

                    livrosCadastrados.forEach( livro -> {
                        if (livro.getAutor() == cdata.getNome()) {
                            cdata.setLivrosPublicados(livro);
                        }
                    });

                    break;
                case "6":

                    t = false;
                    break;
                default:

                    break;
            }
        }
    }
}