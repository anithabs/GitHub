package LinkedList;

public class Flatten {

	public static void main(String args[]){
		NodeRD root = new NodeRD(1);
		root.down = new NodeRD(5);
		root.down.down = new NodeRD(7);
		
		root.right = new NodeRD(3);
		root.right.down = new NodeRD(5);
		root.right.down.down = new NodeRD(8);
		
		root.right.right = new NodeRD( 6);
		root.right.right.down = new NodeRD(10);
		root.right.right.down.down  = new NodeRD(12);
		
		root = flatten(root);
		printNodeRD(root);
	}
	
	public static NodeRD flatten(NodeRD node){
		if(node == null || node.right == null ) return node;
		node.right = flatten( node.right);
		node = MergeSortedList.merge(node, node.right);
		return node;
	}

	private static void printNodeRD(NodeRD n) {
		while( n != null && n.down != null ){
			System.out.print( n.data + "->" );
			n = n.down;
		}
		if( n != null ){
			System.out.println( n.data );
		}
	}
}
