

public class JTP3 {
    public static void main(String[] args) {  
        try {  
            System.out.println("Ei! Estamos dentro do bloco de tentativa agora");
  
            // O trecho de código abaixo nos lançará a exceção aritmética  
            System.out.println(84 / 0);  
        } catch (NullPointerException e) {  
            // O trecho de código abaixo capturará a exceção NullPointerException que é levantada  
            System.out.println("Ei, codificador, a pegadinha: exceção não foi tratada.");  
        } finally {  
            // No caso abaixo do trecho de código Java, estamos anotando que a execução do programa será executada sempre  
            System.out.println("Ei, codificador, finalmente: eu sempre sou executado!");
        }  
        // O pequeno código abaixo que escrevemos para fins de teste será executado  
        System.out.println("Ei, codificador, eu quero executar o moinho de rosca!");
    }  
}
