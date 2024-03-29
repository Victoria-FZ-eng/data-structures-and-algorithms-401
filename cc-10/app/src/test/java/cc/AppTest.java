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
    @Test void testStackMethods() throws Exception {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        Stack s2 = new Stack();

        boolean thrown=false;

        // testing pushing one node to stack
        assertEquals("Stack = [10]",App.pushOneStack(10));

        // testing pushing multiple nodes to stack
        assertEquals("Stack = [10, 20, 30]",App.pushMultStack(10,20,30));

        // testing popping from non-empty stack
        assertEquals("3",App.popStack(s));

        // testing popping from empty stack
        try {
            App.popStack(s2);
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue(thrown);

        // testing isEmpty method
        assertTrue(App.stackIsEmpty(s));
        assertFalse(App.stackIsEmpty(s2));

        // testing peaking
        assertEquals("2",App.peakStack(s));

        // testing emptying stack by popping and then test peaking on empty stack
        assertEquals("2", App.popStack(s));
        assertEquals("1", App.popStack(s));
        boolean thrown2 = false;
        try {
            App.peakStack(s);
        } catch (Exception e) {
            thrown2 = true;
        }
        assertTrue(thrown2);

    }
    @Test void testQueuesMethods() throws Exception{
        Queue q = new Queue();

        q.enqueue("a");
        q.enqueue("b");
        q.enqueue("c");

        Queue q2 = new Queue();

        boolean thrown = false;

        // testing en-queuing one node to queue
        assertEquals("Queues: [one]",App.enqueueOneQue("one"));

        // testing adding multiple nodes to queue
        assertEquals("Queues: [one, two, three]",App.enqueueMultQue("one","two", "three"));

        // testing de-queuing from non-empty queue
        assertEquals("a",App.dequeueQue(q));

        // testing peaking from queue
        assertEquals("b",App.peakQue(q));

        // testing de-queuing from empty queue
        try {
            App.dequeueQue(q2);
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue(thrown);

        // testing if queue is empty
        assertTrue(App.isQueueEmpty(q));
        assertFalse(App.isQueueEmpty(q2));

        // testing peaking from queue
        assertEquals("b",App.peakQue(q));

        //testing peaking from empty queue
        boolean thrown2 = false;
        try {
            App.peakQue(q2);
        } catch (Exception e) {
            thrown2 = true;
        }
        assertTrue(thrown2);
    }
}
