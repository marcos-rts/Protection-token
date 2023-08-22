package protegendotoken;

public class ProtegendoToken {
    
    public static void main(String[] args) {
        
        // Criando uma instância da classe Token para representar uma chave.
        Token chave = new Token();
        
        // Obtendo e imprimindo o ID da chave recém-criada.
        System.out.println(chave.getId());
        
        // Atribuindo o ID da chave a uma variável chamada "idApi".
        String idApi = chave.getId();
        
        // Imprimindo o ID da chave armazenado na variável "idApi".
        System.out.println(idApi);
    }
    
}
