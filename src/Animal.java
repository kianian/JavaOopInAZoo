public class Animal {
    private String name;
    private String favoriteFood;
    static int population;

    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        population++;
    }

    public void sleep() {
        System.out.println(this.name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        System.out.println(this.name + " eats " + food);
        if (food.equals(this.favoriteFood)) {
            System.out.println("Yum!! " + this.name + " wants more " + food);
        } else {
            this.sleep();
        }
    }


    public String getName() {
        return name;
    }

    public static int getPopulation() {
        return population;
    }
}