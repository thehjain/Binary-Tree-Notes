//Here we have print the top view of binary tree
//from left to right.

//This is very much similar to bottom view
//here also we have to maintain horizontal distance of
//every node only difference is that here we already have
//some horizontal distance present in map we dont have
//to update it.

//Node*
//I am considering that in node class we have variable hd
//if dont make a new class MyPair.

void topView(Node root) {
	if (root == null) return;

	Map<Integer, Node> map = new TreeMap<>();
	Queue<Node> que = new LinkedList<>();
	que.push(root);
	int hd = 0;

	while (!que.isEmpty()) {
		Node curr = que.poll();
		hd = curr.hd;
		if (!map.containsKey(hd))
			map.put(hd, curr);
		if (curr.left != null)
			que.add(curr.left);
		if (curr.right != null)
			que.add(curr.right);
	}

	for (Map.Entry<Integer, Node> entry : map.entrySet()) {
		Node curr = entry.getValue();
		System.out.print(curr.data + " ");
	}
}


//Problem is present on geeksforgeeks