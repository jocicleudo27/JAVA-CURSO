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
        //
        private intleft(int key){
            return 2 * key + 1;
        }
    }
}