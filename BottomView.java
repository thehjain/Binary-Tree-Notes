//Here we have to print the bottom view of binary tree
//from left to right.

//Here horizontal distance of nodes matters. And as we go
//to left and right of tree we keep updating the horizontal
//distance of nodes for left -1 and for right +1.

//We will use map here to pair nodes with horizontal distance
//if we encounter the same horizontal distanc we update the map

//And to print the nodes in sorted order means from left to right
//we use treeMap.

void bottomView(Node root) {
	if (root == null)
		return;
	int hd = 0;
	Map<Integer, Integer> map = new TreeMap<>();

	//Queue to store nodes in level order traversal
	Queue<Node> que = new LinkedList<>();

	root.hd = hd;
	que.add(root);

	while (!que.isEmpty()) {
		Node curr = que.remove();
		hd = curr.hd;
		map.put(hd, curr.data);
		if (curr.left != null) {
			curr.left.hd = hd - 1;
			que.add(curr.left);
		}
		if (curr.right != null) {
			curr.right.hd = hd + 1;
			que.add(curr.right);
		}
	}

	for (Map.Entry<Integer, Integer> : map.entrySet()) {
		System.out.print(entry.getValue() + " ");
	}
}


//Problem is available on geeksforgeeks