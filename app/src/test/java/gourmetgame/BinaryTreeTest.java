package gourmetgame;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryTreeTest {
    
    @Test 
    public void testNodeIsEmpty() {
        BinaryTree rootBinaryTree = new BinaryTree();
        assertEquals(true, rootBinaryTree.hasNodeEmpty());
        
        BinaryTree otherRootBinaryTree = new BinaryTree();
        otherRootBinaryTree.insertInto(null, "Massa", true);
        assertEquals(false, otherRootBinaryTree.hasNodeEmpty());
    }

    @Test
    public void testInsertNewNode() {
        BinaryTree rootBinaryTree = new BinaryTree();
        Node expected = rootBinaryTree.insertNewNode(null, "Massa", true);
        Node actual = rootBinaryTree.insertNewNode(null, "Massa", true);

        assertEquals(expected, actual);
    }
}
