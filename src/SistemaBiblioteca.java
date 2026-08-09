import java.util.Scanner;

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
    
    Scanner scanner = new Scanner(System.in);
    
        int opcao = -1;
        
        while (opcao != 0)  {
            System.out.println("==================================================");
            System.out.println("\t\tSistema Biblioteca");
            System.out.println("==================================================");
            System.out.println("[1] - Livros disponiveis");
            System.out.println("[2] - Pegar emprestado");
            System.out.println("[3] - Devolver Livro");
            System.out.println("[0] - Sair");
            System.out.println("Digite sua opção: ");
            
            if (scanner.hasNextInt()) {
            opcao = scanner.nextInt();
                scanner.nextLine(); // consome o Enter
            } else {
                System.out.println("Digite apenas um número!");
                scanner.nextLine(); // descarta entrada inválida
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println("==================================================");
                    System.out.println("\t\tLivros Disponiveis");
                    System.out.println("==================================================");
                    biblioteca.livrosDisponiveis();
                    break;
                case 2:
                    String nomeLivro;
                    System.out.println("==================================================");
                    System.out.println("\t\tEmprestimo");
                    System.out.println("==================================================");
                    System.out.println("Digite o titulo do livro: ");

                    nomeLivro = scanner.nextLine();

                    biblioteca.emprestarLivro(nomeLivro);
                    break;

                case 3:

                    System.out.println("==================================================");
                    System.out.println("\t\tDevolver Livro");
                    System.out.println("==================================================");
                    System.out.println("Digite o titulo do livro: ");

                    nomeLivro = scanner.nextLine();

                    biblioteca.devolverLivro(nomeLivro);
                    break;


                case 0:
                    System.out.println("Você saiu do sistema!");
                    break;
                default:
                    break;
            }

            } 
        }
}

