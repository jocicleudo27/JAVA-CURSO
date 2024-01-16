/*class conta{
    int cc;
    String nome;
    float saldo;
    
    void insert(int a, String n, float sald){
        cc = a;
        nome = n;
        saldo = sald;
    }
    void depositar(float sald){
        saldo = saldo + sald;
        System.out.println(sald+ " deposito");
    }
    void saque(float sald){
        if(saldo < sald){
            System.out.println("Saldo insuficient");
        }else{
            saldo = saldo - sald;
            System.out.println(sald+" saque");
        }
    }
    void checksaldo()
    {
        System.out.println("Saldo é: "+saldo);
    }
    void display()
    {
        System.out.println(cc+" "+nome+" "+saldo);
    }
    static class Testconta{
        public static void main(String[] args) {
            conta a1 = new conta();
            a1.insert(82345, "Ankit",1000);
            a1.display();
            a1.checksaldo();
            a1.depositar(40000);
            a1.checksaldo();
            a1.saque(15000);
            a1.checksaldo();
            a1.saque(26002);
            a1.checksaldo();

        }
    }
    
}
*/
