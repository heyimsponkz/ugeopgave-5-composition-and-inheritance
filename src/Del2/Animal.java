package Del2;

abstract class Animal {
    private String name;
    private int energy;

    public Animal(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void loseEnergy(int amount) {
        energy -= amount;
        if (energy < 0) {
            energy = 0;
        }
    }

    public boolean isActive() {
        return energy > 0;
    }

    public abstract int attack();

    @Override
    public String toString() {
        return String.format("%s \"%s\" (energy: %d)", getClass().getSimpleName(), name, energy);
    }
}