/* Nesta abordagem, dividiremos o problema em problemas menores. 
É óbvio que o késimo elemento frequente superior é (n - k)ésimo menos frequente. 
Assim, fazemos uma classificação parcial do elemento menos frequente para o mais frequente, 
até que o (n - k)ésimo elemento menos frequente assuma a posição (n - k) na matriz classificada. 
Nós conseguimos isso usando a seleção rápida. Observe as etapas a seguir.

1º Passo: Crie um mapa de hash, onde key é o elemento e value é a frequência de ocorrência 
desse elemento na matriz de entrada.

2º Passo: Usando um loop, itere sobre os elementos e aumente seu valor em 1 no mapa de 
hash criado na etapa anterior.

Passo 3: Defina o len como o 'MAP. TAMANHO'.

Passo 4: Crie uma matriz temp que conterá inteiros e insira todas as chaves do mapa de hash nela.

Passo 5: Invoque o método quickSel(0, 'len' - 1, len - 'K').

Passo 6: Retorne os elementos da matriz temp do índice (len - K) para len.

No método quickSel(lft, rght, kSml'), faça o seguinte

Se o "lft" for o mesmo que "rght", saia do método.
Escolha um pivô que esteja entre "lft" e "rght".
Defina o pivô como a partição (lft, rght, pvt).
Se 'kSml' é o mesmo que o 'pvt, então saia do método.
Caso contrário, se 'kSml' for menor que 'pvt, chame o método quickselect() na partição esquerda. 
Caso contrário, chame o método quickSel() na partição direita.

*/


import java.util.Arrays;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;
  
public class KMostFreq
{  
  
// campos da classe  
int uniqueArr[];  
Map<Integer, Integer> mp;
  
// método que calcula os primeiros k elementos mais frequentes da classe  
public int[] KMostFreqEle(int s, int k, int[] inputArr)
{  
// criando um objeto da classe HashMap  
mp = new HashMap<>(); 
// Construindo o mapa onde a chave é o elemento  
// e o valor é a frequência de ocorrência desse elemento.  
for (int e : inputArr)   
{  
mp.put(e, mp.getOrDefault(e, 0) + 1);  
}   
// tamanho de computação do mapa  
int len = mp.size();  
uniqueArr = new int[len];
int j = 0;  
// Construindo a matriz dos elementos exclusivos.  
for (int n : mp.keySet())
{  
uniqueArr[j] = n;
j = j + 1;  
}  
// Executando o quickSel.  
quickSel(0, len - 1, len - k);
// Retornando os elementos 'K' superiores  
return Arrays.copyOfRange(uniqueArr, len - k, len);
}   
public void quickSel(int lft, int rght, int kSmall)
{   
// Se houver apenas um elemnt na lista  
if (lft == rght)   
{  
return;  
}  
// criando um objeto da classe Random  
Random rndm = new Random();
// Selecionando um índice aleatório como pivô.  
int pvt = lft + rndm.nextInt(rght - lft);  
// Encontrar a posição do pvot na lista que é classificada.  
pvt = partição (lft, rght, pvt);
// Se o pvt estiver localizado em sua posição final.  
if (kSmall == pvt)   
{  
return;  
}  
else if (kSmall < pvt)
{  
// Movendo-se na direção que resta.  
quickSel(lft, pvt - 1, kSmall);  
}  
else   
{  
// Movendo-se na direção que é certa.  
quickSel(pvt + 1, rght, kSmall);
}  
}  
  
public int partição (int lft, int rght, int pvt)
{  
int pivotFreq = mp.get(uniqueArr[pvt]);  
// Movendo o pivô para o fim.  
Swap(pvt, rght);
int idx = lft;  
// Movendo todos os elementos menos frequentes   
// para o lado esquerdo do pivô.  
for (int j = lft; j <= rght; j++)
{  
if (mp.get(uniqueArr[j]) < pivotFreq)
{  
Swap(idx, j);
idx = idx + 1;  
}  
}  
// Movendo o pivô para o lugar final.  
Swap(idx, rght);  
return idx;
}  
// um método que troca o elemento   
public void Swap (int m, int n)
{  
int tmp = uniqueArr[m];
uniqueArr[m] = uniqueArr[n];
uniqueArr[n] = tmp;
}  
// Método principal  
public static void main(String argvs[])
{  
// criando um objeto da classe KMostFreq  
KMostFreq obj = new KMostFreq();
// entrada 1  
int inputArr[] = {5, 5, 3, 7, 9, 7, 0, 1, 2 , 7};
int k = 2;  
int size = inputArr.length;  
int arr[] = obj.KMostFreqEle(size, k, inputArr);
System.out.println("Para a matriz de entrada: ");
for(int i = 0 ; i < size; i++)
{  
System.out.print(inputArr[i] + " ");
}

System.out.println();  
System.out.println("Os primeiros " + k + " elementos frequentes são:");
for(int l = 0; l < arr.length; l++)
{  
System.out.print(arr[l] + " ");
}  
  
System.out.println( "\n" );    
// entrada 2  
int inputArr1[] = {9, 2, 0, 1, 4, 8, 6, 3, 0, 1, 5, 4, 4, 1 , 7};
k = 3;  
size = inputArr1.length;
int arr1[] = obj.KMostFreqEle(size, k, inputArr1);
System.out.println("Para a matriz de entrada: ");
for(int i = 0 ; i < size; i++)
{  
System.out.print(inputArr1[i] + " ");
}
  
System.out.println();  
System.out.println("Os primeiros " + k + " elementos frequentes são:");
for(int l = 0; l < arr1.length; l++)
{  
System.out.print(arr1[l] + " ");
}  
  
}  
  
  
}
