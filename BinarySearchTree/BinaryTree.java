public class BinaryTree
{
	public Node root;

	public BinaryTree(int data)
	{
		root = new Node(data);
	}

	public BinaryTree()
	{
		this.root = null;
	}

	public void preOrder(Node root)
	{
		if (root == null)
			return;

		System.out.print(root.data + "  ");

		preOrder(root.left);
		preOrder(root.right);
	}

	public void postOrder(Node root)
	{
		if (root == null)
			return;

		postOrder(root.left);
		postOrder(root.right);

		System.out.print(root.data + "  ");
	}

	public void inOrder(Node root)
	{
		if (root == null)
			return;

		inOrder(root.left);

		System.out.print(root.data + "  ");

		inOrder(root.right);
	}

	public boolean search(Node root, int data)
	{
		if (root.data == data)
			return true;

		if (data < root.data)
			return search(root.left, data);
		else if (data > root.data)
			return search(root.right, data);

		return false;
	}

	public Node insert(Node root, int data)
	{
		if (root == null)
		{
			root = new Node(data);
			return root;
		}

		if (data < root.data)
			root.left = insert(root.left, data);
		else if (data > root.data)
			root.right = insert(root.right, data);	

		return root;
	}
}