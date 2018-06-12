package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
	
	public static void main(String args[]){
		String s ="IV";
		int result = romanToInt(s);
		System.out.println(result);
	}
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        char[] c = s.toCharArray();
        int result = 0, i = 0, j = 1;
        for( ; j < c.length ; i++, j++ ){
            if(map.get(c[i]) >= map.get(c[j])){
                result += map.get(c[i]);
            }else{
                result -= map.get(c[i]);
            }
        }
        result += map.get(c[i]);
        return result;
       }
}
