/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    // testing "Happy Path" and testing when linkedList.size() = 1;
    @Test void testingMethodK() {
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(7);
        list.append(8);
        list.append(3);
        list.append(4);
        LinkedList list2 = new LinkedList();
        list2.append(1);

        assertEquals(7,App.kthFromE(list,3));
        assertEquals(1,App.kthFromE(list2,0));
    }
    // testing when k = LinkedList.size();
    @Test
    public void testThrowingException() {
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(7);
        list.append(8);
        boolean thrown = false;

        try {
            App.kthFromE(list,3);
        } catch (IndexOutOfBoundsException e) {
            thrown = true;
        }

        assertTrue(thrown);
    }
    // testing when k < 0;
    @Test
    public void testThrowingException2() {
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(7);
        list.append(8);
        boolean thrown = false;

        try {
            App.kthFromE(list,-4);
        } catch (IndexOutOfBoundsException e) {
            thrown = true;
        }

        assertTrue(thrown);
    } // testing when k > LinkedList.size();
    @Test
    public void testThrowingException3() {
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(7);
        list.append(8);
        boolean thrown = false;

        try {
            App.kthFromE(list,15);
        } catch (IndexOutOfBoundsException e) {
            thrown = true;
        }

        assertTrue(thrown);
    }

}
