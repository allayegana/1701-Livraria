public class Editor {
    private String nome;
    private int ano;
    private String cnpj;;
    private String endereco;
    private String pais;
    private String estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Editor(String nome, int ano, String cnpj, String endereco, String pais, String estado) {
        this.nome = nome;
        this.ano = ano;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.pais = pais;
        this.estado = estado;
    }

    public String retornartodosdados() {
        return "Editor{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", cnpj='" + cnpj + '\'' +
                ", endereco='" + endereco + '\'' +
                ", pais='" + pais + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
