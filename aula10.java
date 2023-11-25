public class aula10{
    public static void main(String[] args){
        //Ex: de criação de objeto.
            Jogador j1 = new Jogador(1);
            Jogador j2 = new Jogador(2);
            
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
        System.out.printf("Jogador numero %d criado%n ", num);        
        }   
    }
    