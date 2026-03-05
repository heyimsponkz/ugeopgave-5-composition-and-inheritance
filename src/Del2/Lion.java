package Del2;

class Lion extends Animal {
    private static final int LION_DAMAGE = 14;

    public Lion(String name, int energy) {
        super(name, energy);
    }

    @Override
    public int attack() {
        return LION_DAMAGE;
    }
}
