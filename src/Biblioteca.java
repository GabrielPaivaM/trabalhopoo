import dataclass.Autor;
import dataclass.Livro;
import dataclass.Socio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Biblioteca extends ConsoleColors {
    public static void main(String[] args) {
        CadastroDeLivros cdl = new CadastroDeLivros();
        CadastroDeAutor cda = new CadastroDeAutor();
        CadastroDeSocio cds = new CadastroDeSocio();

        List<Livro> livrosCadastrados = new ArrayList<>();
        List<Socio> sociosCadastrados = new ArrayList<>();
        List<Autor> autoresCadastrados = new ArrayList<>();

        Boolean t = true;
        while (t) {
            limparConsole();
            System.out.println(YELLOW + "Rogeres Gabriel Paiva Matos - 2312130168\n" + RESET);

            System.out.println(WHITE + "Óla seja bem-vindo à biblioteca!\n" + RESET);

            System.out.println(WHITE + "[1] Cadastrar Livro" + RESET);
            System.out.println(WHITE + "[2] Cadastrar Autor" + RESET);
            System.out.println(WHITE + "[3] Cadastrar Socio" + RESET);
            System.out.println(WHITE + "[4] Alugar livro" + RESET);
            System.out.println(WHITE + "[5] Devolver livro" + RESET);
            System.out.println(CYAN + "[6] Exibir informações" + RESET);
            System.out.println(WHITE + "[7] Sair" + RESET);

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

                    System.out.println(GREEN + "Livro Cadastrado\n");
                    System.out.println(WHITE + adata.getTitulo() + " de " + adata.getDataDeLançamento() + "\n");

                    System.out.print(RED + "Pressione ENTER para continuar");
                    scanner.nextLine();
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

                    System.out.println(GREEN + "Autor Cadastrado\n");
                    System.out.println(WHITE + cdata.getNome() + " de " + cdata.getIdade() + " Anos" + "\n");

                    System.out.print(RED + "Pressione ENTER para continuar");
                    scanner.nextLine();
                    break;

                case "3":
                    limparConsole();

                    Socio sdata = cds.CadastrarSocio();
                    sociosCadastrados.add(sdata);

                    System.out.println(GREEN + "Sócio Cadastrado\n");
                    System.out.println(WHITE + sdata.getNome() + " do CPF " + sdata.getCPF() + "\n");

                    System.out.print(RED + "Pressione ENTER para continuar");
                    scanner.nextLine();
                    break;

                case "4":
                    limparConsole();

                        String CPFdeCadastro = "723.498.326-23";
                        String nomeDoLivro = "Harry Potter e a Pedra Filosofal";

                        if (!sociosCadastrados.isEmpty()) {
                            sociosCadastrados.forEach(socio -> {
                                if (socio.getCPF() == CPFdeCadastro) {
                                    if (!(socio.getQuantidadeDeLivrosLocados() > 0)) {
                                        livrosCadastrados.forEach(livro -> {
                                            if (livro.getTitulo() == nomeDoLivro) {
                                                socio.setLivrosLocados(livro);
                                                socio.setQuantidadeDeLivrosLocados(1);
                                            }
                                        });

                                        System.out.println(GREEN + "Livro Alugado com sucesso!\n");
                                        System.out.println(WHITE + "Livro " + nomeDoLivro + " para a pessoa do CPF " + CPFdeCadastro + "\n");

                                        System.out.print(RED + "Pressione ENTER para continuar");
                                        scanner.nextLine();
                                    } else {
                                        System.out.println(YELLOW + "O Sócio ja tem um livro alugado!\n");

                                        System.out.print(RED + "Pressione ENTER para continuar");
                                        scanner.nextLine();
                                    }
                                }
                            });
                        } else {
                            System.out.println(RED + "Nenhum sócio cadastrado!\n");

                            System.out.print(RED + "Pressione ENTER para continuar");
                            scanner.nextLine();
                        }
                    break;

                case "5":
                    limparConsole();

                    String CPFdeCadastro_ = "723.498.326-23";

                    if (!sociosCadastrados.isEmpty()) {
                        sociosCadastrados.forEach(socio -> {
                            if (socio.getCPF() == CPFdeCadastro_) {
                                socio.setQuantidadeDeLivrosLocados(0);
                                socio.clearLivrosLocados();
                            }
                        });
                    }

                    System.out.println(YELLOW + "Livro do socio de CPF " + CPFdeCadastro_ + " foi devolvido com sucesso!\n");

                    System.out.print(RED + "Pressione ENTER para continuar");
                    scanner.nextLine();

                    break;

                case "6":
                    limparConsole();

                    System.out.println(CYAN + "Livros:" + RESET);

                    if (!livrosCadastrados.isEmpty()) {
                        for (int i = 0; i < livrosCadastrados.size(); i++) {
                            System.out.println(WHITE + livrosCadastrados.get(i).getTitulo() + RESET);
                        }
                    }

                    System.out.println(YELLOW + "\nAutores:" + RESET);

                    if (!autoresCadastrados.isEmpty()) {
                        for (int i = 0; i < autoresCadastrados.size(); i++) {
                            System.out.println(WHITE + autoresCadastrados.get(i).getNome() + RESET);
                        }
                    }

                    System.out.println(GREEN + "\nSócios:" + RESET);

                    if (!sociosCadastrados.isEmpty()) {
                        for (int i = 0; i < sociosCadastrados.size(); i++) {
                            System.out.println(WHITE + sociosCadastrados.get(i).getNome() + RESET);
                        }
                    }

                    System.out.print("\n" + RED + "Pressione ENTER para continuar");
                    scanner.nextLine();
                    break;

                case "7":

                    t = false;
                    break;
                default:

                    break;
            }
        }
    }
}