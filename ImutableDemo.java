public class ImutableDemo{
    public static void main(String[] args){
        Funcionario53 e = new Funcionario53("ABC123");
        String s1 = e.getPancardNumber();
        System.out.println("Numero Pancard: " + s1);
    }
}
