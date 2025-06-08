# Desafio MovieFlix
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/MarcusViniciusGodoy/Desafio_MovieFlix/blob/main/LICENSE)

# Sobre o projeto

Sexto desafio do curso Java Spring Professional, cursos organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").

A proposta é desenvolver uma API RESTful para avaliação de filmes, com foco em autenticação de usuários, cadastro de reviews e relacionamento entre filmes e gêneros.

## UML MovieFlix
![MovieFlix](https://github.com/MarcusViniciusGodoy/assets/blob/main/movie.PNG)

## 📊 Entidades e Relacionamentos
- User: Representa os usuários do sistema. Cada usuário possui nome, e-mail, senha e pode ter múltiplos papéis (roles) associados. Um usuário também pode fazer várias avaliações (reviews).

- Role: Define as permissões de um usuário, como ROLE_MEMBER ou ROLE_VISITOR.

- Review: Representa a avaliação que um usuário faz de um filme. Contém o texto da review, e está associada a um usuário e um filme.

- Movie: Contém dados do filme, como título, subtítulo, ano, URL da imagem e sinopse. Um filme pertence a um gênero e pode ter várias reviews.

- Genre: Representa o gênero de um filme (ex: Ação, Drama, Comédia). Um gênero pode estar associado a vários filmes.

## 🔗 Relacionamentos
- User ↔ Role: Relação many-to-many — um usuário pode ter múltiplas roles, e uma role pode ser atribuída a vários usuários.

- User → Review: Relação one-to-many — um usuário pode fazer várias reviews.

- Movie → Review: Relação one-to-many — um filme pode ter várias reviews.

- Movie → Genre: Relação many-to-one — vários filmes podem pertencer ao mesmo gênero.

## Testes
![Testes](https://github.com/MarcusViniciusGodoy/assets/blob/main/testesMovie.PNG)

## Movie By Id
![MovieId](https://github.com/MarcusViniciusGodoy/assets/blob/main/movieId.PNG)

## Post Review
![Post](https://github.com/MarcusViniciusGodoy/assets/blob/main/postReview.PNG)

## Review
![Review](https://github.com/MarcusViniciusGodoy/assets/blob/main/reviews.PNG)

## Genre 
![Genre](https://github.com/MarcusViniciusGodoy/assets/blob/main/genre.PNG)

### Pré-requisitos
 Para executar este projeto, é necessário ter:
 - [Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) (versão 11 ou superior)
 - [Visual Studio Code](https://code.visualstudio.com/)
 - [Pacote de Extensão Java para VS Code](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

### Instalação
 
 1. Clone o repositório:
    ```bash
    git clone https://github.com/MarcusViniciusGodoy/Desafio_MovieFlix
    ```
 
 2. Acesse o diretório do projeto:
    ```bash
    cd Desafio_MovieFlix
    ```
 
 3. Abra o projeto no Visual Studio Code:
    ```bash
    code .
    ```
 
 4. Compile e execute o projeto com seu compilador Java de preferência.

# Tecnologias Utilizadas
## Back end
- Java
- Spring Boot
- Spring Data JPA
- Spring Security
- JWT (Autenticação)
- Maven

## Testes 
- JUnit 5

# Autor
Marcus Vinícius de Godoy 

https://www.linkedin.com/in/marcus-vin%C3%ADcius-godoy-15b5461a0/

