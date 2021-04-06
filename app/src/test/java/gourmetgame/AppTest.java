/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gourmetgame;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test 
    public void testAppHasBinaryTree() {
        App myApp = new App();
        myApp.binaryTree = new BinaryTree();
        assertNotNull(myApp.binaryTree);
        
    }

    @Test 
    public void testAppHasNotBinaryTree() {
        App myApp = new App();
        myApp.binaryTree = null;
        assertNull(myApp.binaryTree);
    }
}
