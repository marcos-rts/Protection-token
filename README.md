# Proteção de token

Este projeto foi criado com o objetivo de proteger chaves de API, tokens ou IDs exclusivos, os quais não devem ser compartilhados publicamente. Isso permite que você hospede seu projeto no GitHub sem expor essas informações sensíveis. No projeto, o ID é armazenado na classe Token, a qual é ocultada utilizando o arquivo .gitignore. Abaixo, você encontrará um guia passo a passo sobre como usar essa abordagem:

## Como Usar

1. Certifique-se de ter um ambiente de desenvolvimento Java configurado.

2. Copie o conteúdo da classe Token para o seu projeto Java.

3. No mesmo diretório em que a classe Token está, crie um arquivo chamado .gitignore, caso ainda não exista.

4. No arquivo .gitignore, adicione a linha: `Token.java` para garantir que o arquivo da classe Token não seja rastreado pelo Git.

5. Abra o arquivo Token.java e adicione a sua chave de API, token ou ID único na variável `id`.

6. Utilize a classe Token para acessar a chave de forma segura em seu projeto. Exemplo:

```java
public class Main {
    public static void main(String[] args) {
        Token token = new Token();
        String id = token.getId();
        System.out.println("ID seguro: " + id);
    }
}
```

Certifique-se de não adicionar o arquivo Token.java ao controle de versão ao fazer commits. Dessa forma, você evita expor sua chave de API publicamente no GitHub.

## Explicação da classe

### Token Class

#### Descrição

A classe `Token` é utilizada para representar um token genérico na qual quer manter protegida ao ser enviado ao github. Um token pode ser qualquer unidade de informação ou marca que é utilizada em um sistema. Neste exemplo, a classe `Token` possui um campo `id` que armazena uma identificação única para o token.

### Métodos

#### Construtor

```java
public Token(){
  // Ao criar uma instância de Token, inicializamos o ID do token com um valor padrão.
  this.id = "Modelo de Id de token a qual quer proteger";
}
```

Este é o construtor padrão da classe `Token`. Ele inicializa o campo `id` com um valor padrão, que neste caso é "Modelo de Id de token" mas ao inves disso voce podera colocar sua chave unica.

#### `getId()`

```java
public String getId(){
   return id;
}
```

Este método retorna o valor atual do campo `id`, que é a identificação do token.

#### `setId(String id)`

```java
public void setId(String id){
    this.id = id;
}
```

Este método permite definir um novo valor para o campo `id`, atualizando assim a identificação do token.


### Contribuição

Se você quiser contribuir para esta classe ou tiver sugestões de melhoria, sinta-se à vontade para abrir uma "solicitação de pull request".

### Licença

Este exemplo é fornecido sob a [licença MIT](LICENSE).

