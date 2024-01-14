public class primos2 {
static void checkprimos2(int n){
    int i, m = 0, flag = 0;
    m = n / 2;
    if(n == 0 || n == 1){
        System.out.println(n+ " O numero não é primo");
    }else{
        for(i = 2; i <= m; i++){
            if(n % i == 0){
                System.out.println(n+ " O numero tambem não é primo ");
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println(n+ " Este numero é primo");
        }
    }
}
public static void main(String [] args){
    checkprimos2(1);
    checkprimos2(3);
    checkprimos2(17);
    checkprimos2(20);
}
    
}