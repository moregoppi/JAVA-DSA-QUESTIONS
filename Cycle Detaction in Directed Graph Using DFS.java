// In this we are going to detact the cycle in directed graph using Depth First Search
import java.util.*;
public class cycledetactionindirectedgraphusingdfs { 
    static class Edges{
        int src;
        int dst;
        int weight;

        public Edges(int s, int d, int w){  
            this.src = s;
            this.dst = d;
            this.weight = w;
        }
    }

    // graph to bew built
    //   (1)
    // 0-------"1------  
    //         |      |
    //     (5) |      |(2)
    //         |  (2) |
    //         "      "
    //         2      3
    //         |
    //         |(3)
    //         |
    //         "
    //         4

    static void createGraph(ArrayList<Edges>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }   

        // storing 0th vertex
        graph[0].add(new Edges(0, 1, 1));

        // sotring 1th vertex
        // graph[1].add(new Edges(1, 0, 1));
        graph[1].add(new Edges(1, 2, 5));
        graph[1].add(new Edges(1, 3, 2));

        // storing 2th vertex
        // graph[2].add(new Edges(2, 1, 5));
        // graph[2].add(new Edges(2, 3, 2));
        graph[2].add(new Edges(2, 4, 3));

        // storing 3th vertex
        // graph[3].add(new Edges(3, 1, 2));
        // graph[3].add(new Edges(3, 2, 2));

        // storing 4th vertex
        // graph[4].add(new Edges(4, 2, 3));
    }
    public static boolean detactCycle(ArrayList<Edges>[] graph){
        boolean[] visit = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!visit[i]){
                if(detactUtil(graph, i, stack, visit)){
                    return true;
                }
            }
        }
        return false;
    }

    // we are using stack boolean array to check if which node is come for that recursion call
    // -> if neighbour of any vertex stack if true means it's already visited then it will return true because this means we came back to the that 
    // vertex from which we started
    // -> if this not happend than we will check if visit of neighbour is true or not means it have cycle in it or not 

    public static boolean detactUtil(ArrayList<Edges>[] graph, int curr, boolean[] stack, boolean[] visit){
        stack[curr] = true;
        visit[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edges e = graph[curr].get(i);
            if(stack[e.dst]){
                return true;
            }
            if(!visit[e.dst] && detactUtil(graph, e.dst, stack, visit)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }
    public static void main(String[] args) {
        int vertex = 5;

        ArrayList<Edges>[] graph = new ArrayList[vertex];

        createGraph(graph);

        if(detactCycle(graph)){
            System.out.println("Their is cycle in the graph");
        }else{
            System.out.println("Their is no cycle in the graph");
        }
    }
}
