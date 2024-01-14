import java.security.SecureRandom;
public class matriz{
    public static void main(String[] args){
        final int linha = 3;
        final int coluna = 5;
        int[][] numeros = new int[3][5];

        geraDados(numeros, linha, coluna);
        impDados(numeros, linha, coluna);
    }

    public static void geraDados(int[][] mtz, int linhas, int colunas){
        for(int l = 0; l < linhas; l++){
            for(int c = 0; c < colunas; c++){
                mtz[l][c] = new SecureRandom().nextInt(100);
            }
        }
    }

    public static void impDados(int[][] mtz, int linhas, int colunas){
           for(int l = 0; l < linhas; l++){
            for(int c = 0; c < colunas; c++){
                System.out.printf("%d - ", mtz[l][c]);
            }
            System.out.printf("%n");
        }
    }
}