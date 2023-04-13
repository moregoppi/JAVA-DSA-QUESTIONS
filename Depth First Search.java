import java.util.ArrayList;

public class dfs {
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

    // In DFS we are traverse through the graph using recursion in this same we are using boolean visit array to check we peint the vertex
    // or not. In this we are visiting every single node and we are going make call for every neighbour if visit[curr] == false then it will print
    // Step 1: Print the current element and then turn visit[curr] = true;
    // Step 2: checking neighbours node are true or not
    public static void dfs(ArrayList<Edges>[] graph, int curr,boolean[] visit){
        System.out.print(curr+" ");
        visit[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edges e = graph[curr].get(i);
            if(!visit[e.dst]){
                dfs(graph, e.dst, visit);
            }
        }
    }
    public static void main(String[] args) {
        int vertex = 5;
        
        ArrayList<Edges>[] graph = new ArrayList[vertex];
        boolean[] visit = new boolean[vertex];

        createGraph(graph);

        dfs(graph, 0, visit);
    }   
}
