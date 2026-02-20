# API de Agendamento de Tarefas com Spring Boot, JWT e MongoDB

Esta aplicação é uma API backend desenvolvida utilizando Java e Spring Boot para gerenciamento e agendamento de tarefas, com autenticação segura baseada em JWT e persistência em banco de dados MongoDB.

O projeto demonstra conhecimentos em desenvolvimento backend, segurança com Spring Security, autenticação stateless com JWT, integração entre serviços e arquitetura em camadas.

---

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Spring Data MongoDB
- MongoDB
- Spring Cloud OpenFeign
- Gradle
- Git
- Lombok

---

## Funcionalidades

- Cadastro de usuários
- Autenticação com JWT
- Autorização baseada em token
- Criação de tarefas
- Atualização de tarefas
- Consulta de tarefas
- Persistência de dados com MongoDB
- Integração com serviço externo via OpenFeign
- Proteção de endpoints com Spring Security

---

## Arquitetura

O projeto segue arquitetura em camadas para melhor organização e separação de responsabilidades:
Controller → Business → Infrastructure → Database

Camada de segurança:
Security → JWT Filter → Authentication → Authorization
