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
    @Test void mergSrortTesting(){
        int arr[] = { 12, 11, 13, 5, 6 };

        assertEquals("[5, 6, 11, 12, 13]",String.valueOf(App.sortArr(arr)));
    }
}