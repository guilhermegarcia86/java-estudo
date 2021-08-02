# Projeto de estudos de Java

Projeto usado para estudar a linguagem Java e também estudar frameworks dde mercado como Spring Boot.

## Build do projeto

```bash
mvn clean install
```

## Rodar projeto
```bash
mvn spring-boot:run 
```

Além disso para as dependências externas do projeto será usado Docker Compose para montar o ambiente.

```bash
docker compose up
```

## Usando as APIs
A porta padrão da aplicação é a 8080 e pode usar qual ferramenta de sua escolha.

### Exemplo

```bash
POST http://localhost:8080/agenda

Request
{
    "name": "Guilherme",
    "telephone": "1199999999"
}

Response
{
    "id": 1,
    "name": "Guilherme",
    "telephone": "1199999999"
}
```

```bash
GET http://localhost:8080/agenda?id=1

Response
{
    "id": 1,
    "name": "Guilherme",
    "telephone": "1199999999"
}
```

