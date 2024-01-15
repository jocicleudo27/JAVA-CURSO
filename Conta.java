public class Conta{
    private long acc_no;
    private String nome;
    private String email;
    private float valor;

    public long getAcc_no(){
        return acc_no;
    }
    public void setAcc_no(long acc_no){
        this.acc_no = acc_no;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public float getValor(){
        return valor;
    }
    public void setValor(float valor){
        this.valor = valor;
    }
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setAcc_no(123456789L);
        conta.setNome("João");
        conta.setEmail("Joao@email.com");
        conta.setValor(1000);

        System.out.println("Número da conta: " +conta.getAcc_no());
        System.out.println("Nome: " + conta.getNome());
        System.out.println("Email: " + conta.getEmail());
        System.out.println("Valor: " + conta.getValor());
    }
}