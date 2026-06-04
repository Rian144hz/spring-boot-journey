# Projeto Spring Boot

Este projeto foi desenvolvido acompanhando as aulas do professor Nelio Alves. É uma API REST completa para gerenciamento de recursos, cobrindo o fluxo de dados desde o banco de dados até as respostas HTTP.

## Funcionalidades principais
* Cadastro de novos registros (Insert)
* Atualização de dados existentes (Update)
* Remoção de registros com tratamento de integridade (Delete)
* Tratamento global de exceções para respostas HTTP limpas (como erros 404)

## Conceitos de mapeamento objeto-relacional aplicados
Durante o desenvolvimento do domínio da aplicação, foram implementados os seguintes relacionamentos do JPA/Hibernate:
* Many-to-One
* One-to-Many
* Many-to-Many
* One-to-One

## Tecnologias utilizadas
* Java
* Spring Boot
* Spring Data JPA
* Banco de dados H2
* Maven
