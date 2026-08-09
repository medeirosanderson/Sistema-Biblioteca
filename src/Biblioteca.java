import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

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

    public void agruparCategorias() {
        Map<String, List<Livro>> livrosCategoria = livros.stream()
        .collect(Collectors.groupingBy(Livro::getCategoria));
        //Aqui eu criei um MAP com todos os livros da minha List e separei por Categoria 
        //utilizando o GroupingBy

        livrosCategoria.forEach((categoria, livros)->{
            System.out.println("\nCategoria: " + categoria);
            livros.forEach(System.out::println);
            
        });
        //Aqui eu criei um forEach pra imprimir esses livros por categoria, utilizando a
        //Chave que defini acima "Categoria" e a Lista que eu vou percorrer "Livros"
    }
    
    public void maiorLivro(){
        Optional<Livro> maxPaginas = livros.stream()
        .max(Comparator.comparingInt(Livro::getPaginas));

        maxPaginas.ifPresent(System.out::println);
    }

    public void mediaPaginas(){
        OptionalDouble media = livros.stream()
        .mapToInt(Livro::getPaginas)
        .average();

        media.ifPresent(i -> {
            System.out.printf("%.1f\n", i);
        });
    }

    public void quantidadeLivrosCategoria (){
            Map<String, List<Livro>> quantidadeCategoria = livros.stream()
            .collect(Collectors.groupingBy(Livro::getCategoria));

            quantidadeCategoria.forEach((categoria , livros) -> {
                System.out.println("\nCategoria: " + categoria + "\nQuantidade: " + livros.size() + "\n");
            });

    }




}



