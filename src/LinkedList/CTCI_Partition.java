package LinkedList;

public class CTCI_Partition {
	public static void main(String args[]){
		Node node = new Node(1);
		node.next = new Node(9);
		node.next.next = new Node(8);
		node.next.next.next = new Node(5);
		node.next.next.next.next = new Node(3);
		node.next.next.next.next.next = new Node(7);
		node.next.next.next.next.next.next = new Node(4);
		node = partition(node, 5);
		PrintNode.printNode(node);
	}
	public static Node partition(Node node, int x){
		Node beforeStart = null;
		Node afterStart = null;
		Node beforeEnd = null;
		Node afterEnd = null;
		while(node != null){
			Node next = node.next;
			node.next = null;
			if(node.data < x){
				if(beforeStart == null){
					beforeStart = node;
					beforeEnd = beforeStart;
				}else{
					beforeEnd.next = node;
					beforeEnd = node;
				}
			}else{
				if(afterStart == null){
					afterStart = node;
					afterEnd = afterStart;
				}else{
					afterEnd.next = node;
					afterEnd = node;
				}
			}
			node = next;
		}
		if(beforeStart == null){
			return afterStart;
		}
		beforeEnd.next = afterStart;
		return beforeStart;
	}
}
