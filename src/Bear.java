public class Bear extends Animal {
    // complete the Bear class here, using the completed Tiger class as an example
    public Bear(String name) {
        super(name, "fish");
    }
    public void sleep() {
        System.out.println(getName() + " hibernates for 4 months");
    }
}
