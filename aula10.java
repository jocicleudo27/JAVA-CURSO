public class aula10{
    public static void main(String[] args){
        //Ex: de criação de objeto.
            //teste e veja as alterações
            int num = 0;

            Jogador j1 = new Jogador(num++);
            Jogador j2 = new Jogador(num++);
            Jogador j3 = new Jogador(num++);
            //j1.num = 10;
            //j2.num = 12;
            //System.out.printf("%n%d",j1.num);
            //System.out.printf("%n%d",j2.num);
    }
}

    class Jogador{
        
        private int num = 0;

        public Jogador(int num){
        this.num = num;
        System.out.printf("%nJogador numero %d criado%n ", num);        
        }   
    }
    