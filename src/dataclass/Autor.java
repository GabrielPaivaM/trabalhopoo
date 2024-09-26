package dataclass;

import java.util.List;

public class Autor {
    String nome;
    Integer idade;
    List<Livro> livrosPublicados;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public List<Livro> getLivrosPublicados() {
        return livrosPublicados;
    }

    public void setLivrosPublicados(Livro livro) {
        this.livrosPublicados.add(livro);
    }
}
