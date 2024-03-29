/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cc;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test void testTrips(){
        Graph g = new Graph();
        g.addEdgeWithWeight("Pandora", "Arendelle", true, 150);
        g.addEdgeWithWeight("Pandora", "Metroville", true,82);
        g.addEdgeWithWeight("Arendelle", "Metroville", true,99);
        g.addEdgeWithWeight("Arendelle", "New Monstropolis", true,42);
        g.addEdgeWithWeight("Metroville", "New Monstropolis", true,105);
        g.addEdgeWithWeight("Naboo", "New Monstropolis", true,73);
        g.addEdgeWithWeight("Metroville", "Naboo", true,26);
        g.addEdgeWithWeight("Narina", "Naboo", true,250);
        g.addEdgeWithWeight("Narina", "Metroville", true,37);

        ArrayList arr1 = new ArrayList();
        arr1.add("Metroville");
        arr1.add("Pandora");
        System.out.println(g.getTripPrice(arr1));

        ArrayList arr2 = new ArrayList();
        arr2.add("Arendelle");
        arr2.add("New Monstropolis");
        arr2.add("Naboo");
        System.out.println(g.getTripPrice(arr2));

        ArrayList arr3 = new ArrayList();
        arr3.add("Naboo");
        arr3.add("Pandora");
        System.out.println(g.getTripPrice(arr3));

        ArrayList arr4 = new ArrayList();
        arr4.add("Narina");
        arr4.add("Arendelle");
        arr4.add("Naboo");
        System.out.println(g.getTripPrice(arr4));

        assertEquals("True, $82",App. checkAvailabilityAndPrice(g,arr1));
        assertEquals("True, $115",App. checkAvailabilityAndPrice(g,arr2));
        assertEquals("False, $0",App. checkAvailabilityAndPrice(g,arr3));
        assertEquals("False, $0",App. checkAvailabilityAndPrice(g,arr4));
    }
}
