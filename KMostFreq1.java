import java.util.PriorityQueue;  
import java.util.Queue;  
import java.util.Map;  
import java.util.HashMap;  
  
public class KMostFreq1   
{  
  
// method that computes the first k most frequent elements of the class  
public int[] KMostFreqEle(int s, int k, int[] inputArr)   
{  
  
if (k == s)   
{  
return inputArr;  
}  
  
Map<Integer, Integer> mp = new HashMap<>();  
  
// Building the map where the element is the key and value is the  
// number of times the element is occurring in the input array inputArr[]  
for (int e : inputArr)   
{  
  
mp.put(e, mp.getOrDefault(e, 0) + 1);  
}  
  
// Elements in a heap will be sorted in descending order  
// according to the frequency of the element.  
Queue<Integer> heap = new PriorityQueue<>((a, b) -> mp.get(b) - mp.get(a));  
  
// Building the heap of the maximum size 'K'.  
for (int ky : mp.keySet())   
{  
  
heap.add(ky);  
}  
  
int temp[] = new int[k];  
  
// Building the output array.  
for (int m = 0; m < k; m++)   
{  
  
temp[m] = heap.poll();  
}  
  
  
// returning the output array  
return temp;  
}  
  
// main method  
public static void main(String argvs[])  
{  
// creating an object of the class KMostFreq1  
KMostFreq1 obj = new KMostFreq1();  
  
  
// input 1  
int inputArr[] = {5, 5, 3, 7, 9, 7, 0, 1, 2, 7};  
int k = 2;  
  
int size = inputArr.length;  
  
int arr[] = obj.KMostFreqEle(size, k, inputArr);  
  
System.out.println("For the input array: ");  
for(int i = 0 ; i < size; i++)  
{  
System.out.print(inputArr[i] + " ");  
}  
System.out.println();  
System.out.println("The first " + k + " frequent elements are:");  
for(int l = 0; l < arr.length; l++)  
{  
System.out.print(arr[l] + " ");  
}  
  
System.out.println( "\n" );  
  
// input 2  
int inputArr1[] = {9, 2, 0, 1, 4, 8, 6, 3, 0, 1, 5, 4, 4, 1, 7};  
k = 3;  
  
size = inputArr1.length;  
  
int arr1[] = obj.KMostFreqEle(size, k, inputArr1);  
  
System.out.println("For the input array: ");  
for(int i = 0 ; i < size; i++)  
{  
System.out.print(inputArr1[i] + " ");  
}  
System.out.println();  
System.out.println("The first " + k + " frequent elements are:");  
for(int l = 0; l < arr1.length; l++)  
{  
System.out.print(arr1[l] + " ");  
}  
  
}  
  
  
}  