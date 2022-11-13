# PRATICANDO COM SPRING BOOT 3

  <h2> Tópicos abordados: </h2>
  <ul>
    <li> Diferenças do Spring tradicional para a versão 3.0 </li>
    <li> Spring Initializr </li>
    <li> Estrutura de diretórios </li>
    <li> Mudanças do pom.xml </li>
    <li> Configurações em um projeto com Spring Boot via application.yaml </li>
    <li> Como executar e atualizar o DB via Migrations </li>
    <li> Implementação de uma API REST </li>
    <li> Padrão Repository </li>
    <li> Mapeamento de entidades JPA </li>
    <li> Implementação de um CRUD com validações </li>    
  </ul>
  
  
  <h2> Módulos e Stacks </h2>
  <ul>
    <li> Spring WEB </li>
    <li> Spring Data JPA </li>
    <li> Spring Validation </li>
    <li> MySQL</li>
    <li> FlyWay - Migrations</li>
    <li> Lombok </li>
  </ul>


  <h2> Antes de iniciar a aplicação, precisamos executar alguns passos para o banco de dados:</h3>
    <p> 1 - Executar o docker-compose no diretorio do projeto via cmd: docker-compose up</p>
    <p> 2 - Acessar o container do mysql: docker exec -it mysql bash</p>
    <p> 3 - Dentro do container, conectar ao mysql: mysql -u root -p</p>
    <p> 4 - Passar a senha: root</p>
    <p> 5 - Criar o banco de dados da aplicação: create database vollmed_api;</p>
    <p> 6 - Pronto!</p>
    
    
  <h2> Iniciando o projeto: </h2>
    <p> 1 - clonar o projeto </p>
    <p> 2 - Executar os passos do banco de dados descritos acima. </p>
    <p> 3 - Importar o projeto na IDE de sua escolha. </p>
    <p> 3 - Executar o projeto na IDE. </p>
    <p> 4 - Importar a collection da raiz do projeto no Insomnia. </p>
    <p> 5 - Pronto! Agora é só testar! </p>
