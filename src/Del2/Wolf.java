package Del2;
import java.util.Random;

class Wolf extends Animal {
    private Random random = new Random();

    public Wolf(String name, int energy) {
        super(name, energy);
    }

    @Override
    public int attack() {
        return 5 + random.nextInt(8);
    }
}
