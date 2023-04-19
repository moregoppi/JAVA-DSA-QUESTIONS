// This sorting is used for DAG graph(DAG graph is that graph which doesn't have any cycle in it)
import java.util.*;
public class topologivalsorting {
    static class Edge{
        int src;
        int dst;
        int weight;

        public Edge(int s, int d, int w){  
            this.src = s;
            this.dst = d;
            this.weight = w;
        }
    }
// graph to bew built
    //   (1)
    // 0-------1-------  
    //         |      |
    //     (5) |      |(2)
    //         |  (2) |
    //         2------3
    //         |
    //         |(3)
    //         |
    //         4

    static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }   

        // storing 0th vertex
        graph[0].add(new Edge(0, 1, 1));

        // sotring 1th vertex
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 5));
        graph[1].add(new Edge(1, 3, 2));

        // storing 2th vertex
        graph[2].add(new Edge(2, 1, 5));
        graph[2].add(new Edge(2, 3, 2));
        graph[2].add(new Edge(2, 4, 3));

        // storing 3th vertex
        graph[3].add(new Edge(3, 1, 2));
        // graph[3].add(new Edge(3, 2, 2));

        // storing 4th vertex
        graph[4].add(new Edge(4, 2, 3));
    }

    // Time complexity:- O(v+e)
    // we are going to use stack for this sorting and dfs
    public static void topSort(ArrayList<Edge>[] graph){
        boolean[] visit = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<graph.length; i++){
            if(!visit[i]){
                topSortUtil(graph, i, visit, s);
            }
        }

        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }

    public static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] visit, Stack<Integer> s){
        visit[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visit[e.dst]){
                topSortUtil(graph, e.dst, visit, s);
            }
        }
        s.push(curr);
    }
    public static void main(String[] args) {
        int vertex = 5;

        ArrayList<Edge>[] graph = new ArrayList[vertex];

        createGraph(graph);

        topSort(graph);
    }
}
