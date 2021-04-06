package gourmetgame;

import org.junit.Test;
import static org.junit.Assert.*;

public class NodeTest {
    
    @Test 
    public void testNodeHasLeaf() {
        Node node = new Node("Strongonoff");
        assertEquals(true, node.isLeaf());
    }

    @Test 
    public void testNodeHasNoLeaf() {
        Node node = new Node("Bolo de chocolate");
        node.setRightSon(new Node("Doce de leite"));
        node.setLeftSon(new Node("Abóbora"));
        assertNotEquals(false, !node.isLeaf());
    
    }
}