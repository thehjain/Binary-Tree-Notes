//Here we have to find the diameter of binary tree.

//One approach is to calculate height of every subtree
//and find the diameter . this will time complexity
//O(n^2).

int diameter(Node root) {
	if (root == null)
		return 0;
	int lheight = height(root.left);
	int rheight = height(root.right);

	int ldiameter = diameter(root.left);
	int rdiameter = diameter(root.right);

	return Math.max(lheight + rheight + 1, Math.max(ldiameter, rdiameter));
}

//Efficient approach is to calculate height of subtrees in same
//method itslef. this will time complexity of O(N).

class Height {
	int h;
}

int diameter(Node node) {
	Height height = new Height();
	return diameterUtil(node, height);
}

int diameterUtil(Node node, Height height) {
	Height lh = new Height();
	Height rh = new Height();
	if (node == null) {
		height.h = 0;
		return 0;
	}
	int ldiameter = diameterUtil(node.left, lh);
	int rdiameter = diameterUtil(node.right, rh);

	height.h = Math.max(lh.h, rh.h) + 1;

	return Math.max(lh.h + rh.h + 1, Math.max(ldiameter, rdiameter));
}


//Problem is available on geeksforgeeks
