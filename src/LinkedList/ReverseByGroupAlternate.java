package LinkedList;

public class ReverseByGroupAlternate {
	public static Node reverseByGroupAlternate(Node n, int val) {
		 Node cur = n;
		 int count = 0;
		 while (cur != null && count != val){
			 cur = cur.next;
			 count++;
		 }
		 if(count == val){
			 cur = reverseByGroupAlternate(cur, val);
			 while(count-- > 0){
				 Node temp = n.next;
				 n.next = cur;
				 cur = n;
				 n = temp;
			 }
			 while (cur != null && count != val){
				 cur = cur.next;
				 count++;
			 }
			 n = cur;
		 }
		 return n;
	}
}
