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
}