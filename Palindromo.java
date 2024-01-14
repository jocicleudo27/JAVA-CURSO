public class Palindromo{
    public static void main(String[] args){
        int r, soma = 0, temp;
        int n = 123; //É a variável numérica a ser verificada para palíndromo
        //454
        temp = n;
        while(n > 0){
            r = n % 10; // ficando restane.
            soma = (soma * 10) + r;
            n = n / 10;
        }
        if(temp == soma)
        System.out.println("numero é palindromo");
        else
        System.out.println("não é palindromo");
    }
}
//https://www.javatpoint.com/java-programs#java-basic-programs