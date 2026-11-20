# Projeto Web Services

API REST desenvolvida com Java e Spring Boot para gerenciamento de usuários, pedidos, produtos e categorias. O projeto demonstra o uso do Spring Data JPA para persistência, relacionamentos entre entidades e operações CRUD.

## Tecnologias utilizadas

- Java 25
- Spring Boot 4.1.2
- Spring Web MVC
- Spring Data JPA
- Hibernate
- PostgreSQL
- H2 Database
- Maven, com Maven Wrapper
- JUnit 5 e Spring Boot Test

## Pré-requisitos

- JDK 25
- PostgreSQL, quando usar o perfil `dev`
- Banco de dados PostgreSQL chamado `springboot_course`

O Maven Wrapper já está incluído no projeto, portanto não é necessário instalar o Maven separadamente.

## Instalação e configuração

1. Certifique-se de que o JDK 25 está instalado e disponível no `PATH`.
2. Crie o banco PostgreSQL `springboot_course`.
3. Ajuste a conexão de desenvolvimento em `src/main/resources/application-dev.properties`, caso o usuário, a senha ou o endereço do PostgreSQL sejam diferentes.
4. Execute os comandos descritos abaixo a partir da raiz do projeto.

## Execução

O perfil ativo por padrão é `dev`, conforme `src/main/resources/application.properties`.

No Linux ou macOS:

```bash
./mvnw spring-boot:run
```

No Windows:

```cmd
mvnw.cmd spring-boot:run
```

A aplicação utiliza a porta padrão do Spring Boot, `8080`.

### Executar com o perfil de testes

O perfil `test` utiliza o banco H2 em memória e configura dados iniciais.

No Linux ou macOS:

```bash
./mvnw spring-boot:run -Dspring-boot.run.profiles=test
```

No Windows:

```cmd
mvnw.cmd spring-boot:run -Dspring-boot.run.profiles=test
```

Com o perfil `test`, o console do H2 fica disponível em:

```text
http://localhost:8080/h2-console
```

## Testes

No Linux ou macOS:

```bash
./mvnw test
```

No Windows:

```cmd
mvnw.cmd test
```

## Variáveis de ambiente

O projeto não define variáveis de ambiente. As configurações disponíveis são propriedades do Spring declaradas nos arquivos abaixo.

### Configuração geral

Arquivo: `src/main/resources/application.properties`

| Propriedade | Valor padrão | Descrição |
| --- | --- | --- |
| `spring.application.name` | `Projeto-web-services` | Nome da aplicação |
| `spring.profiles.active` | `dev` | Perfil ativo |
| `spring.jpa.open-in-view` | `true` | Mantém a sessão JPA aberta durante a requisição |

### Perfil de desenvolvimento

Arquivo: `src/main/resources/application-dev.properties`

| Propriedade | Valor configurado |
| --- | --- |
| `spring.datasource.url` | `jdbc:postgresql://localhost:5432/springboot_course` |
| `spring.datasource.username` | `postgres` |
| `spring.datasource.password` | `123456` |
| `spring.jpa.hibernate.ddl-auto` | `update` |
| `spring.jpa.show-sql` | `true` |
| `spring.jpa.properties.hibernate.format_sql` | `true` |

### Perfil de testes

Arquivo: `src/main/resources/application-test.properties`

| Propriedade | Valor configurado |
| --- | --- |
| `spring.datasource.url` | `jdbc:h2:mem:testdb` |
| `spring.datasource.username` | `sa` |
| `spring.datasource.password` | vazia |
| `spring.h2.console.enabled` | `true` |
| `spring.h2.console.path` | `/h2-console` |
| `spring.jpa.database-platform` | `H2Dialect` |

## Endpoints principais

| Recurso | Métodos |
| --- | --- |
| `/users` | `GET`, `POST` |
| `/users/{id}` | `GET`, `PUT`, `DELETE` |
| `/orders` | `GET` |
| `/orders/{id}` | `GET` |
| `/products` | `GET` |
| `/products/{id}` | `GET` |
| `/categories` | `GET` |
| `/categories/{id}` | `GET` |

## Estrutura das principais pastas

```text
src/
├── main/
│   ├── java/com/exercicioCursoJava/Projeto/web/services/
│   │   ├── config/       # Configuração e carga inicial de dados do perfil de testes
│   │   ├── entities/     # Entidades JPA e seus relacionamentos
│   │   ├── repositories/ # Repositórios Spring Data JPA
│   │   ├── resources/    # Controladores REST
│   │   └── services/     # Regras de acesso aos dados
│   └── resources/
│       ├── application.properties
│       ├── application-dev.properties
│       └── application-test.properties
└── test/
    └── java/             # Testes da aplicação
```
