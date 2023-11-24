public class aula009{
    
    public static void main(String[]args){

        
        msg("Aprendendo Java.", 5);
        System.out.println(soma2(10, 20));
        System.out.println(soma(1,5,10,3,20,2));
    }

    public static int soma(int... numeros){
        int res = 0;
        for(int n:numeros){
            res+=n;
        }
        return res;
    }
    public static int soma2(int n1, int n2){
        int res = n1 + n2;
        return res;
    }

    public static void msg(String m, int l ){
        for(int i = 0; i < l; i++)
        System.out.println(m);
    }
} 