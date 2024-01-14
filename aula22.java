//Dada uma matriz, imprima o próximo elemento maior (NGE) para cada elemento.
/*A ideia é usar dois loops, o loop externo escolhe todos os elementos um a um. 
O loop interno procura o primeiro elemento maior para o elemento escolhido pelo loop externo. 
Se um elemento maior for encontrado, esse elemento será impresso como próximo, caso contrário, -1 será impresso. */

class aula22 {
    static void printNGE(int arr[], int n)
    {
        int next, i, j;
        for( i= 0; i < n; i++){
            next = -1;
            for(j = i + 1; j < n; j++){
                if(arr[i] < arr[j]){
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + " -- " + next);
        }
    }
    public static void main(String args[])
    {
        int arr[] = {11, 13, 21, 3};
        int n = arr.length;
        printNGE(arr, n);
    }
}