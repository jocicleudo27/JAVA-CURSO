interface aula51{
    void a();
    void b();
    void c();
    void d();
}
abstract class E implements aula51{
    public void c(){System.out.println("I am C");}
}
class M extends E{
    public void a(){System.out.println("I am a");}
    public void b(){System.out.println("I am b");}
    public void d(){System.out.println("I am d");}
}
class Test5{
    public static void main(String[] args){
        aula51 a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}
//https://www.javatpoint.com/encapsulation