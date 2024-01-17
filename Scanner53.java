/*import java.util.*;
public class Scanner53 {

    public static void main(String[] args) {
        final Scanner em = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = em.nextLine();
        System.out.println("Nome é " + nome);
        em.close();
    }
}
*/

//exemplo 2
/*import java.util.*;

public class Scanner53 {

    public static void main(String[] args) {
        String s = "Olá, Estou estudando pelo JavaTpoint";
        Scanner scan = new Scanner(s);
        System.out.println("resultado booleano: " +scan.hasNext());
        System.out.println("String: " +scan.nextLine());
        scan.close();
        System.out.println("--------Digite seus dados--------");
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = in.next();
        System.out.println("Nome: " + nome);
        System.out.println("Digite sua idade: ");
        int i = in.nextInt();
        System.out.println("Idade: " + i);
        System.out.println("Digite seu salario: ");
        double d = in.nextDouble();
        System.out.println("Salario: " + d);
        in.close();
    }
}
*/

import java.io.*;
class Aluno implements java.io.Serializable{
    public int id;
    public String name;
    public Aluno(int id, String name){
        this.id = id;
        this.name = name;
    }
}

class Despersist{
    public static void main(String[] args) {
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
            Aluno s = (Aluno)in.readObject();
            System.out.println(s.id+" "+s.name);
            in.close();
        }catch(Exception e){System.out.println(e);}
    }
}
