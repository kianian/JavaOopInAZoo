public class zoo {
    private String favoriteFood = "bacon";

    public zoo() {}

    public void sleep(String name){
        System.out.println(name + " sleeps for 8 hours");
    }
    public void eat(String name, String food){
        System.out.println(name + " eats " + food);
        if(food.equals(this.favoriteFood)){
            System.out.println("Yum!! " + name + " wants more food.");
        }else {
            this.sleep(name);
        }
    }

}
