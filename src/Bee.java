public class Bee extends Animal{
    public Bee(String name) {
        super(name, "pollen");
    }
    public void eat(String food) {
        if(food.equals("pollen")){
            System.out.println("YUMM!!! " + getName() + " wants more " + food);
            sleep();
        }else {
            System.out.println("YUCCK!!!" + getName() + " will not " + food);
        }
    }
    public void sleep() {
        System.out.println(getName() + " never sleeps!!");
    }
}

