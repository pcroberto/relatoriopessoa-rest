## Instalação e configuração

Para instalar o sistema, é necessário que esteja instalado o docker e docker-compose, assim como o git.

- Clone o projeto
- Acesse o diretório do projeto
- Execute **docker-compose up -d** para iniciar os serviços.
- Acesse os serviços utilizando [http://localhost:8080/](http://localhost:8080/)

## Documentação da API

Este projeto é uma API REST. Abaixo estão as rotas disponíveis com exemplos de informações para os corpos das requisições, quando necessário. Assim como os retornos correspondentes.


``GET /persons`` - Lista todas as pessoas

``GET /persons?page=PAGINA_SELECIONA`` - Lista todas as pessoas cadastradas conforme a paginação


```json
Exemplo: curl -i http://localhost:8080/persons

Retorno:
HTTP/1.1 200 
Content-Type: application/json;charset=UTF-8
Transfer-Encoding: chunked
Date: Wed, 25 Sep 2019 02:19:57 GMT

[
  {
    "id":1,
    "firstName":"Roberto",
    "lastName":"Carneiro",
    "homephone":"1234567891",
    "cellphone":"1223567891",
    "cpf":"02579742026"
  }
]
```

``POST /person`` - Salva uma pessoa

```json
Exemplo: curl -i -H "Content-Type: application/json" -X POST -d \
'{
     "firstName": "Roberto",
     "lastName": "Carneiro",
     "homephone": "1234567891",
     "cellphone": "1223567891",
     "cpf": "02579742026"
 }' http://localhost:8080/person

Retorno:
HTTP/1.1 200 
Content-Type: application/json;charset=UTF-8
Transfer-Encoding: chunked
Date: Wed, 25 Sep 2019 02:29:42 GMT

{
    "id":1,
    "firstName":"Roberto",
    "lastName":"Carneiro",
    "homephone":"1234567891",
    "cellphone":"1223567891",
    "cpf":"02579742026"
}
```   