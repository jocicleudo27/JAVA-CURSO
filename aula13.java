//import java.io.*;
import java.util.*;

public class aula13{
    
class Graph {
    private int v;

    private LinkedList<Integer> adj[];

    //construtor
    @SuppressWarnings("unchecked")
    Graph(int V){
        this.v = V;
        adj = (LinkedList<Integer>[]) new LinkedList[v];
        for(int i = 0; i < v; ++i)
            adj[i] = new LinkedList<>();
    }
    //function to add edge into the grph
    void addEdge(int v, int w){adj[v].add(w);}

    //prints BFS traversa from a given sorce s
    void BSF(int s){
        boolean visited[] = new boolean[v];
        //create a queue for BSF
        LinkedList<Integer> queue = new LinkedList<Integer>();

        //Mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            //Dequeue a vertex from queue and print it.
            s = queue.poll();
            System.out.print(s + " ");

            // Get all adjacent vertices of the dequeued
            // vertex s.
            // If an adjacent has not been visited,
            // then mark it visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
    public static void main(String[] args){
        aula13 outerClass = new  aula13();
        Graph g = outerClass.new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal" + "(starting from vertex 2)");
        g.BSF(2);
    }
}