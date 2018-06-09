package LinkedList;

public class Palindrome {
	public static boolean palindrome(Node n){
		Node fast = n , slow = n;
		while(fast != null && fast.next != null ){
			fast = fast.next.next;
			slow = slow.next;
		}
		if(fast != null){
			slow = slow.next;
		}
		slow = Reverse.reverse(slow);
		fast = n;
		while(slow != null){
			if(slow.data != fast.data){
				return false;
			}
			slow = slow.next;
			fast = fast.next;
		}
		return true;
	}
}
