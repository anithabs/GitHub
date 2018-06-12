package BinaryTree;

public class LCABTParentPointer {
	public static void main(String Args[]){
	   TreeNodeParent root = new TreeNodeParent(1);
	   root.left = new TreeNodeParent(5);
       root.right = new TreeNodeParent(2);
       root.left.parent = root.right.parent = root;
       root.right.right = new TreeNodeParent(3);
       root.right.left = new TreeNodeParent(4);
       root.right.right.parent= root.right.left.parent = root.right;
       root.left.left = new TreeNodeParent(3);
       root.left.left.parent = root.left;
       TreeNodeParent result = findLCABTParentPointer(root.left, root.right.right);
       System.out.println(result.data);
	      
	}
	
	public static  TreeNodeParent findLCABTParentPointer( TreeNodeParent n1, TreeNodeParent n2 ){
		int d1 = getDepth(n1);
		int d2 = getDepth(n2);
		
		System.out.println( d1 + " --- " + d2);
		if( d1 > d2){
			TreeNodeParent temp = n1;
			n1 = n2;
			n2 = temp;
		}
		int diff  = Math.abs(d1 - d2);
		while( diff -- > 0){
			n2 = n2.parent;
		}
		while( n1 != n2){
			n2 = n2.parent;
			n1 = n1.parent;
		}
		return n1;
	}
	
	public static int getDepth( TreeNodeParent n){
		int depth = 0;
		while( n.parent != null){
			n = n.parent;
			depth++;
		}
		return depth;
	}
}
