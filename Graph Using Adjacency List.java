import java.util.*;

import javax.swing.GroupLayout.Group;

public class creatinggraphusingadjanceylist {
    static class Edges{
        int src;  //source
        int dst;  //destination
        int wgt;  //weight

        public Edges(int s, int d, int w){
            this.src = s;
            this.dst = d;
            this.wgt = w;
        }
    }
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
    public static void main(String[] args) {
        int Vertex = 5;   //number of nodes
        
        // this means a array whose type is ArrayList<Edges> for length of vertex
        // imagine: int[] graph = new int[Vertex];
        ArrayList<Edges>[] graph = new ArrayList[Vertex];

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

        // if we have to find the neighbours of vertex 2
        for(int i=0; i<graph[2].size(); i++){
            // here we are going on every arraylist of that index and getting its destination from their
            Edges e = graph[2].get(i);
            System.out.print(e.dst+" ");
        }
    }    
}
