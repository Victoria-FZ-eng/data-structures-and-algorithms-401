package cc;

public class Cat extends Animal{
    Cat() {
        super();
        type = "cat";
    }
    @Override
    public String toString() {
        return type;
    }

}
