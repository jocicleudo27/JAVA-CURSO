import java.util.Arrays;

public class aula006{
    
    public static void main(String[] args){
/*
        final int tam = 5;

        int[] num = new int[tam];
        int[] neme = {10,20,30,40,50,60,70,80,90};

        num[0] = 10;
        num[1] = 5;
        num[2] = 15;
        num[3] = 0;
        num[4] =8;

        for(int i = 0; i < neme.length; i++){
            //System.out.printf("%d\n ", num[i]);
            System.out.printf("%d ", neme[i]);
        }
    */
        /*
        final int tam = 5;
        char[] gabarito = {'a','a','d','b','c'};
        char[] respostas = new char[tam];
        int nota = 0;

        respostas[0]='a';respostas[1]='b';respostas[2]='c';
        respostas[3]='b';respostas[4]='c';

        for(int i = 0; i < tam; i++){
            if(respostas[i]==gabarito[i]){
                nota++;
            }
        }
        */
        //for sepecial para ler elementos de um array.
        final int tam = 10;
        int[] num = {9,2,7,1,8,5,3,4,0,6};
        int[] nume = new int[tam];
        System.arraycopy(num, 0, nume, 0, tam);

        //Arrays.sort(num);

        for(int n:num){
            System.err.printf("%d -", n);
        }

        //System.out.printf("Nota do aluno:%d", nota);
    }
}