public class Zookeeper {
    private String name;

    public Zookeeper(String name) {
        this.name = name;
    }

    public void feedAnimals(Animal[] animals, String food) {
        System.out.println(getName() + " is feeding " + food + " to " + animals.length + " animals");
        for(int i=0;i< animals.length;i++){
            animals[i].eat(food);
            int extra = i+1;
            System.out.println(getName() + " is feeding " + food + " to " + extra + " of " + animals[i].getPopulation() + " total Animals");
        }
    }

    public String getName() {
        return name;
    }
}
