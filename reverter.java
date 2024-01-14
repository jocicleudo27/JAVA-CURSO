/*
public class reverter{
    public static void main(String [] args)
    {
        int numeros = 987654, reverso = 0;
         while(numeros != 0)
         {
            int restante = numeros % 10;
            reverso = reverso * 10 + restante;
            numeros = numeros / 10;
         }
         System.out.println("O reverso do numero dado é: " + reverso);
    }
}
*/
//EXP2
/*
public class reverter {

    public static void main(String[] args) {
        int numero = 123456, reverso = 0;
        
        for(;numero != 0; numero = numero/10)
        {
            int restante = numero % 10;
            reverso = reverso * 10 + restante;
        }
        System.out.println("O reverso do numero dado é: " + reverso);
    }
}
*/
//Exp3 reverter usando recursão.
import java.util.Scanner;

public class reverter {

    public static void reverseNumero(int numero)
    {
        if(numero < 10)
        {
            //imprime o mesmo numero se o numero for menor que 10.
            System.out.println(numero);
            return;
        }
        else
        {
            System.out.print(numero % 10);
            reverseNumero(numero/10);
        }
    }

    public static void main(String[] args) {
        System.out.print("Digite o numero que você deseja reverter: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("O reverso do numero dado é: ");
        //chamada de método recursivo.
        reverseNumero(num);
        sc.close();
    }
}
