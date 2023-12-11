
public class aula14 {
    class ShortestPath {
        static final int V = 9;
        int minDistance(int dist[], Boolean sptSet[]) {
            int min = Integer.MAX_VALUE, min_index = -1;
            for (int v = 0; v < V; v++)
                if (sptSet[v] == false && dist[v] <= min) {
                    min = dist[v];
                    min_index = v;
                }
            return min_index;
        }

        void printSolution(int dist[]) {
            System.out.println("Vertex \t\t Distance from Source");
            for (int i = 0; i < V; i++)
                System.out.println(i + " \t\t " + dist[i]);
        }

        void dijkstra(int graph[][], int src) {
            int dist[] = new int[V];
            Boolean sptSet[] = new Boolean[V];
            for (int i = 0; i < V; i++) {
                dist[i] = Integer.MAX_VALUE;
                sptSet[i] = false;
            }
            dist[src] = 0;
            for (int count = 0; count < V - 1; count++) {
                int u = minDistance(dist, sptSet);
                sptSet[u] = true;
                for (int v = 0; v < V; v++)
                    if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
                        dist[v] = dist[u] + graph[u][v];
            }
            printSolution(dist);
        }
    }

    public static void main(String[] args) {
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                                      { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                                      { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                                      { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                                      { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                                      { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                                      { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                                      { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                                      { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        aula14 t = new aula14();
        ShortestPath sp = t.new ShortestPath();
        sp.dijkstra(graph, 0);
    }
}
/*
 * static final int V = 9; // Número de vértices no grafo
 * 
 * int minDistance(int dist[], Boolean sptSet[]) { // Função para encontrar o vértice com a distância mínima do conjunto de vértices ainda não processados
 * 
 * int min = Integer.MAX_VALUE, min_index = -1; // Inicializa o valor mínimo
 * 
 * if (sptSet[v] == false && dist[v] <= min) { // Verifica se o vértice v ainda não foi incluído na árvore do caminho mais curto
 * 
 * min = dist[v]; // Isso atualiza o valor mínimo (min) para a distância do vértice de origem ao vértice v
 * 
 * min_index = v; // Isso atualiza o índice do vértice com a distância mínima para v
 * 
 *  void printSolution(int dist[]) { // Função para imprimir o array de distâncias
 * 
 * void dijkstra(int graph[][], int src) { // Função que implementa o algoritmo de Dijkstra para um grafo representado como uma matriz de adjacência
 * 
 * int dist[] = new int[V]; // A saída será este array dist[] que contém as distâncias mais curtas de src para i
 * 
 * Boolean sptSet[] = new Boolean[V]; // sptSet[i] será verdadeiro se o vértice i estiver incluído na árvore do caminho mais curto
 * 
 * dist[i] = Integer.MAX_VALUE; // Inicializa todas as distâncias como infinito e stpSet[] como falso
 * 
 * dist[src] = 0; // A distância do vértice de origem para si mesmo é sempre  zero.
 * 
 * for (int count = 0; count < V - 1; count++) { // Encontra o caminho mais curto para todos os vértices
 * 
 * int u = minDistance(dist, sptSet); // Escolhe o vértice de distância mínima do conjunto de vértices ainda não processados. u é sempre igual a src na primeira iteração
 * 
 * sptSet[u] = true; // Marca o vértice escolhido como processado
 * 
 * for (int v = 0; v < V; v++) // Atualiza o valor dist[v] de todos os vértices adjacentes ao vértice escolhido
 * 
 * dist[v] = dist[u] + graph[u][v]; // Atualiza dist[v] apenas se não estiver em sptSet, houver uma aresta de u para v e o peso total do caminho da origem para v através de u for menor que o valor atual de dist[v]
 * 
 * printSolution(dist); // Imprime o array de distâncias
 * 
 * sp.dijkstra(graph, 0); // Chama a função dijkstra
 */