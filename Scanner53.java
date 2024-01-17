import java.util.*;
public class Scanner53 {

    public static void main(String[] args) {
        final Scanner em = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = em.nextLine();
        System.out.println("Nome é " + nome);
        em.close();
    }
}