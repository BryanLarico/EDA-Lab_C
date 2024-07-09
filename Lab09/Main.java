public class Main {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		BinaryTree bst = new BinaryTree();
		bst.root = new Node(4);
		bst.root.left = new Node(2);
		bst.root.right = new Node(5);
		bst.root.left.left = new Node(1);
		bst.root.left.right = new Node(3);
		System.out.println("Primer arbol es BTS: " + tree.isBST());
		System.out.println("Segundo arbol es BTS: " + bst.isBST());
	}
}

/*  tree:
				  1
				/   \
			 2			3
		 /   \
	  4     5
		
		bts:
					4
				/   \
			 2			5
		 /   \
	  1     3
*/