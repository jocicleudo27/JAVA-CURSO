import java.util.*;

public class aula12{
    public static void main(String [] args){

    }

    class MinHeap{
        
        //Para armazenar matriz de elementos no heap
        private int[]heapArray;

        //Tamanho máximo da pilha
        private int capacity;

        //Número atual de elementos no heap
        private int current_heap_size;

        //construtor
        public MinHeap(int n){
            capacity = n;
            heapArray = new int[capacity];
            current_heap_size = 0;
        }
        //Troando usando referência
        private void swap(int[] arr, int a, int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        //Obter o índice pai para o índice fornecido
        private int parent(int key){
            return(key -1) / 2;
        }
        //Obter o índice Filho Esquerdo para o índice fornecido
        private intleft(int key){
            return 2 * key + 1;
        }
        //Obter o índice Filho Direito para o índice fornecido
        private int right(int key){
            return 2 * key + 2;
        }
        // inserindo novo indice
        public Boolean insertKey(int key) {
            if(current_heap_size == capacity){
                //heap is full
                return false;
            }
            //Primeiro insira a nova chave no final
            int i = current_heap_size;
            heapArray[i] = key;
            current_heap_size++;
        }
        //Corrigir a propriedade min heap se ela for violada
        while(i != 0 && heapArray[i] < heapArray[parent(i)]){
            swap(heapArray, i, parent(i));
            i = parent(i);
        }
        return true;
    }
    //Diminui o valor de determinada chave para new_val. 
    //Supõe-se que new_val é menor 
    //do que heapArray[key]. 
    public void decreasekey(int key, int new_val){
        heapArray[key] = new_val;

        while(key != 0 && heapArray[key]) < heapArray[parent(key)]{
            swap(heapArray, key, parent(key));
            key = parent(key);
        }
    }
    //Retorna a chave mínima (chave em
    //root) da pilha mínima 
    
    public int getMin(){
        return heapArray[0];
    }
    //Método para remover elemento mínimo da raiz
    public int extractMin(){
        if(current_heap_size <= 0){
            return Integer.MAX_VALUE;
        }
        if(current_heap_size == 1){
            current_heap_size--;
            return heapArray[0];
        }
       // Armazene o valor mínimo, 
       // e removê-lo da pilha 
       int root = heapArray = heapArray[current_heap_size -1];
       current_heap_size--;
       MinHeap(0);

       return root;
    }
    // Esta função exclui a chave no índice fornecido
    //Primeiro reduziu o valor 
    //para menos infinito, então chama extractMin()
    public void deletekey(int key){
        decreasekey(key, Integer.MIN_VALUE);
        extractMin();
    }
    //Um método recursivo para heapify uma subárvore
    private void MinHeapify(int key){
        int l = left(key);
        int r = right(key);

        int smallest = key;
        if(l < current_heap_size && heapArray[l] < heapArray[smallest]){
            smallest = 1;
        }
        if (r < current_heap_size && heapArray[r] < heapArray[smallest]) {
            smallest = r;
    }
    if(smallest != key){
        swap(heapArray, key, smallest);
        MinHeapify(smallest);
    }
}
    //Aumenta o valor de determinada chave para new_val.
    public void increaseKey(int key, int new_val) {
        heapArray[key] = new_val;
        MinHeapify(key);
    }
    //Altera o valor em uma chave
     public void changeValueOnAKey(int key, int new_val) {
        if (heapArray[key] == new_val) {
            return;
        }
        if (heapArray[key] < new_val) {
            increaseKey(key, new_val);
        } else {
            decreaseKey(key, new_val);
        }
    }
}
//Código do driver
class MinHeapTest {
    public static void main(String[] args) {
        MinHeap h = new MinHeap(11);
        h.insertKey(3);
        h.insertKey(2);
        h.deleteKey(1);
        h.insertKey(15);
        h.insertKey(5);
        h.insertKey(4);
        h.insertKey(45);
        System.out.print(h.extractMin() + " ");
        System.out.print(h.getMin() + " ");
         
        h.decreaseKey(2, 1);
        System.out.print(h.getMin());
    }
}