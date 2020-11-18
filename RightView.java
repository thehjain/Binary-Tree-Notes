//Here we have print right view of binary tree.
//This is similar to left view of binary tree

//Just pass the right side tree first instead of left tree.


static int maxLevel = 0;
//Initially level is 1

void rightView(Node root, int level) {
	if (root == null)
		return;
	if (maxLevel < level) {
		System.out.print(root.data + " ");
		maxLevel = level;
	}
	rightView(root.right, level + 1);
	rightView(root.left, level + 1);
}


//Problem is available on geeksforgeeks