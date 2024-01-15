class Conta{
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
}