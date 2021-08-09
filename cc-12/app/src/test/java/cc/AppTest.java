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
    @Test void addingAndRemovingMethod() throws Exception {
        AnimalShelter s = new AnimalShelter();
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal bird = new Animal();
        Animal dog2 = new Dog();

        // testing adding a cat
        assertEquals("Animals: [cat][]",App.adding(s,cat));
        // adding a dog
        assertEquals("Animals: [cat][dog]",App.adding(s,dog));
        //adding a bird
        assertEquals("Animals: [cat][dog]",App.adding(s,bird));
        App.adding(s,dog2);
        // giving away a dog
        assertEquals("dog",App.givingAway(s,"dog"));
        // giving away a bird
        assertEquals("null",String.valueOf(App.givingAway(s,"bird")));
        // giving away dog while there's no dogs at the shelter
        boolean thrown = false;
        App.givingAway(s,"cat");
        try{
            App.givingAway(s,"cat");
        }
        catch (Exception e){
            thrown=true;
        }
        assertTrue(thrown);
    }
}
