package Interview;

import java.util.HashSet;

public class Interview {
	// S = 
	// W = Hi is and at
	
	// Result = my name anitha I am giving interview RJT
	
	public static void main(String args[]){
		String s = "Hi my name is anitha Hi I am giving interview at RJT Hi";
		String w = "Hi is and at";
		//Strins s, w;
		//System.console().readLine(args[0], args[1]);
		String Result = function(s , w);
		System.out.println(Result);
	}
	public static String function( String s, String w){
		   String[]  str1 = s.split(" ");
		   String[]  str2 = w.split(" ");
		   
		   HashSet<String> set = new HashSet<String>();
		   for( int i = 0; i < str2.length ; i++){
		       set.add(str2[i]);
		   }
		   StringBuilder str = new StringBuilder();
		   for ( int  i = 0; i < str1.length ; i++){
			  if(set.contains(str1[i])){  
				  set.remove(str1[i]);
			  }else{
				  str.append(str1[i]+ " ");
			  }
			 
		   }
		   return str.toString();
		   
		}
}
