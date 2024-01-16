public final class Funcionario53{
    private final String pancardNumber;

    public Funcionario53(String pancardNumber){
        this.pancardNumber = pancardNumber;
    }
    public String getPancardNumber(){
        return pancardNumber;
    }
}
public class ImutableDemo{
    public static void main(String[] args){
        Funcionario53 e = new Funcionario53("ABC123");
        String s1 = e.getPancardNumber();
        System.out.println("Numero Pancard: " + s1);
    }
}
