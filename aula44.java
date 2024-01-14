/* Conceito de Herança
 *class Employ{
    float salary = 4000;
}
class Programer extends Employ{
    int bonus = 1000;
    public static void main(String[] args){
        Programer p = new Programer();
        System.out.println("Programer salary is: "+p.salary);
        System.out.println("Bonus of Programer is: "+p.bonus);
    }
} 
 */
/*class Animal{
    void eat(){System.out.println("comer");}
 }
 class Cao extends Animal{
    void bark(){System.out.println("latidos");}
 }
 class TestHeranca{
    public static void main(String[] args){
        Cao d = new Cao();
        d.bark();
        d.eat();
    }
 }
 */

 /*
 class Animal{
    void eat(){System.out.println("comer");}
 }
 class Cao extends Animal{
    void bark(){System.out.println("latidos");}
 }
 class BabyDog extends Cao{
    void weep(){System.out.println("chorar");}
 }
 class TestHeranca{
    public static void main(String[] args){
        BabyDog d = new BabyDog();
        d.bark();
        d.eat();
        d.weep();
    }
 }
*/

/*
class Animal{
    void eat(){System.out.println("comer");}
}
class Cao extends Animal{
    void bark(){System.out.println("latidos");}
}
class Gato extends Animal{
    void meow(){System.out.println("miando");}

    public void bark() {
    }
}
class TestHeranca{
    public static void main(String[] args){
        Gato c = new Gato();
        c.meow();
        c.eat();
        c.bark();//causa um erro se não existir o metodo na classe Gato.
    }
}  
*/
/*class Operation{
    int square(int n){
        return n*n;
    }
}
class Circle{
    Operation op;
    double pi = 3.14;

    double area(int radius){
        op = new Operation();
        int rsquare = op.square(radius);
        return pi*rsquare;
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);
    }
} */

class Address{
    String city, state, country;

    public Address(String city, String state, String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
class Emp{
    int id;
    String nome;
    Address address;

    public Emp(int id, String nome, Address address){
        this.id = id;
        this.nome = nome;
        this.address = address;
    }
    void display(){
        System.out.println(id+" "+nome);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }
    public static void main(String[] args) {
        Address address1 = new Address("Fortaleza", "Ceará","Brasil");
        Address address2 = new Address("Salvador", "Bahia", "Suecia");
        
        Emp e = new Emp(117, "varun", address1);
        Emp e2 = new Emp(118,"barun",address2);

        e.display();
        e2.display();
    }
}

