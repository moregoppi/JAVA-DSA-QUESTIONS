import java.util.*;
public class connectedcomponents {
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
    public static void bfs(ArrayList<Edges>[] graph){
        boolean[] visit = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            bfsUtil(graph, visit);
        }
    }

    public static void bfsUtil(ArrayList<Edges>[] graph, boolean vist[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        for(!q.isEmpty()){
            int curr = q.remove();

            if(!vist[curr]){
                for(int i=0; i<graph[curr].size(); i++){
                    Edges e = graph[curr].get(i);
                    q.add(e.dst);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edges>[] graph){
        boolean[] visit = new boolean[graph.length];
        for(int i=0; i<rgaph.length; i++){
            dfsUtil(graph, visit, i);
        }
    }

    public static void dfsUtil(ArrayList<Edges>[] graph, boolean[] visit, int curr){
        System.out.println(curr+" ");
        visit[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edges e = graph[curr].get(i);
            if(!visit[e.dst]){
                dfsUtil(graph, visit, e.dst);
            }
        }
    }

    // public static void main(String[] args) {
    //     int vertex = 
    // }
}
