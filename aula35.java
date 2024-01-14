import java.util.Vector; 
  
class aula35 
{ 
    //O método  é chamado com um vetor de strings como argumento. 
    static int removeConsecutiveSame(Vector <String > v) 
    { 
        int n = v.size();//n é inicializada com o tamanho do vetor. 
       
        // Start traversing the sequence
        //Um loop for é iniciado com i começando em 0 e continuando até n-1. 
        for (int i=0; i<n-1; ) 
        { 
           //Dentro do loop, cada elemento no índice i é comparado com o próximo elemento no índice i+1.
            if (v.get(i).equals(v.get(i+1))) 
            { 
                /*Se os elementos forem iguais, ambos são removidos do vetor. 
                Isso é feito chamando v.remove(i) duas vezes. A primeira chamada remove o elemento no índice i, 
                e a segunda chamada remove o elemento que agora está no índice i após a remoção do primeiro elemento. */
                v.remove(i); 
                v.remove(i); 
       
                /*Após a remoção, se i for maior que 0, i é decrementado. 
                Isso é feito para verificar novamente o elemento anterior, 
                pois pode ser igual ao próximo elemento após a remoção. */
                if (i > 0) 
                    i--; 
       
                //O tamanho da sequência n é então reduzido em 2, pois dois elementos foram removidos.
                n = n-2; 
            } 
       
            //Se os elementos não forem iguais, i é incrementado para passar para o próximo par de elementos.
            //O loop continua até que todos os pares de elementos consecutivos tenham sido verificados.
            else
                i++; 
        } 
       
       /*Finalmente, o método retorna o tamanho modificado do vetor, 
       que é o número de elementos restantes após a remoção 
       de todos os elementos consecutivos iguais. */
        return v.size(); 
    } 
      
    // Driver method 
    public static void main(String[] args)  
    { 
        Vector<String> v = new Vector<>(); 
  
        v.addElement("tom"); v.addElement("jerry"); 
        v.addElement("jerry");v.addElement("tom"); 
  
        System.out.println(removeConsecutiveSame(v)); 
    } 
} 
//https://www.geeksforgeeks.org/delete-consecutive-words-sequence/?ref=lbp