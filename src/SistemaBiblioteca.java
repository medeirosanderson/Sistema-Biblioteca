public class SistemaBiblioteca {
    public static void main(String[] args) throws Exception {
        Biblioteca biblioteca = new Biblioteca();

    biblioteca.adicionarLivro(new Livro("Java", "Deitel", "Tecnologia", 810));
    biblioteca.adicionarLivro(new Livro("Clean Code", "Robert Martin", "Tecnologia", 487));
    biblioteca.adicionarLivro(new Livro("O Dilema do porco espinho", "Leandro Karnal", "Auto Ajuda", 315));
    biblioteca.adicionarLivro(new Livro("O Senhor dos Aneis", "J R R Tolkien", "Fantasia", 298));
    biblioteca.adicionarLivro(new Livro("O Pequeno Principe", "Antonie de Saint", "Fantasia", 185));
    biblioteca.adicionarLivro(new Livro("Diario de um Banana", "Jeff Kinnemy", "Ficção", 115));
    biblioteca.adicionarLivro(new Livro("Diario de Aventuras da Ellie", "Ruth M Barshaw", "Ficção", 130));
    
    
    biblioteca.livrosDisponiveis();
    
    System.out.println("------------------------------------");
    
    biblioteca.emprestarLivro("Clean Code");
    
    System.out.println("------------------------------------");

    biblioteca.livrosCategoria("ficção");

    System.out.println("------------------------------------");
    System.out.println("\t Livros em Ordem Alfabetica \n");
    biblioteca.livrosTitulo();

    System.out.println("------------------------------------");
    System.out.println("\t Livros Ordenados pelo numero de Paginas \n");
    biblioteca.livrosPagina();;

    }
}
