package protegendotoken;

public class ProtegendoToken {
    
    public static void main(String[] args) {
        
        Token chave = new Token();
        
        System.out.println(chave.getId());
        
        String idApi = chave.getId();
        
        System.out.println(idApi);
    }
    
}
