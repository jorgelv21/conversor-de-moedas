# Conversor de Moedas

Este projeto é um simples conversor de moedas que permite a conversão entre BRL (Real Brasileiro), USD (Dólar Americano), EUR (Euro), e CNY (Yuan Chinês). A aplicação utiliza uma API externa para obter as taxas de câmbio atuais.

## Estrutura do Projeto

O projeto está organizado nas seguintes pacotes:

- `org.example.menu`: Contém a classe `Menu` que gerencia a interface do usuário e as opções de conversão.
- `org.example.models`: Contém a classe `Conversor` que representa os dados da conversão.
- `org.example.service`: Contém a classe `ConversorService` que lida com a lógica de conversão e comunicação com a API externa.

## Classes

### Menu

A classe `Menu` é responsável por exibir o menu de opções ao usuário e gerenciar as interações. As opções disponíveis são:

1. BRL para USD
2. BRL para EUR
3. BRL para CNY
4. USD para BRL
5. EUR para BRL
6. CNY para BRL
7. Sair

### Conversor

A classe `Conversor` representa os dados necessários para realizar uma conversão, incluindo as moedas base e alvo, o valor a ser convertido, a taxa de conversão e o resultado da conversão.

### ConversorService

A classe `ConversorService` é responsável por realizar a conversão de moedas. Ela se comunica com a API externa [ExchangeRate-API](https://www.exchangerate-api.com) para obter as taxas de câmbio e calcular o valor convertido.

## Dependências

Este projeto depende das seguintes bibliotecas:

- `java.net.http.HttpClient` para realizar requisições HTTP.
- `com.google.gson.Gson` para manipulação de JSON.

## Uso

Para usar o conversor de moedas, execute a classe `Menu` e siga as instruções exibidas no console. Escolha a opção de conversão desejada, informe o valor a ser convertido, e a aplicação exibirá o valor convertido na moeda de destino.

### Exemplo de Execução

```
Bem vindo ao Conversor de moedas.

Selecione uma opção abaixo

1 - BRL - USD
2 - BRL - EUR
3 - BRL - CNY
4 - USD - BRL
5 - EUR - BRL
6 - CNY - BRL
7 - Sair

Escolha uma opção:
1
Informe um valor para converter:
100
Valor convertido USD 19.85
```


## Configuração da API

A API key utilizada para acessar a ExchangeRate-API está definida na classe `ConversorService`. Para usar a sua própria API key, substitua o valor da variável `apiKey` na classe `ConversorService`:

```java
this.apiKey = "YOUR_API_KEY";
```

### Erros Comuns

Certifique-se de ter uma conexão com a internet para que a aplicação possa acessar a API externa.
Verifique se a API key está correta e válida.


### Autor
Este projeto foi desenvolvido por Jorge Vieira.

