//The tree is known as symmetric if it is same it's mirror image.
//Here we have to check if tree is symmetric or not.

//Just take two pointer and keep checking left and right.

boolean isSymmetric(Node node) {
	return isMirror(root, root);
}
boolean isMirror(Node node1, Node node2) {
	if (node1 == null && node2 == null)
		return true;
	if (node1 != null && node2 != null && node1.key == node2.key)
		return (isMirror(node1.left, node2.right)
		        && isMirror(node1.right, node2.left));
	return false;
}


//Problem is available on geeksforgeeks
