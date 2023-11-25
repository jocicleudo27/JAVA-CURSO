public class aula10{
    public static void main(String[] args){
        //Ex: de criação de objeto.
            //teste e veja as alterações
            int num = 0;

            Jogador j1 = new Jogador(++num);
            Jogador j2 = new Jogador(++num);
            Jogador j3 = new Jogador(++num);
            /*
                esta é a saida do pós decremento.
                Jogador numero 0 criado

                Jogador numero 1 criado

                Jogador numero 2 criado

                esta é a saida do pré decremento.
                Jogador numero 1 criado
                Jogador numero 2 criado
                Jogador numero 3 criado

             */
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
    