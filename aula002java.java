public class aula002java{
    public static void main(String[]args){
        int nota = 85; //teste
        int faltas = 2;
        int maxFaltas = 5;
        int media = 60;
        //String res;
        //res = (nota >= media ? "Aprovado" : "Reporovado");
        //System.out.println("Resultado: " + res); operação ternaria.

        if(nota >= media && faltas <= maxFaltas){
            System.out.println("Aprovado");
        }else if(nota >= 40){
            System.out.println("Recuperacao");
        }else{
        System.out.println("Reprovado");
        }
        System.out.println("FIm do programa");
    }
}