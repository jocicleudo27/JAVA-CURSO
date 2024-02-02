import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ForkJoinPool;


public class ParallelsExample extends RecursiveAction{
    final int TH = 2;
    double[] numbers;
    int inStart, inLast;

    ParallelsExample(double[] n, int x, int l){
        numbers = n;
        inStart = x;
        inLast = l;
    }
    protected void compute(){
        if((inLast - inStart) > TH){
            for(int i = inStart; i < inLast; i++)
                numbers[i] = numbers[i] + Math.random();
        }else{
            invokeAll(new ParallelsExample(numbers,inStart,(inStart + inLast)/ 2),
                new ParallelsExample(numbers,
                (inStart + inLast) / 2, inLast));
        }
    }
    public static void main(String[] args){
        final int SIZE = 10;
        ForkJoinPool pool = new ForkJoinPool();
        double[] na = new double[SIZE];
        System.out.println("os valores aleatórios inicializados são:");
        for(int i = 0; i < na.length; i++){
            na[i] = (double) i + Math.random();
            System.out.format("%.4f ", na[i]);
        }
        System.out.println();
        ParallelsExample task = new ParallelsExample(na, 0, na.length);
        pool.invoke(task);
        System.out.println("Os valores alterados são: ");
        for(int i = 0; i < 10; i++)
            System.out.format("%.4f ", na[i]);
        System.out.println();
    }
}