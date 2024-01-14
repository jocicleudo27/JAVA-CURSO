import static java.lang.System.exit;

class aula18{
    //creat stack using linked list
    static class StackUsingLinkedlist{
        // um nó da linked list
        private class Node{
            int data; // integer data
            Node link; // reference variabel Node type
        }
        // Cria uma variável de referência global.
        Node top;
        //Construtor
        StackUsingLinkedlist(){this.top = null;}

        // Função  utilizada para adicionar um elemento x na pilha
        public void push(int x){// inserir no início
            //Cria um novo nó temporário para alocar memória
            Node temp = new Node();

            // Inicializa data no campo de dados temp
            temp.data = x;

            //colocar referência superior no link temporário
            temp.link = top;

            //Atualizar referência superior
            top = temp;
        }
        //Função  utilizada para verificar se a pilha está vazia ou não.
        public boolean isEmpty(){return top == null;}

        //Função  utilizada para retornar o elemento superior em uma pilha
        public int peek(){
            //verificar se há pilha está vazia.
            if(!isEmpty()){
                return top.data;
            }
            else{
                System.out.println("Stack is empty");
                return -1;
            }
        }

        //Função utilizada para remover o elemento do topo da pilha
        public void pop()// remove do inicio
        {
            //verificar se a pilha está vazia
            if(top == null){
                System.out.print("\nStack Underflow");
                return;
            }
            //Atualizar o ponteiro superior para apontar para o próximo nó
            top = (top).link;
        }
        public void display(){//função usada para exibir os elementos da pilha.
            //para verificar se o stack está vazio.
            if(top == null){
                System.out.printf("\nStack vazio");
                exit(1);
            }
            else{
                Node temp = top;
                while(temp != null){
                    // print node data
                    System.out.printf("%d ", temp.data);

                    //atribui link temporário a temp
                    temp = temp.link;
                    if(temp != null)
                        System.out.print(" -> ");
                }
            }
        }
    }

    public static void main(String[] args){
        //cria um objeto de implemento de class
        StackUsingLinkedlist obj = new StackUsingLinkedlist();
        //insere valores no stack
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);
        obj.push(55);

        //imprime elementos do stack
        obj.display();

        //imprime o elemento do topo do stack
        System.out.printf("\nO elemento do topo é %d\n", obj.peek());

        //Delete o elemento do topo da stack.
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();

        obj.isEmpty();
        
        //print
        obj.display();

        //imprime o elemento do topo do stack
        System.out.printf("\nO elemento do topo é %d\n", obj.peek());
    }
}
