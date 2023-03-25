// We jave yo find the whole journey where to start and where to end 

// Approach:- Step1: For this question we have to find the starting point from where we have to start the journey
                    // for this we are going to use two hashmap one contain which show from->to and another map to->from
                    // using this we are going to check that from which are not present at to in first map that will be our starting point
            // Step2: We are going to traverse through first map using the starting point that's how we got our journey

import java.util.*;
public class findjourney {
    public static String findStartingPoint(HashMap<String, String> map){
        HashMap<String, String> revMap = new HashMap<>();

        // here we are assigning to as a key and from as a value(reversing map)
        for(String key : map.keySet()){
            revMap.put(map.get(key), key);
        }

        for(String key : map.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> map  = new HashMap<>();
        map.put("Chennai", "Banguluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        String start = findStartingPoint(map);
        System.out.print(start);

        for(String key : map.keySet()){
            System.out.print("->" + map.get(key));
        }
    }
}
