package jogoDaVelha ;

import java.util.ArrayList;
public class array{
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> carros = new ArrayList<>();

        numeros.add(11);
        numeros.add(22);
        numeros.add(33);

        carros.add("Palio");
        carros.add("Siena");
        carros.add("Opala");
        carros.add("Argo");
        
        System.out.println(carros.indexOf("Opala"));
        System.out.println(carros.remove(2));

        //carros.clear();

        for(int i = 0; i < carros.size(); i++){
            System.out.println(carros.get(i));
        }
        /*for(int e : numeros){
            System.out.println(e);
        } */
        
        /*for(String e : carros){
            System.out.println(e);
        } */
        
    }
}