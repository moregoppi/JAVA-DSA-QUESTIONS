import java.util.*;

public class haspath {
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

    public static boolean findPath(ArrayList<Edges>[] graph, int src, int dest, boolean[] visit){
        if(src == dest){
            return true;
        }

        visit[src] = true;
        for(int i=0; i<graph[src].size(); i++){
            Edges e = graph[src].get(i);
            if(!visit[e.dst] && findPath(graph, e.dst, dest, visit)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int vertex = 5;

        ArrayList<Edges>[] graph = new ArrayList[vertex];
        boolean[] visit = new boolean[vertex];

        createGraph(graph);
        
        System.out.println(findPath(graph, 0, 4, visit));
    }
}
