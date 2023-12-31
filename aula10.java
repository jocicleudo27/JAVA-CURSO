public class aula10{
    public static void main(String[] args){
        //Ex: de criação de objeto.
            //teste e veja as alterações
            int num = 0;

            Jogador.pontos();
            Jogador.pontos();
            Jogador.pontos();

            System.out.printf("%nAlerta:%s%n",Jogador.alerta ? "sim" : "nao ");

            Jogador j1 = new Jogador(++num);
            Jogador j2 = new Jogador(++num);
            Jogador j3 = new Jogador(++num);
            
            Jogador.alerta = true;

            j1.info();
            j2.info();
            j3.info();

            //j1.setVidas(100);
            //j1.addVidas();
            //j3.addVidas();
            //System.out.printf("%nVidas do jogador 1:%d", j1.getVidas());
            //System.out.printf("%nVidas do jogador 2:%d", j2.getVidas());
            //System.out.printf("%nVidas do jogador 3:%d", j3.getVidas());
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
        static boolean alerta =  false;
        static int qtdJogadores = 0;
        static int pontosJogadores = 0;

        public Jogador(int num){
            this.num = num;
            this.vidas = 1;
            System.out.printf("Jogador nume %d criado%n",num);
            qtdJogadores++;
        }
        public int getVidas(){
            return this.vidas;
        }
        public void addVidas(){
            if (this.vidas < maxVidas) {//controla o limite de vidas
                this.vidas++;
            }
        }

        static void pontos(){
            pontosJogadores +=10;
        }

        public void info(){
            System.out.printf("%nJogador:%d",this.num);
            System.out.printf("%nVidas:%d",this.vidas);
            System.out.printf("%nAlerta:%s",alerta ? "Sim" : "Nao");
            System.out.printf("%nJogadores:%d",qtdJogadores);
            System.out.printf("%nPontos Jogadores:%d",pontosJogadores);
            System.out.printf("%n------------------------------%n");
        }

        public void setVidas(int vidas){
            if(vidas > maxVidas){
                this.vidas = maxVidas;
            }else if (vidas < 0) {
                this.vidas = 0;
            }else{
                this.vidas = vidas;
            }
            
        }
    }
    