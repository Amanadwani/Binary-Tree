public class Tree
{
	public Node root;

	public Tree()
	{
		this.root = null;
	}

	public Tree(int data)
	{
		root = new Node(data);
	}

	public void postOrder(Node root)
	{
		if (root == null)
			return;

		postOrder(root.left);
		postOrder(root.right);

		System.out.println(root.data + "  ");
	}	

	public void preOrder(Node root)
	{
		if (root == null)
			return;

		System.out.print(root.data + "\t");

		preOrder(root.left);
		preOrder(root.right);
	}
}