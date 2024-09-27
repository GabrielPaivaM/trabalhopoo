import dataclass.Socio;

public class CadastroDeSocio {
    Socio CadastrarSocio() {
        Socio socio = new Socio();

        String nome = "Gabriel Paiva";
        socio.setNome(nome);

        String CPF = "723.498.326-23";
        socio.setCPF(CPF);

        String RG = "24.24-283";
        socio.setRG(RG);

        String dataDeNascimento = "09/03/2005";
        socio.setDataDeNascimento(dataDeNascimento);

        int quantidadeDeLivrosLocados = 0;
        socio.setQuantidadeDeLivrosLocados(quantidadeDeLivrosLocados);

        return socio;
    }
}
