package PrimitiveTypes;

import java.util.HashSet;

public class IsUnique {

	public static void main(String args[]){
		String s = "anvmldiopa";
		boolean check = isUnique(s);
		System.out.println(check);
	}
	
	public static boolean isUnique(String str){
		HashSet<Character> hash = new HashSet<Character>();
		for(int i = 0 ; i < str.length() ; i++){
			if(hash.contains(str.charAt(i))){
				return false;
			}
			hash.add(str.charAt(i));
		}
		return true;
	}
	
}
