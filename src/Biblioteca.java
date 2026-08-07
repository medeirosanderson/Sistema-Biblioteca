import java.util.ArrayList;
import java.util.Comparator;
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
            if(livro.getCategoria().equalsIgnoreCase(categoria)){
                System.out.println(livro);
            }
        }
    }

    public void livrosTitulo(){
        //Criei esse metodo para apresentar os livros por ordem alfabetica
        livros.stream()
        .map(Livro::getTitulo)
        .sorted()
        .forEach(System.out::println);
    }

    public void livrosPagina() {
        //Criei esse metodo para ordenar os livros utilizando as paginas como comparador
        livros.stream()
        .sorted(Comparator.comparingInt(Livro::getPaginas))
        .forEach(System.out::println);
    }
}



