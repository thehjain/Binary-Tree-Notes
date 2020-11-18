//We have to just find the height of binary tree.
//simply traverse for both left and right subtree.


int height(Node root) {
	if (root == null)
		return 0;
	int left = height(root.left) + 1;
	int right = height(root.right) + 1;
	return Math.max(left, right);
}

//Problem is available on geeksforgeeks and leetcode