package gourmetgame;

import com.google.common.base.Objects;

public class Node {

    private String value;
    private Node rightSon;
    private Node leftSon;

    public Node(String data) {
        value = data;
    }

    public boolean isLeaf() {
        return leftSon == null && rightSon == null;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getNode() {
        return value;
    }

    public void setLeftSon(Node leftSon) {
        this.leftSon = leftSon;
    }

    public Node getLeftSon() {
        return leftSon;
    }

    public void setRightSon(Node rightSon) {
        this.rightSon = rightSon;
    }

    public Node getRightSon() {
        return rightSon;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Node a = (Node) obj;
        Node b = (Node) obj;
        return (Objects.equal(a, b));
    }

}

