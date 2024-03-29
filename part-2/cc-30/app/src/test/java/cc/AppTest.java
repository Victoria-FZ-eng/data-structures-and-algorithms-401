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
    @Test void testHashTable(){
        Map<String, Integer> map = new Map<>();

        // test adding method
        assertTrue(App.addKeyValue("hello",100));

        // test get value of key
        map.add("One",1);
        map.add("Two",2);
        assertEquals(2,App.getValueOfKey("Two",map));

        // return null for key that does not exist
        assertEquals(null,App.getValueOfKey("Hundred",map));

        // handling collision , and retrieving the value a value from a bucket that has collision
        map.add("Two",20);
        assertEquals(20,App.getValueOfKey("Two",map));

        // get index (hash) a key
        map.hash("One");
        boolean x = 0 <= App.hashKey("One",map) && App.hashKey("One",map) <= 20;
        assertTrue(x);

    }
}
