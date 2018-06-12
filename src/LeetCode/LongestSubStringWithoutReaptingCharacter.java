package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutReaptingCharacter {
	public static void main(String args[]){
		String x = "abcabcdd";
		System.out.println(longestSubstring(x));
	}
	
	public static int longestSubstring(String str){
		Set<Character> set = new HashSet<Character>();
		int i = 0, j = 0, max = 0;
		while( i < str.length()){
			if(!set.contains( str.charAt(i))){
				set.add(str.charAt(i++));
				max = Math.max(max, set.size());
			} else {
				set.remove(str.charAt(j++));
			}
		}
		return max;
	}
	
}
