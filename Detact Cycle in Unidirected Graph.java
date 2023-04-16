import java.util.*;
public class detactcycle {
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
    // 0-------1-------  
    //         |      |
    //     (5) |      |(2)
    //         |  (2) |
    //         2------3
    //         |
    //         |(3)
    //         |
    //         4

    static void createGraph(ArrayList<Edges>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }   

        // storing 0th vertex
        graph[0].add(new Edges(0, 1, 1));

        // sotring 1th vertex
        graph[1].add(new Edges(1, 0, 1));
        graph[1].add(new Edges(1, 2, 5));
        graph[1].add(new Edges(1, 3, 2));

        // storing 2th vertex
        graph[2].add(new Edges(2, 1, 5));
        graph[2].add(new Edges(2, 3, 2));
        graph[2].add(new Edges(2, 4, 3));

        // storing 3th vertex
        graph[3].add(new Edges(3, 1, 2));
        graph[3].add(new Edges(3, 2, 2));

        // storing 4th vertex
        graph[4].add(new Edges(4, 2, 3));
    }

    public static boolean detactCycle(ArrayList<Edges>[] graph){
        boolean[] visit = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!visit[i]){
                if(detactCycleUtil(graph, visit, i, -1)){
                    return true;
                }
            }
        }
        return false;
    }
    // (parent is node from which we come from to curr node)

    // how to detact cycle 
    // case 1: when neighbour is visited but its not the parent in this case we will return true because cycle is formed

    // case 2: when neighbour is visited for curr node also its the parent of curr node in that case we will (continue)

    // case 3: when nighbour is not visited we call the function again to check if cycle is present or not if it is than we return true

    public static boolean detactCycleUtil(ArrayList<Edges>[] graph, boolean[] visit, int curr, int parent){
        visit[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edges e = graph[curr].get(i);
            if(!visit[curr]){
                // case 3
                if(detactCycleUtil(graph, visit, e.dst, curr)){
                    return true;
                }
            }
            // case 1
            else if(visit[curr] && e.dst != parent){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v = 5;
        
        ArrayList<Edges>[] graph = new ArrayList[v];

        createGraph(graph);

        System.out.println(detactCycle(graph));
    }
}
