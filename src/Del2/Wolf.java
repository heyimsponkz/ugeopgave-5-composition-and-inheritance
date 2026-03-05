package Del2;
import java.util.Random;

class Wolf extends Animal {
    private Random random = new Random();

    public Wolf(String name, int energy) {
        super(name, energy);
    }

    @Override
    public int attack() {
        // Wolves do random damage between 5 and 12
        return 5 + random.nextInt(8);
    }
}