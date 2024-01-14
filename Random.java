/* import java.lang.Math;
public class Random{
    public static void main(String[]args)
    {
        //Gerando numeros  aleatorrios.
        System.out.println("1°      Numero     Aleatorio:      "   + Math.random());
        System.out.println("2° Numero Aleatorio: "+ Math.random());
        System.out.println("3°      Numero     Aleatorio:      "   + Math.random());
        System.out.println("4° Numero Aleatorio: "+ Math.random());
    }
}*/
//Random Exp2:
import java.lang.Math;
public class Random {

    public static void main(String[] args) {
        int min = 200;
        int max = 400;
        //Gerar valor duplo aleatorio de 200 a 400.
        System.out.println("Valor aleatorio do tipo duplo entre "+min+" a "+max+":");
        double a = Math.random()*(max - min+1)+min;
        System.out.println(a);
        //Gerar valor int aleatorio de  200 a 400.
        System.out.println("Valor aleatorio do tipo int entre "+min+" a "+max+":");
        int b = (int)(Math.random()*(max-min+1)+min);
        System.out.println(b);
    }
}


