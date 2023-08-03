// Shortest path in Directed Acyclic Graph
// MediumAccuracy: 48.48%Submissions: 51K+Points: 4
// Given a Directed Acyclic Graph of N vertices from 0 to N-1 and a 2D Integer array(or vector) edges[ ][ ] of length M, where there is a directed edge from edge[i][0] to edge[i][1] with a distance of edge[i][2] for all i.

// Find the shortest path from src(0) vertex to all the vertices and if it is impossible to reach any vertex, then return -1 for that vertex.

// Example1:

// Input:
// N = 4, M = 2
// edge = [[0,1,2],[0,2,1]
// Output:
// 0 2 1 -1
// Explanation:
// Shortest path from 0 to 1 is 0->1 with edge weight 2. 
// Shortest path from 0 to 2 is 0->2 with edge weight 1.
// There is no way we can reach 3, so it's -1 for 3.
// Example2:

// Input:
// N = 6, M = 7
// edge = [[0,1,2],[0,4,1],[4,5,4],[4,2,2],[1,2,3],[2,3,6],[5,3,1]]
// Output:
// 0 2 3 6 1 5
// Explanation:
// Shortest path from 0 to 1 is 0->1 with edge weight 2. 
// Shortest path from 0 to 2 is 0->4->2 with edge weight 1+2=3.
// Shortest path from 0 to 3 is 0->4->5->3 with edge weight 1+4+1=6.
// Shortest path from 0 to 4 is 0->4 with edge weight 1.
// Shortest path from 0 to 5 is 0->4->5 with edge weight 1+4=5.
// Your Task:

// You don't need to print or input anything. Complete the function shortest path() which takes an integer N as number of vertices, an integer M as number of edges and a 2D Integer array(or vector) edges as the input parameters and returns an integer array(or vector), denoting the list of distance from src to all nodes.

// Expected Time Complexity: O(N+M), where N is the number of nodes and M is edges
// Expected Space Complexity: O(N)

// Constraint:
// 1 <= N,M <= 100
// 0 <= edgei,0,edgei,1 < n
// 0 <= edgei,2 <=105



//User function Template for Java
class Solution {

	public int[] shortestPath(int N,int M, int[][] edges) {
		//Code here
		List<int[]>[] graph = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }
        
        // Populate the graph with the given edges and their weights
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];
            graph[u].add(new int[]{v, weight});
        }
        
        // Initialize the shortest path array and set the distance of the source vertex to 0
        int[] shortestDistances = new int[N];
        Arrays.fill(shortestDistances, Integer.MAX_VALUE);
        shortestDistances[0] = 0;
        
        // Perform topological sort to visit vertices in the correct order
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0); // Start from the source vertex
        while (!queue.isEmpty()) {
            int u = queue.poll();
            
            for (int[] neighbor : graph[u]) {
                int v = neighbor[0];
                int weight = neighbor[1];
                int newDistance = shortestDistances[u] + weight;
                
                // Update the shortest distance if the new distance is smaller
                if (newDistance < shortestDistances[v]) {
                    shortestDistances[v] = newDistance;
                    queue.add(v);
                }
            }
        }
        
        // Convert unreachable vertices (with no path from source) to -1
        for (int i = 0; i < N; i++) {
            if (shortestDistances[i] == Integer.MAX_VALUE) {
                shortestDistances[i] = -1;
            }
        }
        
        return shortestDistances;
	}
}
