class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class Stack {
    Node top;

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // ... outros métodos da pilha ...
}

public class aula19 {
    public static void main(String[] args) {
        //Stack stk = new Stack();
        // ... use a pilha como necessário ...
        
    }
}
