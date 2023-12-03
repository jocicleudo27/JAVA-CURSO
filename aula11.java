public class aula11 {
    public static void main(String[]args){
        
        Carro c1 = new Carro("Golf");
        Carro c2 = new Carro("HRV");
        CarroCombate c3 = new CarroCombate("Leopardo", 100);
        CarroCombate c4 = new CarroCombate("Pantera", 50);

       
        c1.info();
        c2.info();
        c3.info();
        c4.info();
    }
}

class Carro{
    private String nome;
    private Boolean ligado;
    private Boolean destruido;
    private int blindagem;
    private Boolean armamento;

    public Carro(String nome){
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
    public void setArmamento(Boolean armamento){
        this.armamento = armamento;
    }
    public int getBlindagem(){
        return this.blindagem;
    }
    public void setBlindagem(int blindagem){
        this.blindagem = blindagem;
    }
    public void sofrerDano(int dano){
        this.blindagem-=dano;
        if(this.blindagem <= 0){
            this.blindagem = 0;
            this.ligado = false;
            this.destruido = true;
        }
    }
    public void info(){
        System.out.println("-------------------------------");
        System.out.printf("Nome........:%s%n",this.nome);
        System.out.printf("Ligado......:%s%n",this.ligado ? "Sim" : "Nao");
        System.out.printf("Destruido...:%s%n",this.destruido ? "Sim" : "Nao");
        System.out.printf("Blindagem...:%d%n",this.blindagem);
        System.out.printf("Armameno...%s%n",this.armamento ? "Sim" : "Nao");
    }
}

class CarroCombate extends Carro{
    private final int MAX_ARMAMENTO = 100;
    private final int MIN_ARMAMENTO = 0;
    private int qtdeArmamento;

    public CarroCombate(String nome, int blindagem){
        super(nome);
        setArmamento(true);
        setBlindagem(blindagem);
        this.qtdeArmamento =100;
    }

    public void setQtdeArmamento(int qtdeArmamento){
        this.qtdeArmamento = qtdeArmamento;
        if(this.qtdeArmamento > MAX_ARMAMENTO){
            this.qtdeArmamento = MAX_ARMAMENTO;
        }
        if(this.qtdeArmamento > MIN_ARMAMENTO){
            this.qtdeArmamento = MIN_ARMAMENTO;
        }
    }
    public int getQtdeArmamento(){
        return this.qtdeArmamento;
    }
    public void artirar(){
        if(this.qtdeArmamento > MIN_ARMAMENTO){
            setQtdeArmamento(-1);
        }else{
            System.out.println("Sem armamento");
        }
    }
    public void info(){
        super.info();
        System.out.printf("Qtde.Arm....:%d%n", this.qtdeArmamento);
    }
}

