# 📚 Sistema de Biblioteca em Java

Um sistema de gerenciamento de biblioteca desenvolvido em **Java**, criado com o objetivo de praticar conceitos de **Programação Orientada a Objetos (POO)**, estruturas de dados, métodos, encapsulamento e manipulação de coleções.

O projeto simula as principais operações de uma biblioteca através de um sistema executado pelo terminal, permitindo consultar livros, organizar por categorias e realizar empréstimos e devoluções.

---

## 🚀 Funcionalidades

### 📖 Gerenciamento de livros

* Cadastro de livros no sistema
* Listagem de livros disponíveis
* Organização dos livros por categoria
* Exibição das informações dos livros

### 🔄 Empréstimos

* Realização de empréstimo de livros
* Devolução de livros
* Controle da disponibilidade dos livros
* Busca de livros pelo título

### 🖥️ Menus interativos

O sistema possui menus separados para facilitar a navegação:

```text
==================================================
                Sistema Biblioteca
==================================================
[1] - Livros
[2] - Emprestar - Devolver
[0] - Sair
```

O menu de livros possui opções para visualizar todos os livros ou agrupá-los por categoria.

```text
==================================================
                Livros Disponiveis
==================================================
[1] - Todos os Livros
[2] - Por Categoria
[0] - Voltar pro menu
```

Já o menu de empréstimos permite realizar as operações de retirada e devolução.

---

## 🧠 Conceitos praticados

Este projeto foi desenvolvido principalmente para colocar em prática conceitos estudados durante minha formação em desenvolvimento de software.

Entre eles:

* **Programação Orientada a Objetos**
* Classes e objetos
* Encapsulamento
* Métodos
* Modificadores de acesso
* `ArrayList`
* `Stream API`
* `Collectors`
* `Map`
* `Optional`
* `Scanner`
* Estruturas condicionais
* Estruturas de repetição
* Tratamento de entradas inválidas
* Organização de código em métodos
* Separação de responsabilidades

Um dos pontos trabalhados durante o desenvolvimento foi a organização do sistema em diferentes responsabilidades, evitando concentrar toda a lógica dentro do método `main()`.

---

## 🏗️ Estrutura do projeto

A estrutura principal do projeto foi pensada para separar as responsabilidades entre as classes:

```text
src/
│
├── Livro.java
├── Biblioteca.java
└── SistemaBiblioteca.java
```

### 📕 `Livro`

Representa um livro dentro do sistema.

Possui informações como:

* Título
* Autor
* Categoria
* Quantidade de páginas
* Disponibilidade para empréstimo

### 📚 `Biblioteca`

Responsável pelas operações relacionadas aos livros.

Entre suas responsabilidades estão:

* Adicionar livros
* Listar livros
* Agrupar livros por categoria
* Emprestar livros
* Devolver livros

### 🖥️ `SistemaBiblioteca`

Responsável pela interação com o usuário através do terminal.

O sistema foi organizado utilizando métodos específicos para cada parte do menu:

```text
main()
 │
 ├── inicializarLivros()
 │
 └── menu()
       │
       ├── menuLivros()
       │
       └── menuEmprestimos()
```

Dessa forma, o `main()` permanece mais simples e as funcionalidades ficam distribuídas de maneira mais organizada.

---

## 🛠️ Tecnologias utilizadas

* ☕ **Java**
* 📦 **Java Collections Framework**
* 🔄 **Stream API**
* 🧩 **Programação Orientada a Objetos**
* 💻 **Terminal / Console**

---

## ▶️ Como executar

### 1. Clone o repositório

```bash
git clone https://github.com/SEU-USUARIO/SEU-REPOSITORIO.git
```

### 2. Abra o projeto

Abra o projeto em uma IDE compatível com Java, como:

* IntelliJ IDEA
* Eclipse
* VS Code

### 3. Execute a classe principal

Execute:

```text
SistemaBiblioteca.java
```

O sistema será iniciado diretamente no terminal.

---

## 📌 Exemplo de utilização

Ao iniciar o programa, o usuário encontra o menu principal:

```text
==================================================
                Sistema Biblioteca
==================================================
[1] - Livros
[2] - Emprestar - Devolver
[0] - Sair
Digite sua opção:
```

Ao acessar **Livros**, é possível consultar todos os livros cadastrados ou agrupá-los por categoria.

No menu de empréstimos, o usuário pode informar o título do livro para realizar uma retirada ou devolução.

---

## 📚 Livros utilizados no projeto

Alguns dos livros cadastrados inicialmente no sistema:

| Livro                        | Autor            | Categoria  |
| ---------------------------- | ---------------- | ---------- |
| Java                         | Deitel           | Tecnologia |
| Clean Code                   | Robert Martin    | Tecnologia |
| O Dilema do porco espinho    | Leandro Karnal   | Auto Ajuda |
| O Senhor dos Aneis           | J. R. R. Tolkien | Fantasia   |
| O Pequeno Principe           | Antonie de Saint | Fantasia   |
| Diario de um Banana          | Jeff Kinnemy     | Ficção     |
| Diario de Aventuras da Ellie | Ruth M. Barshaw  | Ficção     |

---

## 🎯 Objetivo do projeto

Este projeto faz parte da minha jornada de aprendizado em **Java e Programação Orientada a Objetos**.

A proposta foi começar com um sistema simples de biblioteca e utilizá-lo para praticar conceitos importantes da linguagem, evoluindo gradualmente a estrutura do código e a organização das responsabilidades.

Além de desenvolver as funcionalidades, o projeto também serviu para praticar a construção de sistemas através de menus, validação de entradas e utilização das ferramentas disponíveis na linguagem Java.

---

## 🔮 Próximos passos

Algumas melhorias que podem ser implementadas futuramente:

* [ ] Cadastro de novos livros pelo usuário
* [ ] Cadastro de usuários
* [ ] Histórico de empréstimos
* [ ] Controle de usuários com livros emprestados
* [ ] Pesquisa por autor
* [ ] Pesquisa por categoria
* [ ] Persistência dos dados
* [ ] Interface gráfica
* [ ] Banco de dados
* [ ] Melhor tratamento de exceções

---

## 👨‍💻 Autor

**Anderson Medeiros**

Estudante de **Análise e Desenvolvimento de Sistemas**, atualmente desenvolvendo projetos para praticar Java, Programação Orientada a Objetos e desenvolvimento de software.

📌 Recife - PE

---

⭐ Se este projeto foi útil para você ou você também está estudando Java, fique à vontade para explorar o código e acompanhar minha evolução!
