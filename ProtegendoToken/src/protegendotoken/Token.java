package protegendotoken;
public class Token { // Esta é a classe Token, que representa um objeto de token.

    String id;// Variável para armazenar o ID do token.

    // Construtor padrão da classe Token.
    public Token() {       
        // Ao criar uma instância de Token, inicializamos o ID do token com um valor padrão.
        this.id = "Modelo de Id de token";
    }
    
    // Método para obter o ID do token.
    public String getId() {
        return id;
    }

    // Método para definir o ID do token.
    public void setId(String id) {
        this.id = id;
    }
}
