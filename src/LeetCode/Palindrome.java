package LeetCode;

public class Palindrome {
	
	public static void main(String args[]){
		int x = 0;
	
		System.out.println(isPalindrome(x));
	}
	public static boolean isPalindrome(int x) {
	    if(x < 0 || (x!= 0 && x%10 ==0 )) return false;
	    int rev = 0;
	    while(rev < x){
	    	rev = rev * 10 + x%10;
	    	x = x/10;
	    }
	    return (x == rev || x == rev/10);
	}
}
