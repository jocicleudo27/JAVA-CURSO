//Java program para reverter String usando Stack.
/*public class aula17{
    //stack
    static class Stack{
        int size;
        int top;
        char[] a;
        // função para verificar se o stack está vazio.
        boolean isEmpty(){return (top < 0);}

        Stack(int n){
            top = -1;
            size = n;
            a = new char[size];
        }
        //função push para adicionar elemento no stack.
        boolean push(char x){
            if(top >= size){
                System.out.println("Stack Overflow");
                return false;
            }
            else {
                a[++top] = x;
                return true;
            }
        } 
        //função pop para element from stack
        char pop()
        {
            if(top < 0){
                System.out.println("Stack Underflow");
                return 0;
            }
            else{
                char x = a[top--];
                return x;
            }
        }
    }
}

// Driver code
class Main{
    //fução para reverter a string
    public static void reverse(StringBuffer str){
        //cria um stack de capacidade igual ao tamanho da string.
        int n = str.length();
        aula17.Stack obj = new aula17.Stack(n);
        //push insere todos caracteres da string para o stack.
        int i;
        for(i = 0 ; i < n; i++)
        obj.push(str.charAt(i));

        // pop retira todos caracters da string
        // e put eles de volta para o str
        for( i = 0; i < n; i++){
            char ch = obj.pop(); // Corrigido aqui
            str.setCharAt(i, ch);
        }
    }
    //Driver function
    public static void main(String[] args) {
        // cria uma nova string.
        StringBuffer s = new StringBuffer("GeeksQuiz");
        
        //chamada de metodo para reverter
        reverse(s);
        
        // imprime a string reversa.
        System.out.println("Reverse string is " + s);
    }
} */

//https://www.geeksforgeeks.org/stack-set-3-reverse-string-using-stack/
//https://www.geeksforgeeks.org/data-structures/
//https://roadmap.sh/java