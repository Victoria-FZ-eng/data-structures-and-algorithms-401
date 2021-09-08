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
    @Test void testLeftJoins(){

        Map map1 = new Map();
        map1.add("fond","enamored");
        map1.add("wrath","anger");
        map1.add("diligent","employed");
        map1.add("outfit","grab");
        map1.add("guid","usher");

        Map map2 = new Map();
        map2.add("fond","averse");
        map2.add("wrath","delight");
        map2.add("diligent","idle");
        map2.add("guid","follow");
        map2.add("flow","jam");

        assertEquals("[[diligent, employed, idle], [fond, enamored, averse], [guid, usher, follow], [outfit, grab, null], [diligent, employed, idle]]",
             String.valueOf(App.leftJoins(map1,map2))   );
    }
}
