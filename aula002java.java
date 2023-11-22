public class aula002java{
    public static void main(String[]args){

        int pos = 1;

        switch (pos) {
            case 1:
                System.out.println("Primeiro Lugar");
                break;
            case 2:
                System.out.println("Segundo Lugar");
                break;
            case 3:
                System.out.println("Terceiro Lugar");
                break;
            default:
                System.out.println("Nao subiu no podio");
                break;
        }
}