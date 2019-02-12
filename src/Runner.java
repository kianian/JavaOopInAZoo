public class Runner {

    public static void main(String[] args) {
        zoo z = new zoo();
        z.sleep("Tigger");
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
        Bee stinger = new Bee ("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");
        Animal[] animals = {tigger,pooh,rarity,stinger,gemma};
        Zookeeper zoebot = new Zookeeper("Kian");
        zoebot.feedAnimals(animals,"Shit");
    }
}
