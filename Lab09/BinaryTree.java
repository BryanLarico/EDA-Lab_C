public class BinaryTree {
	Node root;

	public BinaryTree() {
		root = null;
	}

	public void preOrder(Node node) {
		if (node == null)
			return;
		System.out.print(node.key + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public void inOrder(Node node) {
		if (node == null)
			return;
		inOrder(node.left);
		System.out.print(node.key + " ");
		inOrder(node.right);
	}

	public void postOrder(Node node) {
		if (node == null)
			return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.key + " ");
	}

	public void preOrder() {
		preOrder(root);
	}

	public void inOrder() {
		inOrder(root);
	}

	public void postOrder() {
		postOrder(root);
	}
	
	public int treeHeight(Node node) {
		if (node == null)
			return 0;
		else
			return Math.max(treeHeight(node.left), treeHeight(node.right)) + 1;
	}
	public boolean isBST() {
		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public boolean isBSTUtil(Node node, int min, int max) {
		if (node == null)
				return true;
			
		if (node.key < min || node.key > max)
			return false;
		
		return (isBSTUtil(node.left, min, node.key - 1) && 
						isBSTUtil(node.right, node.key + 1, max));
	}
	public int countNodes() {
    return countNodes(root);
   }

	int countNodes(Node node) {
		if (node == null)
			return 0;

		return 1 + countNodes(node.left) + countNodes(node.right);
	}
}