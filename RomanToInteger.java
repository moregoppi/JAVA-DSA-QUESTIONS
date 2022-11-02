//In this code we have a String And we have given a value of characters and we have to find the total of the string
//Character Values are I=1, V=5, X=10, L=10, C=100, D=500, M=1000
//EXAMPLE INPUT:- "XV1" OUTPUT:- 16   OR INPUT:- "LVIII" OUTPUT:- 58 

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int n = s.length();

        int num = romanMap.get(s.charAt(n-1));
        for(int i = n - 2; i >= 0; i--){
            if(romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i + 1))){
                num += romanMap.get(s.charAt(i));
            }else{
                num -= romanMap.get(s.charAt(i));
            }
        }
        return num;

    }
}
