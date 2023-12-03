public class aula11 {
    public static void main(String[]args){
        class Carro{
            private String nome;
            private Boolean ligado;
            private Boolean destruido;
            private int blindagem;
            private Boolean armamento;

            public Carro(string nome){
                this.nome = nome;
                this.ligado = false;
                this.destruido = false;
                this.blindagem = 0;
                this.armamento = false;

            }
            public String getNome(){
                return this.nome;
            }
            public Boolean getligado(){
                return this.ligado;
            }
            public void setLigado(Boolean ligado){
                this.ligado = ligado;
            }
            public Boolean getDestruido(){
                return this.destruido;
            }
            public Boolean getArmamento(){
                return this.armamento;
            }
            public int getBlindagem(){
                return this.blindagem;
            }
            public void sofrerDano(int dano){
                this.blindagem-=dano;
                if(this.blindagem <= 0){
                    this.blindagem = 0;
                    this.ligado = false;
                    this.destruido  true;
                }
            }
            
        }   
    }
}