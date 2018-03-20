public class TreeClient
{
	public static void main(String[] args)
	{
		Tree tree = new Tree(1);

		tree.root.left       = new Node(2);
		tree.root.right      = new Node(3);
		tree.root.left.left  = new Node(4);
		tree.root.left.right = new Node(5);

		//tree.postOrder(tree.root);
		tree.preOrder(tree.root);
	}
}