public class aula006{
    
    public static void main(String[] args){

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
    }
}