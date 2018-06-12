package LeetCode;

public class ReverseString {
	
	public static void main(String args[]){
		String s ="IV";
		String[]  strs ={ "flower", "flower", "flip"};
		String result = reverseString(s);
		System.out.println(longestCommonPrefix(strs));
		System.out.println(result);
	}
	   public static String reverseString(String s) {
	        char[] c = s.toCharArray();
	        char[] rev = new char[c.length];
	        
	        for(int i = c.length -1 , j = 0 ; i >=0 ; i--, j++){
	            rev[j] = c[i];
	        }
	        return new String(rev);
	        
	    }
	   
	   
	   public static String longestCommonPrefix(String[] strs) {
		    if(strs == null || strs.length == 0)    return "";
		    String pre = strs[0];
		    int i = 1;
		    while(i < strs.length){
		    	System.out.println(strs[i].indexOf(pre));
		        while(strs[i].indexOf(pre) != 0){
		        	System.out.println(strs[i].indexOf(pre));
		        	System.out.println(pre);
		            pre = pre.substring(0,pre.length()-1);
		            System.out.println(pre);
		        }
		        i++;
		    }
		    return pre;
		}


}
