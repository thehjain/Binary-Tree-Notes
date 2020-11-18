//Here we have to check if tree is height balanced or not.

//First approach is to check every left and right subtree
//by finding its height.This will time complexity of O(N^2).


boolean isBalanced(Node root) {
	int lh, rh;
	if (root == null)
		return true;
	lh = height(root.left);
	rh = height(root.right);

	if (Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right))
		return true;
	return false;
}


//Efficient solution is to calculate height in same method and
//this will give time complexity of O(N).

class Height {
	int h;
}
boolean isBalanced(Node root, Height height) {
	if (root == null) {
		height.h = 0;
		return true;
	}
	Height lheight = new Height(), rheight = new Height();
	boolean l = isBalanced(root.left, lheight);
	boolean r = isBalanced(root.right, rheight);

	height.h = (lh > rh ? lh : rh) + 1;

	if (Math.abs(lh - rh) >= 2)
		return false;
	else
		return l && r;
}


//Problem is available on geeksforgeeks