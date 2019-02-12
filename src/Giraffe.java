public class Giraffe extends Animal{
    public Giraffe(String name) {
            super(name, "leaves");
        }
    public void eat(String food) {
        if(food.equals("leaves")){
            System.out.println("YUMM!!! " + getName() + " wants more food");
            sleep();
        }else {
            System.out.println("YUCCK!!!" + getName() + " will not " + food);
        }
    }
}
