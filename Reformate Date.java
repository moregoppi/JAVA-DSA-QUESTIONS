// 1507. Reformat Date
// Easy
// 337
// 383
// Companies
// Given a date string in the form Day Month Year, where:

// Day is in the set {"1st", "2nd", "3rd", "4th", ..., "30th", "31st"}.
// Month is in the set {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}.
// Year is in the range [1900, 2100].
// Convert the date string to the format YYYY-MM-DD, where:

// YYYY denotes the 4 digit year.
// MM denotes the 2 digit month.
// DD denotes the 2 digit day.
 

// Example 1:

// Input: date = "20th Oct 2052"
// Output: "2052-10-20"
// Example 2:

// Input: date = "6th Jun 1933"
// Output: "1933-06-06"
// Example 3:

// Input: date = "26th May 1960"
// Output: "1960-05-26"


class Solution {
    public String reformatDate(String date) {
        String[] arr = new String[3];
        arr = date.split(" ");
        HashMap<String, String> map = new HashMap<>();
        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");

        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1; i>=0; i--){
            if(map.containsKey(arr[i])){
                sb.append(map.get(arr[i]));
                sb.append("-");
            }else if(i==0){
                if(arr[i].length() == 3){
                    sb.append("0");
                    sb.append(arr[i]);
                    sb.append("-");
                }else{
                    sb.append(arr[i]);
                    sb.append("-");
                }
            }else{
                sb.append(arr[i]);
                sb.append("-");
            }
        }
        sb.delete(sb.length()-3, sb.length());

        return sb.toString();
    }
}
