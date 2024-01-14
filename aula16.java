//import java.util.Scanner;
public class aula16 {
/*
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade em anos: ");
        int anos = scanner.nextInt();
        System.out.println("Digite a quantidade de meses desde o seu ultimo aniversario: ");
        int meses = scanner.nextInt();
        System.out.println("Digite a quantidade de dias desde o ultimo mes de aniversario: ");
        int dias = scanner.nextInt();

        int idadeEmDias = anos * 365 + meses * 30 + dias;
        System.out.println("Sua idade em dias e:" + idadeEmDias);
    }
*/
/*  
public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite n1: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite n2: ");
        int n2 = scanner.nextInt();
        System.out.print("Digite n3: ");
        int n3 = scanner.nextInt();
        double res = (n1 + n2 + n3) / 3.0;
        System.out.print("A medeia e: " + res);
    }
*/
public static void main(String[] args)
{
    // declares an Array of integers.
    int[] arr;

    // allocating memory for 5 integers.
    arr = new int[5];

    // initialize the first elements of the array
    arr[0] = 10;

    // initialize the second elements of the array
    arr[1] = 20;

    // so on...
    arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;

    // accessing the elements of the specified array
    for (int i = 0; i < arr.length; i++)
        System.out.println("Element at index " + i
                           + " : " + arr[i]);
}
}
