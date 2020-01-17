public class Livro {
    private String titulo;
    private String totalPaginas;
    private boolean aberto;
    private String genero;
    private String autor;
    private String Editora;
    private int paginaAtual;
    private String anopublicacao;


    public void abrirlivro(){
        this.aberto= true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(String totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        aberto= aberto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String editora) {
        Editora = editora;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public String getAnopublicacao() {
        return anopublicacao;
    }

    public void setAnopublicacao(String anopublicacao) {
        this.anopublicacao = anopublicacao;
    }

    public Livro(String titulo, String totalPaginas, String genero, String autor, String editora, String anopublicacao) {
        this.titulo = titulo;
        this.totalPaginas = totalPaginas;
        this.genero = genero;
        this.autor = autor;
        Editora = editora;
        this.paginaAtual = paginaAtual;
        this.anopublicacao = anopublicacao;
        this.paginaAtual = 0;
        this.aberto = false;
    }

    public void abrirLivros(){
        this.aberto= true;
    }

    public void fecharlivros(){
        this.aberto= false;
    }

    public enum genero {
        philosophie,
        Litterature,
        mathematique,
    }


    public String retornartodosdados() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", totalPaginas='" + totalPaginas + '\'' +
                ", Aberto=" + aberto +
                ", genero='" + genero + '\'' +
                ", autor='" + autor + '\'' +
                ", Editora='" + Editora + '\'' +
                ", paginaAtual=" + paginaAtual +
                ", anopublicacao='" + anopublicacao + '\'' +
                '}';
    }

    public void Folhear(int pag){
        this.paginaAtual=pag;
        }
}