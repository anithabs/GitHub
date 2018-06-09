package LinkedList;

public class Execute {
	
	public static void main(String args[]){
		Node head = new Node(6);
		head.next = new Node(3);
		head.next.next = new Node(5);
		head.next.next.next = new Node(1);
		head.next.next.next.next = new Node(7);
		head.next.next.next.next.next = new Node(9);
		
		Node one = new Node(2);
		one.next = new Node(3);
		one.next.next = new Node(5);
		
		Node two = new Node(1);
		two.next = new Node(4);
		two.next.next = new Node(6);
		PrintNode.printNode(head);
		Node rev = ReverseByGroup.reverseByGroup(head, 2);
		PrintNode.printNode(rev);
		rev = ReverseByGroupAlternate.reverseByGroupAlternate(head, 2);
		PrintNode.printNode(rev);
		//head.next.next.next.next.next = new Node(0);
		
		
		PrintNode.printNode(head);
		head = Reverse.reverse(head);
		head = AddOne.addOne(head);
		head = Reverse.reverse(head);
		PrintNode.printNode(head);	
		
		System.out.println("Middle value -- >" + MiddleOfLinkedList.midOfLinkedList(head));
		System.out.println("Middle value prev odd -- >" + MiddleOfLinkedList.midOfLinkedListprev(head));
		
		Node MergeResult = MergeSortedList.merge(one, two);
		System.out.println("Merged result -- >" );
		PrintNode.printNode(MergeResult);
		System.out.println("Remove last 4rd value -- >" );
		RemoveNthNodeFromEnd.removeNthNodeFromEnd(MergeResult, 4);
		
		PrintNode.printNode(MergeResult);
		
		Node head1 = new Node(6);
		head1.next = new Node(3);
		head1.next.next = new Node(2);
		head1.next.next.next = new Node(-5);
		head1.next.next.next.next = new Node(7);
		head1.next.next.next.next.next = new Node(12);
		
		head1.next.next.next.next.next = head1.next.next;
		System.out.print("Loop Exist ? -- >" );
		System.out.println(LoopDetection.loopdetection(head1));
		System.out.println(RemoveLoop.findLoop(head1));
		PrintNode.printNode(head1);
		
		System.out.print("Cancel out please ? -- >" );
		head1 = CanceledOut.canceledOut(head1);
		PrintNode.printNode(head1);
		
		Node head2 = new Node(6);
		head2.next = new Node(3);
		head2.next.next = new Node(2);
		head2.next.next.next = new Node(2);
		head2.next.next.next.next = new Node(3);
		head2.next.next.next.next.next = new Node(6);
		PrintNode.printNode(head2);
		System.out.println(" Is head2 Palindrome ?" + Palindrome.palindrome(head2));
		System.out.println(" Is head1 Palindrome ?" + Palindrome.palindrome(head1));
		
		
	}

}
