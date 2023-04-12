import java.util.*;
// breadth first search :- Go to imedaitely neighbours first
public class bfs {
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

    // step 1: going to store starting of gtaph in queue
    // step 2: during removing current element we are going to store the neighbours of that node into queue using Adjancey List
    public static void bfs(ArrayList<Edges>[] graph){
        Queue<Integer> q = new LinkedList<>();
        //  by deafult boolean array store false for every index
        boolean[] visit = new boolean[graph.length];
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();

            if(!visit[curr]){
                System.out.print(curr+" ");
                visit[curr] = true;

                for(int i=0; i<graph[curr].size(); i++){
                    Edges e = graph[curr].get(i);
                    q.add(e.dst);
                }
            }
        }
    }
    public static void main(String[] args) {
        int vertex = 5;

        ArrayList<Edges>[] graph = new ArrayList[vertex];

        createGraph(graph);

        bfs(graph);
    }
}
