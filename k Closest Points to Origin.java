// 973. K Closest Points to Origin
// Medium
// 7.2K
// 260
// Companies
// Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, return the k closest points to the origin (0, 0).

// The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).

// You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).

 

// Example 1:


// Input: points = [[1,3],[-2,2]], k = 1
// Output: [[-2,2]]
// Explanation:
// The distance between (1, 3) and the origin is sqrt(10).
// The distance between (-2, 2) and the origin is sqrt(8).
// Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
// We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].
// Example 2:

// Input: points = [[3,3],[5,-1],[-2,4]], k = 2
// Output: [[3,3],[-2,4]]
// Explanation: The answer [[-2,4],[3,3]] would also be accepted.
 

// Constraints:

// 1 <= k <= points.length <= 104
// -104 < xi, yi < 104



class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] arr = new int[k][2];

        int distance[][] = new int[points.length][2];

		for(int i=0; i<points.length; i++){
		    int distance1 = (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);
		    distance[i][1] = distance1;
		    distance[i][0] = i;
		    
		}
		
		Arrays.sort(distance, Comparator.comparingDouble(o -> o[1]));

        for(int i=0; i<k; i++){
            arr[i][0] = points[distance[i][0]][0];
            arr[i][1] = points[distance[i][0]][1];
        }

        return arr;
    }
}






// Using PriorityQueue
import java.awt.Point;
import java.util.*;
public class nearbycars {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distSq;
        int indx;

        public Point(int x, int y, int distSq, int indx){
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.indx = indx;
        }

        @Override
        public int compareTo(Point p2){
            return this.distSq - p2.distSq;
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{3,3}, {3,-1}, {2,4}};
        int k = 2;
        PriorityQueue<Point> pq =new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            int distSq = (arr[i][0] * arr[i][0]) + (arr[i][1] * arr[i][1]);
            pq.add(new Point(arr[i][0], arr[i][1], distSq, i));
        }

        for(int i=0; i<k; i++){
            System.out.println("C"+pq.remove().indx);
        }
    }
}
