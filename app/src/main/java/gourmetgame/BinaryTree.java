package gourmetgame;

public class BinaryTree {
    public Node root;

    public boolean hasNodeEmpty() {
        return root == null;
    }

    public void insertInto(Node currentNode, String value, boolean option) {
        root = insertNewNode(currentNode, value, option);
    }

    public Node insertNewNode(Node currentNode, String value, boolean option) {
        if (currentNode == null) {
            currentNode = new Node(value);
            return currentNode;
        } else if (option) {
            currentNode.setRightSon(insertNewNode(currentNode.getRightSon(), value, option));
        } else {
            currentNode.setLeftSon(insertNewNode(currentNode.getLeftSon(), value, option));
        }
        return currentNode;
    }

}
