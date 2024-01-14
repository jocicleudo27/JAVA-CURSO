//Programa Java para demonstrar o uso de variável estática.
/*class Student
{
    int rollno;
    String nome;
    static String college = "ITS";//variavel statica
    //construtor
    Student(int r, String n){
        rollno = r;
        nome = n;
    }
    void display()
    {
        System.out.println(rollno+ " " +nome+ " " +college);
    }
}
class TestStaticVariavel1{
    public static void main(String[] args)
    {
        Student s1 = new Student(112,"Jean");
        Student s2 = new Student(233,"Joci");

        s1.display();
        s2.display();
    }
}
*/

/*Programa Java para ilustrar o uso de variável estática que  
é compartilhado com todos os objetos. */
/*class Contar2{
    static int cont = 0;

    Contar2(){
        cont++;incrementando o valor da variável estática
        System.out.println(cont);
    }
    public static void main(String[] args) {
        Contar2 c1 = new Contar2();
        Contar2 c2 = new Contar2();
        Contar2 c3 = new Contar2(); 
    }
}
 */
//Programa Java para demonstrar o uso de um método estático.  
class Student{
    int rollno;
    String nome;
    static String college = "ITS";

    static void change(){
        college = "BBDIT";
    }
    Student(int r, String n){
        rollno = r;
        nome = n;
    }
    void display()
    {
        System.out.println(rollno+" "+nome+" "+college);
    }
}
class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        
        Student s1 = new Student(112, "Badawuan");
        Student s2 = new Student(213, "jedai");
        Student s3 = new Student(314, "jean");

        s1.display();
        s2.display();
        s3.display();

    }
} 
/*Claro, vou explicar o código para você.

Este código define duas classes: `Student` e `TestStaticMethod`.

A classe `Student` tem quatro membros: dois campos de dados (`rollno` e `nome`), 
um campo de dados estático (`college`) e dois métodos (`change` e `display`).

- `rollno` e `nome` são variáveis de instância que armazenam o número de matrícula e o nome do aluno, respectivamente.
- `college` é uma variável estática que armazena o nome da faculdade. 
Como é estática, é compartilhada por todas as instâncias da classe.
- O método `change` é um método estático que muda o valor da variável estática `college`.
- O método `display` é um método de instância que exibe o número de matrícula, o nome e a faculdade do aluno.

A classe `TestStaticMethod` contém o método `main`, que é o ponto de entrada do programa. Neste método:

1. O método `change` é chamado, o que muda o valor de `college` para "BBDIT".
2. Três instâncias da classe `Student` são criadas (`s1`, `s2` e `s3`), 
cada uma com seu próprio número de matrícula e nome.
3. O método `display` é chamado em cada instância, exibindo seus detalhes.

 */
