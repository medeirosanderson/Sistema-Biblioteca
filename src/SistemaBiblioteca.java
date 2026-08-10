import java.util.Scanner;

public class SistemaBiblioteca {

    static Biblioteca biblioteca = new Biblioteca();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        inicializarLivros();
        menu();

        scanner.close();
    }

    public static void inicializarLivros() {

        biblioteca.adicionarLivro(new Livro("Java", "Deitel", "Tecnologia", 810));
        biblioteca.adicionarLivro(new Livro("Clean Code", "Robert Martin", "Tecnologia", 487));
        biblioteca.adicionarLivro(new Livro("O Dilema do porco espinho", "Leandro Karnal", "Auto Ajuda", 315));
        biblioteca.adicionarLivro(new Livro("O Senhor dos Aneis", "J R R Tolkien", "Fantasia", 298));
        biblioteca.adicionarLivro(new Livro("O Pequeno Principe", "Antonie de Saint", "Fantasia", 185));
        biblioteca.adicionarLivro(new Livro("Diario de um Banana", "Jeff Kinnemy", "Ficção", 115));
        biblioteca.adicionarLivro(new Livro("Diario de Aventuras da Ellie", "Ruth M Barshaw", "Ficção", 130));
    }

    public static void menu() {

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("==================================================");
            System.out.println("\t\tSistema Biblioteca");
            System.out.println("==================================================");
            System.out.println("[1] - Livros");
            System.out.println("[2] - Emprestar - Devolver");
            System.out.println("[0] - Sair");
            System.out.print("Digite sua opção: ");

            if (scanner.hasNextInt()) {

                opcao = scanner.nextInt();
                scanner.nextLine();

            } else {

                System.out.println("Digite apenas um número!");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {

                case 1:
                    livrosDisponiveis();
                    break;

                case 2:
                    emprestarDevolver();
                    break;

                case 0:
                    System.out.println("Você saiu do sistema!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    public static void livrosDisponiveis() {

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("==================================================");
            System.out.println("\t\tLivros Disponiveis");
            System.out.println("==================================================");
            System.out.println("[1] - Todos os Livros");
            System.out.println("[2] - Por Categoria");
            System.out.println("[0] - Voltar pro menu");
            System.out.print("Digite sua opção: ");

            if (scanner.hasNextInt()) {

                opcao = scanner.nextInt();
                scanner.nextLine();

            } else {

                System.out.println("Digite apenas um número!");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {

                case 1:
                    System.out.println("==================================================");
                    System.out.println("\t\tLivros Disponiveis");
                    System.out.println("==================================================");
                    biblioteca.listarLivros();;
                    break;

                case 2:
                    System.out.println("==================================================");
                    System.out.println("\t\tLivros Categoria");
                    System.out.println("==================================================");
                    biblioteca.agruparCategorias();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    public static void emprestarDevolver() {

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("==================================================");
            System.out.println("\t\tEmprestar / Devolver");
            System.out.println("==================================================");
            System.out.println("[1] - Pegar Emprestado");
            System.out.println("[2] - Devolver");
            System.out.println("[0] - Voltar pro menu");
            System.out.print("Digite sua opção: ");

            if (scanner.hasNextInt()) {

                opcao = scanner.nextInt();
                scanner.nextLine();

            } else {

                System.out.println("Digite apenas um número!");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {

                case 1:
                    String nomeLivro;
                    System.out.println("==================================================");
                    System.out.println("\t\tEmprestimo de Livro");
                    System.out.println("==================================================");
                    System.out.println("Digite o nome do livro: ");
                    nomeLivro = scanner.nextLine();
                    biblioteca.emprestarLivro(nomeLivro);
                    break;

                case 2:
                    System.out.println("==================================================");
                    System.out.println("\t\tDevolver Livro");
                    System.out.println("==================================================");
                    System.out.println("Digite o nome do livro: ");
                    nomeLivro = scanner.nextLine();
                    biblioteca.devolverLivro(nomeLivro);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}