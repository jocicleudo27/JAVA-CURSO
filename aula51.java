interface aula51{
    void a();
    void b();
    void c();
    void d();
}
abstract class B implements aula51{
    public void c(){System.out.println("I am C");}
}
class M extends B{
    public void a(){System.out.println("I am a");}
}
public void b(){System.out.println("I am b");}
public void d(){System.out.println("I am d");}