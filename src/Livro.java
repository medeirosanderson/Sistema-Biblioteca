public class Livro {

    private String titulo;
    private String autor;
    private String categoria;
    private int paginas;
    private boolean disponivel = true;

    
    public Livro(String titulo, String autor, String categoria, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar(){
        if(disponivel){
        System.out.println("Você pegou emprestado o livro " + this.titulo);
        disponivel = false;
        } else {
        System.out.println("O Livro " + this.titulo + " Não está disponivel");            
        }
    }

    public void devolver(){
        if (!disponivel) {
            System.out.println("Você devolveu o livro " + this.titulo);
            disponivel = true;        
        } else {
            System.out.println("Você não pegou Emprestado esse livro para devolver");
        }
    }

    @Override
    public String toString() {
        return "\n Livro: " + titulo + "\n Autor: " + autor + "\n Categoria: " + categoria + "\n Paginas: " + paginas
                + "\n Disponivel: " + disponivel;
    }
    

}