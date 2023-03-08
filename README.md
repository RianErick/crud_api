<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>README - Back End de um sistema de CRUD de Alunos</title>
  </head>
  <body>
    <h1>README - Back End de um sistema de CRUD de Alunos</h1>
    <p>Este projeto é um back end para um sistema de CRUD de Alunos, que permite a criação, leitura, atualização e deleção de informações sobre alunos. O sistema utiliza Spring Data JPA para a comunicação com o banco de dados MySQL e foi desenvolvido em Java 17.</p>

<h2>Requisitos</h2>

<ul>
  <li>JDK 17 ou superior</li>
  <li>Maven 3.6 ou superior</li>
  <li>MySQL 8.0 ou superior</li>
</ul>

<h2>Configuração do Banco de Dados</h2>

<p>Antes de iniciar a aplicação, é necessário criar o banco de dados e configurar as credenciais no arquivo <code>application.properties</code>:</p>

<pre>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>README - Back End de um sistema de CRUD de Alunos</title>
  </head>
  <body>
    <h1>README - Back End de um sistema de CRUD de Alunos</h1>
less
Copy code
<p>Este projeto é um back end para um sistema de CRUD de Alunos, que permite a criação, leitura, atualização e deleção de informações sobre alunos. O sistema utiliza Spring Data JPA para a comunicação com o banco de dados MySQL e foi desenvolvido em Java 17.</p>

<h2>Requisitos</h2>

<ul>
  <li>JDK 17 ou superior</li>
  <li>Maven 3.6 ou superior</li>
  <li>MySQL 8.0 ou superior</li>
</ul>

<h2>Configuração do Banco de Dados</h2>

<p>Antes de iniciar a aplicação, é necessário criar o banco de dados e configurar as credenciais no arquivo <code>application.properties</code>:</p>

<pre>
spring.datasource.url=jdbc:mysql://localhost:3306/crud_alunos
spring.datasource.username=<seu_username>
spring.datasource.password=<sua_senha>
</pre>
<p>O banco de dados será criado automaticamente durante a inicialização da aplicação graças à biblioteca Flyway, que irá executar as migrações necessárias.</p>

<h2>Como executar a aplicação</h2>

<p>Para executar a aplicação, basta rodar o comando <code>mvn spring-boot:run</code> na pasta raiz do projeto.</p>

<p>A aplicação irá subir na porta 8080 por padrão. Para acessar o Swagger e testar os endpoints, basta acessar o seguinte endereço: <code>http://localhost:8080/swagger-ui.html</code></p>

<h2>Endpoints disponíveis</h2>

<p>Abaixo estão listados os endpoints disponíveis na aplicação:</p>

<ul>
  <li><code>GET /alunos</code>: Retorna uma lista de todos os alunos cadastrados.</li>
  <li><code>GET /alunos/{id}</code>: Retorna os detalhes de um aluno específico.</li>
  <li><code>POST /alunos</code>: Cria um novo aluno.</li>
  <li><code>PUT /alunos/{id}</code>: Atualiza os dados de um aluno específico.</li>
  <li><code>DELETE /alunos/{id}</code>: Remove um aluno específico.</li>
</ul>


