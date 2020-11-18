//Here we have given a binary tree and we have
//print the left of view of it.

//We do it using level of nodes whenever we find the new
//level we print the node because traversing left tree
//first and after that right tree.


static int maxLevel = 0;
//Initially level is 1

void leftView(Node root, int level) {
	if (root == null)
		return;
	if (maxLevel < level) {
		System.out.print(root.data + " ");
		maxLevel = level;
	}
	leftView(root.left, level + 1);
	leftView(root.right, level + 1);
}

//problem is avaibable on geeksforgeeks