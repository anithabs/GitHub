package PrimitiveTypes;

public class CheckPermutation {
	public static void main(String args[]){
		boolean check = checkPermutation("asdfghjkla", "lkjhgfdsa");
		System.out.println(check);
	}
	public static boolean checkPermutation(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		int[] letters = new int[128];
		char[] c = str1.toCharArray();
		for(char ch : c){
			letters[ch]++;
		}
		c = str2.toCharArray();
		for(char ch : c){
			letters[ch]--;
			if(letters[ch] < 0){
				return false;
			}
		}
		return true;
	}
}
