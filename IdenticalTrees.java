//Here we have given two trees and we have to check
//if trees are identical or not.

//just traverse in both left side and right side

boolean isIdentical(Node root1, Node root2) {
	if (root1 == null && root2 == null)
		return true;
	if (root1 != null && root2 != null)
		if (root1.data == root2.data)
			return (isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right));
	return false;
}


//Problem is available on geeksforgeeks