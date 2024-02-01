import java.util.*;
public class Main{
public static class Pair implements Comparable<Pair>{
int h;
int w;
int l;
Pair(int h,int w,int l){
this.h=h;
this.w=w;
this.l=l;
        }  
public int compareTo(Pair o){
if(this.w==o.w)
return o.l-this.l;
return this.w-o.w;
        }  
    }  
public static void main(String[] args){
int[] altura={4,1,4,10};
int[] largura={6,2,5,12};
int[] comprimento={7,3,6,32};
          
System.out.println(getHeight(altura,largura,comprimento));
    }  
public static int getHeight(int[] altura,int[] largura,int[] comprimento){
        ArrayList<Pair> arr = new ArrayList<>();  
for(int i=0; i<altura.length; i++){
            if(largura[i]<comprimento[i]){  
arr.add(new Pair(altura[i],largura[i],comprimento[i]));
            }else{  
arr.add(new Pair(altura[i],comprimento[i],largura[i]));
            }  
              
            if(altura[i]<comprimento[i]){  
arr.add(new Pair(largura[i],altura[i],comprimento[i]));
            }else{  
arr.add(new Pair(largura[i],comprimento[i],altura[i]));
            }  
              
            if(altura[i]<largura[i]){  
arr.add(new Pair(comprimento[i],altura[i],largura[i]));
            }else{  
arr.add(new Pair(comprimento[i],largura[i],altura[i]));
            }  
        }  
        Collections.sort(arr);  
int[] dp=new int[arr.size()];
        int ans=0;  
for(int i=0; i<dp.length; i++){
            if(i==0){  
                dp[i]=arr.get(i).h;  
ans=Math.max(ans,dp[i]);
                continue;  
            }  
int max=0;
for(int j=0; j<i;j++){
if(arr.get(j).l< arr.get(i).l && arr.get(j).w<arr.get(i).w)
max=Math.max(max,dp[j]);
            }  
            dp[i]=arr.get(i).h+max;  
ans=Math.max(ans,dp[i]);
        }  
return ans;
    }  
     
}
/*Aqui, estamos declarando uma classe pública chamada Main. 
Em Java, todo aplicativo deve conter uma classe principal 
que é usada pelo sistema Java para iniciar o aplicativo.

public class Main{

Esta é a declaração de uma classe interna estática chamada Pair. 
A palavra-chave implements é usada para indicar que esta classe implementará a interface Comparable. 
Isso significa que os objetos desta classe terão uma ordem natural.

public static class Pair implements Comparable<Pair>{

Estas são as variáveis de instância da classe Pair. 
Cada objeto Pair terá seu próprio conjunto de estas variáveis.

int h;
int w;
int l;

Este é o construtor da classe Pair. 
Ele é chamado quando um novo objeto Pair é criado e inicializa as variáveis 
de instância com os valores passados.
Pair(int h,int w,int l){
this.h=h;
this.w=w;
this.l=l;
        }  

Este é o método compareTo que toda classe que implementa a interface Comparable deve definir. 
Ele é usado para comparar este objeto com outro objeto do mesmo tipo.

public int compareTo(Pair o){
if(this.w==o.w)
return o.l-this.l;
return this.w-o.w;
        }  
    }  

public static void main(String[] args){

Estas linhas declaram e inicializam três arrays de inteiros.

int[] altura={4,1,4,10};
int[] largura={6,2,5,12};
int[] comprimento={7,3,6,32};

Esta linha chama o método getHeight com os três arrays como argumentos e imprime o resultado.

System.out.println(getHeight(altura,largura,comprimento));
    }  

Esta é a declaração do método getHeight. 
Ele é um método estático, o que significa que pertence
à classe Main e não a qualquer objeto individual da classe.

public static int getHeight(int[] altura,int[] largura,int[] comprimento){

Esta linha cria um novo objeto ArrayList que irá armazenar objetos do tipo Pair.

ArrayList<Pair> arr = new ArrayList<>();  

Este é o início de um loop for que irá percorrer cada elemento dos arrays.

for(int i=0; i<altura.length; i++){

Dentro do loop, estas linhas estão adicionando um novo objeto Pair ao ArrayList. 
O objeto Pair é criado com os elementos dos arrays. 
A ordem dos elementos é determinada pela comparação entre largura[i] e comprimento[i].

if(largura[i]<comprimento[i]){  
arr.add(new Pair(altura[i],largura[i],comprimento[i]));
            }else{  
arr.add(new Pair(altura[i],comprimento[i],largura[i]));
            }  


Esta linha classifica o ArrayList de objetos Pair. 
A ordem da classificação é determinada pelo método compareTo na classe Pair.

Collections.sort(arr);  

Esta linha cria um novo array de inteiros chamado dp. 
O tamanho do array é o mesmo que o tamanho do ArrayList.

int[] dp=new int[arr.size()];

Este é o início de outro loop for que irá percorrer cada elemento do array dp.

for(int i=0; i<dp.length; i++){

Dentro do loop, se i for 0, o código define dp[i] para arr.get(i).h 
e atualiza ans para ser o máximo de ans e dp[i]. 
Então ele pula para a próxima iteração do loop.

if(i==0){  
    dp[i]=arr.get(i).h;  
ans=Math.max(ans,dp[i]);
    continue;  
}  

Estas linhas estão dentro do loop for, mas fora do if. 
Elas definem max para ser o máximo valor de dp[j] para todos j onde arr.get(j).l 
é menor que arr.get(i).l e arr.get(j).w 
é menor que arr.get(i).w.

int max=0;
for(int j=0; j<i;j++){
if(arr.get(j).l< arr.get(i).l && arr.get(j).w<arr.get(i).w)
max=Math.max(max,dp[j]);
            }  

Estas linhas atualizam dp[i] e ans com base no valor de max e arr.get(i).h.

dp[i]=arr.get(i).h+max;  
ans=Math.max(ans,dp[i]);

Esta é a última linha do método getHeight. Ela retorna o valor de ans, que é o resultado do cálculo.

return ans;
    }  

*/