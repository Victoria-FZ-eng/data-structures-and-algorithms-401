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
    @Test void testSort(){
        int arr[] = { 12, 11, 13, 5, 6 };
        int n = arr.length;

        assertEquals("[5, 6, 11, 12, 13]",String.valueOf(App.quickSortMain(arr,0,n-1)));
    }
}
