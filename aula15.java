public class aula15 {
    class BellmanFord {
        final static int INF = Integer.MAX_VALUE, V = 5;
        
        void printArr(int dist[], int v){
            System.out.println("Vertex Distance from Source");
            for(int i = 0; i < v; i++)
                System.out.println(i + "\t\t" + dist[i]);
        }

        void BellmanFord(int graph[][], int src){
            int dist[] = new int[V];
            for(int i = 0; i < V; ++i)
                dist[i] = INF;
            dist[src] = 0;

            for(int i = 1; i < V; ++i){
                for(int u = 0; u < V; ++u){
                    for(int v = 0; v < V; ++v) {
                        if(graph[u][v] != INF) {
                            if(dist[u] != INF && dist[u] + graph[u][v] < dist[v])
                                dist[v] = dist[u] + graph[u][v];
                        }
                    }
                }
            }
            for (int u = 0; u < V; ++u) {
                for (int v = 0; v < V; ++v) {
                    if (graph[u][v] != INF) {
                        if (dist[u] != INF && dist[u] + graph[u][v] < dist[v]) {
                            System.out.println("Graph contains negative weight cycle");
                            return;
                        }
                    }
                }
            }
            printArr(dist, V);
        }
    }

    public static void main(String[] args) {
        int graph[][] = { { 0, -1, 4, INF, INF },
                          { INF, 0, 3, 2, 2 },
                          { INF, INF, 0, INF, INF },
                          { INF, 1, 5, 0, INF },
                          { INF, INF, INF, -3, 0 } };
        aula15 a = new aula15();
        BellmanFord b = a.new BellmanFord();
        b.BellmanFord(graph, 0);
    }
}

