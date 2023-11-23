import java.util.Scanner;

    public class aula005 {
        public static void main(String[] args){
        
        Scanner  scan = new Scanner(System.in);
        
        //aula sobre loop
        //FOR
        /*
        for(int cont = 5; cont > 0; cont--){
                System.out.println(cont +" - CFB Cursos");
            }
            */
            //WILIE
        int max = scan.nextInt();
        int cont =0;
        while (cont < max) {
            System.out.println(cont +" - CFB Cursos");
            cont++;
        } 
        System.out.println("Fim do programa");
    }   
    
}
   
    
