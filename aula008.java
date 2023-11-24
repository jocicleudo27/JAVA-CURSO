import java.security.SecureRandom;
public class aula008 {
    public static void main(String[]args){
        
        final int linhas = 3;
        final int collunas = 5;
        int[][] numeros = new int[linhas][collunas];

        for(int l =0; l < linhas; l++){
            for(int c = 0; c < collunas; c++){
                numeros[l][c] = new SecureRandom().nextInt(100);
            }
        }
    }
}