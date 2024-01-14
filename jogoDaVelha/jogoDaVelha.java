package jogoDaVelha;
import java.util.Scanner;

public class jogoDaVelha{
    
    public static void main(String[] args){
        campo[][] velha = new campo[3][3];
        char simboloAtual = 'X';
        Boolean game =  true;
        String vitoria = "";
        Scanner scan = new Scanner(System.in);

        iniciaJogo(velha);

        while (game) {
            desenharJogo(velha);
            vitoria = verificaVitoria(velha);
            if (!vitoria.equals("")) {
                System.out.printf("Jogador %s venceu", vitoria);
                break;
            }
            try{
                if(verificaJogada(velha, jogar(scan, simboloAtual), simboloAtual)){
                    if(simboloAtual == 'X'){
                        simboloAtual = 'O';
                    }else{
                        simboloAtual = 'X';
                    }
                }
                vitoria = verificaVitoria(velha);
                if (!vitoria.equals("")) {
                    System.out.printf("Jogador %s venceu", vitoria);
                    break;
                }
            }catch(Exception e){
                System.out.printf("Erro");
            }
        }
        System.out.printf("FIM DE JOGO");
    }

    public static void desenharJogo(campo[][] velha){
        limparTela();
        System.out.println("    0   1    2");
        System.out.printf("0    %c| %c | %c %n",velha[0][0].getSimbolo(),velha[0][1].getSimbolo(),velha[0][2].getSimbolo());
        System.out.println("    -----------");
        System.out.printf("1    %c| %c | %c %n",velha[1][0].getSimbolo(),velha[1][1].getSimbolo(),velha[1][2].getSimbolo());
        System.out.println("    -----------");
        System.out.printf("2    %c| %c | %c %n",velha[2][0].getSimbolo(),velha[2][1].getSimbolo(),velha[2][2].getSimbolo());
    }

    public static void limparTela(){
        for(int cont = 0; cont < 200; cont++){
            System.out.println("");
        }
    }
    public static int[] jogar(Scanner scan, char sa){
        int p[] = new int[2];
        System.out.printf("%s %c%n", "Quem Joga: ", sa);
        System.out.print("Informe a linha: ");
        p[0] = scan.nextInt();
        System.out.print("Informe a coluna: ");
         p[1] = scan.nextInt();
         return p;
    }

    public static Boolean verificaJogada(campo[][]velha, int p[], char simboloAtual){
        if(velha[p[0]][p[1]].getSimbolo() == ' '){
            velha[p[0]][p[1]].setSimbolo(simboloAtual);
            return true;
        }else{
            return false;
        }
    }

    public static void iniciaJogo(campo[][]velha){
        for(int l = 0; l < 3; l++){
            for(int c = 0; c < 3; c++){
                velha[l][c] = new campo();
            }
        }
    }

    public static String verificaVitoria(campo[][] velha){
        //verifica linhas
        for(int i = 0; i < 3; i++){
            if(velha[i][0].getSimbolo() != ' ' && velha[i]
            [0].getSimbolo() == velha[i][1].getSimbolo() && velha[i]
            [1].getSimbolo() == velha[i][2].getSimbolo()){
                return String.valueOf(velha[i][0].getSimbolo());
            }
        }
        //verifica colunas.
        for(int i = 0; i < 3; i++) {
            if(velha[0][i].getSimbolo() != ' ' && velha[0]
            [i].getSimbolo() == velha[1][i].getSimbolo() && velha[1]
            [i].getSimbolo() == velha[2][i].getSimbolo()){
                return String.valueOf(velha[0][i].getSimbolo());
            }
        }
        //verifica diagonal principal
        if (velha[0][0].getSimbolo() != ' ' && velha[0]
        [0].getSimbolo() == velha[1][1].getSimbolo() && velha[1]
        [1].getSimbolo() == velha[2][2].getSimbolo()) {
            return String.valueOf(velha[0][0].getSimbolo());
        }
        //verifica diagonal secundaria.
        if (velha[0][2].getSimbolo() != ' ' && velha[0]
        [2].getSimbolo() == velha[1][1].getSimbolo() && velha[1]
        [1].getSimbolo() == velha[2][0].getSimbolo()) {
            return String.valueOf(velha[0][2].getSimbolo());
        }
        return "";
    }
}

    