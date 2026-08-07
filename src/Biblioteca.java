import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void emprestarLivro(String titulo){
        for (Livro livro : livros) {
            if(livro.getTitulo().equals(titulo)){
                livro.emprestar();
            }
        }
    }

    public void devolverLivro(String titulo){
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livro.devolver();
            }
        }
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void livrosDisponiveis() {
        for (Livro livro : livros) {
            if(livro.isDisponivel()){
                System.out.println(livro);
            }
        }
    }

    public void livrosCategoria(String categoria){
        for (Livro livro : livros) {
            if(livro.getCategoria().equals(categoria)){
                System.out.println(livro);
            }
        }
    }
}



