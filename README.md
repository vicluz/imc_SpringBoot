Aplicação de Peso Ideal
Esta é uma aplicação desenvolvida em Java com Spring Boot que calcula o Índice de Massa Corporal (IMC) e classifica o peso de uma pessoa. A aplicação permite criar, listar, editar e excluir registros de pessoas.

Tecnologias Utilizadas
Java
Spring Boot
Thymeleaf
H2 Database
Postman
Estrutura do Projeto
O projeto segue a arquitetura MVC (Model-View-Controller) e utiliza o padrão de design DAO (Data Access Object). Abaixo está a estrutura do projeto:


src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── trabalho/
│   │           └── trabalho/
│   │               ├── controller/
│   │               │   └── PessoaController.java
│   │               ├── model/
│   │               │   └── Pessoa.java
│   │               ├── repository/
│   │               │   └── PessoaRepository.java
│   │               └── service/
│   │                   └── PessoaService.java
│   ├── resources/
│   │   ├── static/
│   │   ├── templates/
│   │   │   ├── create.html
│   │   │   ├── edit.html
│   │   │   └── index.html
│   │   └── application.properties
└── test/
    └── java/



Claro! Aqui está um exemplo de README detalhado para o seu projeto:

Aplicação de Peso Ideal
Esta é uma aplicação desenvolvida em Java com Spring Boot que calcula o Índice de Massa Corporal (IMC) e classifica o peso de uma pessoa. A aplicação permite criar, listar, editar e excluir registros de pessoas.

Tecnologias Utilizadas
Java
Spring Boot
Thymeleaf
H2 Database
Postman
Estrutura do Projeto
O projeto segue a arquitetura MVC (Model-View-Controller) e utiliza o padrão de design DAO (Data Access Object). Abaixo está a estrutura do projeto:

css
Copiar código
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── trabalho/
│   │           └── trabalho/
│   │               ├── controller/
│   │               │   └── PessoaController.java
│   │               ├── model/
│   │               │   └── Pessoa.java
│   │               ├── repository/
│   │               │   └── PessoaRepository.java
│   │               └── service/
│   │                   └── PessoaService.java
│   ├── resources/
│   │   ├── static/
│   │   ├── templates/
│   │   │   ├── create.html
│   │   │   ├── edit.html
│   │   │   └── index.html
│   │   └── application.properties
└── test/
    └── java/
Funcionalidades
Listar Pessoas

Endpoint: GET /api/pessoas
Descrição: Lista todas as pessoas cadastradas.
Criar Pessoa

Endpoint: POST /api/pessoas
Descrição: Cria uma nova pessoa.
Payload:

{
  "nome": "Fulano",
  "peso": 70.5,
  "altura": 1.75
}
Atualizar Pessoa

Endpoint: PUT /api/pessoas/{id}
Descrição: Atualiza uma pessoa existente.
Payload

Deletar Pessoa

Endpoint: DELETE /api/pessoas/{id}
Descrição: Deleta uma pessoa pelo ID.
Configuração do Banco de Dados
A aplicação utiliza o banco de dados H2. As configurações do banco de dados estão no arquivo application.properties:





