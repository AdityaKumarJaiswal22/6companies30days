class Tree 
{
    //Function to serialize a tree and return a list containing nodes of tree.
	public void serialize(Node root, ArrayList<Integer> A) 
	{
	    if(root == null){
	        A.add(-1);
	        return;
	    }
	    A.add(root.data);
	    serialize(root.left, A);
	    serialize(root.right, A);
	    return;
	}
	
	//Function to deserialize a list and construct the tree.
	int index = 0;
    public Node deSerialize(ArrayList<Integer> A)
    {
        if((A.size()-1)< index || A.get(index) == -1){
            index++;
            return null;
        }
        Node root = new Node(A.get(index++));
        root.left = deSerialize(A);
        root.right = deSerialize(A);
        return root;
    }
};
