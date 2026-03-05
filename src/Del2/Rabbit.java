package Del2;
import java.util.Random;

class Rabbit extends Animal {
    public Rabbit(String name, int startingEnergy) {
        super(name, startingEnergy);
    }

    @Override
    public int attack() {
        return 3 + new Random().nextInt(4);
    }
}
