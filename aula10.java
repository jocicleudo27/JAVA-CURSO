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
        
        private final int maxVidas = 3;
        private int num = 0;
        private int vidas = 0;

        public Jogador(int num){
            this.num = num;
            this.vidas = 3;
            System.out.printf("Jogador nume %d criado%n",num);
        }
        public int getVidas(){
            return this.vidas;
        }
        public void setVidas(int vidas){
            if(vidas > 3)
            this.vidas = vidas;
        }
    }
    