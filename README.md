# API de Cadastro de Produtos

Este projeto é uma API REST desenvolvida com Spring Boot para cadastro e consulta de produtos. A aplicação utiliza tecnologias modernas como autenticação JWT, validações de entradas e boas práticas de desenvolvimento, visando proporcionar uma solução escalável e de fácil integração.

## Tecnologias Utilizadas

- **Java 17**: A versão mais recente do Java LTS, oferecendo melhorias de performance e novos recursos.
- **Spring Boot 3**: Framework para construção de aplicações Java com foco em produtividade e escalabilidade.
- **Spring Data JPA**: Utilizado para acesso simplificado ao banco de dados SQL, permitindo fácil persistência e recuperação de dados.
- **JWT (JSON Web Token)**: Implementação de autenticação e autorização utilizando tokens JWT.
- **Swagger/OpenAPI**: Para documentação da API, facilitando o entendimento e uso pelos desenvolvedores.
- **JUnit & Mockito**: Frameworks utilizados para garantir a qualidade do código, através de testes unitários e de integração.

## Funcionalidades

A API oferece os seguintes recursos:

- **Cadastro de Produto**: Permite a criação de novos produtos.
- **Consulta de Produto**: Permite a consulta de produtos cadastrados através do ID.
- **Validações**: Todos os dados de entrada são validados para garantir a integridade da aplicação.
- **Autenticação**: Utiliza JWT para autenticação e autorização dos usuários.
- **Documentação**: A API está completamente documentada via Swagger/OpenAPI.

## Endpoints da API

- **POST /products**: Criação de um novo produto.
  - Corpo da requisição:
    ```json
    {
      "name": "Produto X",
      "description": "Descrição do produto",
      "price": 99.99
    }
    ```
  - Resposta:
    ```json
    {
      "name": "Produto X",
      "description": "Descrição do produto",
      "price": 99.99
    }
    ```

- **GET /products/{id}**: Consulta um produto pelo seu ID.
  - Resposta:
    ```json
    {
      "name": "Produto X",
      "description": "Descrição do produto",
      "price": 99.99
    }
    ```

## Como Rodar a Aplicação Localmente

### Pré-requisitos

1. **Java 17** ou superior instalado.
2. **Maven** ou **Gradle** (dependendo da configuração do seu projeto).
3. **IDE**: Você pode usar qualquer IDE de sua preferência (IntelliJ IDEA, Eclipse, VSCode, etc.).

### Passos

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git

