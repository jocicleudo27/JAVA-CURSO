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
    }
}