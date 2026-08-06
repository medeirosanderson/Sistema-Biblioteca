public class SistemaBiblioteca {
    public static void main(String[] args) throws Exception {
        Biblioteca biblioteca = new Biblioteca();

    biblioteca.adicionarLivro(new Livro("Java", "Deitel", "Tecnologia", 810));
    biblioteca.adicionarLivro(new Livro("Clean Code", "Robert Martin", "Tecnologia", 487));

    biblioteca.emprestarLivro("Java");
    biblioteca.emprestarLivro("Java");

    biblioteca.devolverLivro("Java");
    biblioteca.devolverLivro("Java");
    }
}
