package dataclass;

import java.util.List;

public class Socio {
    String nome;
    String CPF;
    String RG;
    String dataDeNascimento;
    List<Livro> livrosLocados;
    Integer quantidadeDeLivrosLocados;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public List<Livro> getLivrosLocados() {
        return livrosLocados;
    }

    public void setLivrosLocados(List<Livro> livrosLocados) {
        this.livrosLocados = livrosLocados;
    }

    public Integer getQuantidadeDeLivrosLocados() {
        return quantidadeDeLivrosLocados;
    }

    public void setQuantidadeDeLivrosLocados(Integer quantidadeDeLivrosLocados) {
        this.quantidadeDeLivrosLocados = quantidadeDeLivrosLocados;
    }
}
