import java.util.*;
import java.lang.*;
import java.io*;

public class aula14{
    class ShortestPath{
        static final int V = 9;
        int minDistance(int dist[], Boolean SptSet[]){//Boolean sptSet é um array usado para ratrear os vertices inluidos na arvore do caminho mais curto.
            //inicializa o valor minimo
            int min = Integer.MAX_VALUE, min_index = -1;

            for(int v = 0 ; v < V; v++)
//sptSet[v] == false: Isso verifica se o vértice v ainda não foi incluído na árvore do caminho mais curto.
                if(sptSet[v] == false && dist[v] <= min){
                    min = dist[v];//Isso atualiza o valor mínimo (min) para a distância do vértice de origem ao vértice v.
                    min_index = v;//Isso atualiza o índice do vértice com a distância mínima para v.
                }
            return min_index;
        }
        //Uma função de utilitário para imprimir a distância construída array.
        void printSolution(int dist[]){
            System.out.println("Vertex \t\t Distance from Source");
            for(int i = 0; i < V; i++)
            System.out.println(i + " \t\t " + dist[i]);
        }
        //Função que implementa a fonte única de Dijkstra
        //algoritmo de caminho mais curto para um grafo representado usando representação matricial de adjacência.
        void Dijkstra(int graph[][], int src){// Esta é a representação matricial de adjacência do gráfico.
            //int src: Este é o vértice de origem a partir do qual o algoritmo de Dijkstra é executado.
            int dist[] = new int[V];//cria  um novo array de inteiros chamado dist com tamanho V.
            Boolean sptSet[] = new Boolean[V];//cria um novo array de booleanos chamado sptSet com tamanho V
            //Inicialize todas as distâncias como INFINITE e stpSet[] como false.
            for(int i = 0; i < V; i++){
                dist[i] = Integer.MAX_VALUE;//define a distância inicial do vértice de origem ao vértice i como Integer.MAX_VALUE, que é o maior valor possível para um int
                sptSet[i] = false;//define o valor inicial de sptSet[i] como false, indicando que o vértice i ainda não foi incluído na árvore do caminho mais curto
            }
            //A distância do vértice da fonte de si mesmo é sempre 0
            dist[src] = 0;
            //Encontre o caminho mais curto para todos os vértices
            //Este é um loop for que executa V - 1 vezes, onde V é o número de vértices no gráfico. O loop é usado para construir a árvore do caminho mais curto.
            for(int count = 0; count < V -1; count++){
                // Escolha o vértice de distância mínima do conjunto
                //e vértices ainda não processados. u é sempre
                //igual a src na primeira iteração.
                int u = minDistance(dist, sptSet);
                //Esta linha chama o método minDistance(dist, sptSet) e armazena o resultado na variável u. 
                //O método minDistance(dist, sptSet) retorna o índice do vértice com a menor distância, 
                //a partir do conjunto de vértices ainda não incluídos na árvore do caminho mais curto.
                
                //Marque o vértice escolhido como processado
                sptSet[u] = true;// Esta linha marca o vértice u como incluído na árvore do caminho mais curto.

            }
        }
    }

}