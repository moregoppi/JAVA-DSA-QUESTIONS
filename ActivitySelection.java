import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;

//you are given n activities with their start and end times. Select the maximum numbwe of activites
//that can be performed by a single person, assuming that a person can only work on a single activity at a time. 
//Activites are sorted accordung to end time.

//this question is done with the basis of end array because it decide the shortest job which we done

public class activityselection {
    public static void main(String[] args) {

        //this is activites(start and end) are unsorted
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        int activites[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activites[i][0] = i;
            activites[i][1] = start[i];
            activites[i][2] = end[i];
        }
        //this is lambda function -> shortform
        Arrays.sort(activites, Comparator.comparingDouble(o -> o[2]));

        int maxActivity = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxActivity = 1;
        ans.add(activites[0][0]);
        int lastEnd = activites[0][2];

        for(int i=1; i<end.length; i++){
            if(activites[i][1] >= lastEnd){
                maxActivity++;
                ans.add(activites[i][0]);
                lastEnd = activites[i][2];
            }
        }






        //this is if activites(start and end) are sorted
        // int start[] = {1, 3, 0, 5, 8, 5};
        // int end[] = {2, 4, 6, 7, 9, 9};

        // //end time basis sorted
        // int maxActivity = 0;
        // ArrayList<Integer> ans = new ArrayList<>();

        // //1st activity
        // maxActivity = 1;
        // ans.add(0);
        // int lastEnd = end[0];
        // for(int i=1; i<end.length; i++){
        //     if(start[i] >= lastEnd){
        //         maxActivity++;
        //         ans.add(i);
        //         lastEnd = end[i];
        //     }
        // }

        System.out.println("max Activities are = "+maxActivity);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+i+" ");
        }
    }    
}
