package cc;

public class Dog extends Animal{
    Dog() {
        super();
        type = "dog";
    }
    @Override
    public String toString() {
        return type;
    }
}
