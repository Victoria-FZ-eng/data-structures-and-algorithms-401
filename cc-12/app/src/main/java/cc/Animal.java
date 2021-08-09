package cc;

// import java.util.Date;

public class Animal {
    String type;
    // Date dateArrived;   // this is for the stretch goals

    public Animal(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

    public Animal() {

    }
}
