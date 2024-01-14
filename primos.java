public class primos{
    public static void main(String [] args){
     int i, m = 0, flag = 0;
     int n = 11;
     
     m = n/2;
     if (n == 0 || n == 1) {
        System.out.println(n + "Não é numero primo");
     }else{
        for(i = 2; i <= m; i++){
            if(n%i == 0){
                System.out.println(n+ " Não é numero primo");
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println(n + " é numero primo");
        }
        
     }
    }
}

/*existem dois casos específicos em que o número não será primo:
1.Quando o número é 0 ou 1: No seu código, a primeira condição if (n == 0 || n == 1) 
verifica se o número é 0 ou 1. Se for, o programa imprime que o número não é primo.
2.Quando o número é divisível por qualquer número além de 1 e ele mesmo.
3.A segunda condição é verificada no loop for. Se o número n for divisível 
por qualquer número i no intervalo de 2 a n/2 (ou seja, se n % i == 0), 
então o número não é primo. Isso ocorre porque um número primo. 
só deve ser divisível por 1 e ele mesmo. 
Se n for divisível por algum outro número, ele não é primo.
*/