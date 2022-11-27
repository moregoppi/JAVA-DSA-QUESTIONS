//Given the weights and values of N items, put these items in a knapsack
//of capacity W to get te maximum total value in the knapsack

import java.util.*;

public class fractionalknapstack {
    public static void main(String[] args) {
        
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int totalweight = 50;

        double ratio[][] = new double[val.length][2];
        //0th col = index  1st col = ratio

        for(int i=0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(int)weight[i];
        }

        //sorting 2d array in ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o ->o[1]));

        int capacity = totalweight;
        int finalVal = 0;
        //we have to check in desceding order that's why we start from last element of array
        for(int i=ratio.length-1; i>=0; i--){
            int index = (int)ratio[i][0];
            if(capacity >= weight[index]){
                finalVal += val[index];
                capacity -= weight[index];
            }else{
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("final Value = "+finalVal);
    }
}
