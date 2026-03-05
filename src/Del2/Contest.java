package Del2;

class Contest {
    private Animal animal1;
    private Animal animal2;
    private int round = 0;

    public Contest(Animal a1, Animal a2) {
        this.animal1 = a1;
        this.animal2 = a2;
    }

    public void playRound() {
        if (!animal1.isActive() || !animal2.isActive()) {
            return;
        }

        round++;
        System.out.println("--- Round " + round + " ---");

        int dmg1 = animal1.attack();
        animal2.loseEnergy(dmg1);
        System.out.printf("%s attacks %s for %d! (%s has %d energy left)%n",
                animal1.getName(), animal2.getName(), dmg1,
                animal2.getName(), animal2.getEnergy());

        if (animal2.isActive()) {
            int dmg2 = animal2.attack();
            animal1.loseEnergy(dmg2);
            System.out.printf("%s attacks %s for %d! (%s has %d energy left)%n",
                    animal2.getName(), animal1.getName(), dmg2,
                    animal1.getName(), animal1.getEnergy());
        }

        System.out.println();
    }

    public Animal getWinner() {
        if (animal1.isActive() && !animal2.isActive()) {
            return animal1;
        }
        if (!animal1.isActive() && animal2.isActive()) {
            return animal2;
        }
        if (!animal1.isActive() && !animal2.isActive()) {
            return null;
        }
        return null;
    }

    public boolean isFinished() {
        return !animal1.isActive() || !animal2.isActive();
    }
}
