import java.util.*;
public class usingobject {
    // impements comparable helps us to compare object because doesn't have their function for comparing
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        Student(String name,int rank){
            this.name = name;
            this.rank = rank;
        }
        // here we are compare on the basis of rank
        @Override
        public int compareTo(Student s2){
            // this.rank - s2.rank < 0 this means s1 rank is smaller than s2 and 
            // if we get this.rank - s2.rank > 0 this means s1 is larger than s2
            // if we get this.rank - s2.rank = 0 this means both are equal this means any of them getting priority
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 4));
        pq.add(new Student("B", 12));
        pq.add(new Student("C", 1));
        pq.add(new Student("D", 2));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
    }
}
