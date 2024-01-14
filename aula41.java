/*class Student4{
    int id;
    String nome;

    Student4(int i, String n){
        id = i;
        nome = n;
    }
    void display(){
        System.out.println(id+" "+nome);
    }
        public static void main(String[] args){
            Student4 s1 = new Student4(111 , "Karan");
            Student4 s2 = new Student4(222 , "Aryan");

            s1.display();
            s2.display();
        }
} */

/*class Student5{
    int id;
    String nome;
    int idade;

    Student5(int i, String n){
        id = i;
        nome = n;
    }
    Student5(int i, String n, int a){
        id = i;
        nome = n;
        idade = a;
    }
    void display(){
        System.out.println(id+" " +nome+ " " +idade);
    }
    public static void main(String[] args){
        Student5 s1 = new Student5(111, "Karan");
        s1.display();
        Student5 s2 = new Student5(222,"Ariano", 25);
        s2.display();
    }
}
*/

class Student6
{
    int id;
    String nome;

    Student6(int i, String n){
        id = i;
        nome = n;
    }
    //CONTRUTOR INICIALIZA APÓS O OBJETO.
    Student6(Student6 s){
        id = s.id;
        nome = s.nome;
    }
    void display(){
        System.out.println(id+ " " +nome);
    }
    public static void main(String[] args)
    {
        Student6 s1 = new Student6(111, "Kaliane");
        s1.display();
        Student6 s2 = new Student6(s1);
        s2.display();
    }
}

