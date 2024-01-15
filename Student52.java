class Student52 implements Cloneable{
    int rollno;
    String nome;
    
    Student52(int rollno, String nome){
        this.rollno = rollno;
        this.nome = nome;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args){
        try{
            Student52 s1 = new Student52(101, "amit");

            Student52 s2 =(Student52)s1.clone();

            System.out.println(s1.rollno+" "+s1.nome);
            System.out.println(s2.rollno+" "+s2.nome);
        }catch(CloneNotSupportedException c){}
    }
}