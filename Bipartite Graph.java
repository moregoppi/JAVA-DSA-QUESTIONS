// Bipartite Graph is the a graph whose vertices can be divided into two disjoint and independent sets and, 
// that is every edge connects a vertex in to one in. Means a single edge vertex cannot be in same group(two nodes who connect to each other)
import java.util.*;

public class bipartitegraph {
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
        // graph[3].add(new Edges(3, 2, 2));

        // storing 4th vertex
        graph[4].add(new Edges(4, 2, 3));
    }
    // Time complexity: O(V+E)
    // Case 1: when neighbour colour is equal to the current node or vertx(this means both the vertex of the edsge are in the same group) that why return false
    // Case 2: when neighbour colour is not equal to the current node or vertex in this case we will continue 
    // Case 3: when neighbour coloue is not decided than we will assign a colour to if its yellow than it will be other colour

    public static boolean detactBipartiteGraph(ArrayList<Edges>[] graph){
        int[] colour = new int[graph.length];
        Arrays.fill(colour, -1);

        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<graph.length; i++){
            if(colour[i] == -1){
                q.add(i);
                colour[i] = 0;
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j=0; j<graph[curr].size(); j++){
                        Edges e = graph[curr].get(j);
                        if(colour[e.dst] == -1){
                            int nextCol = colour[curr] == 0 ? 1:0;
                            colour[e.dst] = nextCol;
                            q.add(e.dst);
                        }else if(colour[e.dst] == colour[curr]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int vertex = 5;

        ArrayList<Edges>[] graph = new ArrayList[vertex];

        createGraph(graph);

        System.out.println(detactBipartiteGraph(graph));
    }
}
