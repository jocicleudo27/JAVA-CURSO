/*Substituição de método em Java
Se a subclasse (classe filho) tiver o mesmo método declarado na classe pai, 
ela será conhecida como substituição de método em Java.
Em outras palavras, se uma subclasse fornece a implementação específica do método 
que foi declarado por uma de suas classes pai, ela é conhecida como substituição de método.
A substituição de método é usada para fornecer a implementação específica de um método que já é fornecido por sua superclasse.
A substituição de método é usada para polimorfismo de tempo de execução
Regras para substituição do método Java
O método deve ter o mesmo nome que na classe pai
O método deve ter o mesmo parâmetro que na classe pai.
Deve haver uma relação IS-A (herança).

*/

/*class Vehicle{
    void run(){System.out.println("Vehicle is running");}
}
class Bike extends Vehicle{
    public static void main(String[] args){
        Bike obj = new Bike();
        obj.run();
    }
} */
/*class Vehicle{
    void run(){System.out.println("Vehicle is running");}
}
class Bike2 extends Vehicle{
    void run(){System.out.println("Bike is running safely");}

    public static void main(String[] args){
        Bike2 obj = new Bike2();
        obj.run();
    }
}
*/

/* class Bank{
    int getRateOfInterest(){return 0;}
}
class SBI extends Bank{
    int getRateOfInterest(){return 8;}
}

class ICICI extends Bank{
    int getRateOfInterest(){return 7;}
}
class AXIS extends Bank{
    int getRateOfInterest(){return 9;}
}
class Test2{
    public static void main(String[] args){
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();

        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    }
}
 */
/*class Animal{
    String color = "white";
}

class Dog extends Animal{
    String color = "black";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
class Test1{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}
 */
//  Sim, o método final é herdado, mas você não pode substituí-lo. 
/*class Bike{
    final void run(){System.out.println("em execução...");}
 }
 class Honda2 extends Bike{
    public static void main(String[] args) {
        new Honda2().run();
    }
 } */
/*class Bike{
    final int speedlimit;
    Bike(){
        speedlimit = 70;
        System.out.println(speedlimit);
    }
    public static void main(String[] args) {
        new Bike();
    }
 }
 */
 