package PrimitiveTypes;

public class isPalindrome {
	public static void main(String args[]){
		int x = 157751;
		final int numOfDigits = (int)Math.floor(Math.log10(x)) + 1;
		System.out.println(numOfDigits);
		int msdMask = (int) Math.pow(10, numOfDigits -1 );
		
	}

}
