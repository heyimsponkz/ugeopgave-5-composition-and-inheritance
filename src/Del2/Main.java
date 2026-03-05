package Del2;
import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<Animal> animals = new ArrayList<>();

        // Create at least 4 animals of at least 3 types
        animals.add(new Lion("Simba", 80));
        animals.add(new Rabbit("Bugs", 140));
        animals.add(new Wolf("Fang", 95));
        animals.add(new Rabbit("Snowball", 125));
        animals.add(new Lion("Nala", 85));
        animals.add(new Wolf("Luna", 100));

        System.out.println("=== Animal Fighting Tournament ===\n");

        for (int i = 0; i < animals.size() - 1; i += 2) {
            Animal a1 = animals.get(i);
            Animal a2 = animals.get(i + 1);

            System.out.println("Match: " + a1.getName() + " vs " + a2.getName());
            System.out.println("Starting energies → " + a1 + "  vs  " + a2);
            System.out.println("----------------------------------------");

            Contest fight = new Contest(a1, a2);

            while (!fight.isFinished()) {
                fight.playRound();
            }

            Animal winner = fight.getWinner();
            if (winner != null) {
                System.out.println("WINNER: " + winner.getName() + " (" + winner.getClass().getSimpleName() + ") remains with " + winner.getEnergy() + " energy!");
            } else {
                System.out.println("DRAW – both animals are defeated!");
            }
            System.out.println();
        }

        if (animals.size() % 2 == 1) {
            Animal leftover = animals.get(animals.size() - 1);
            System.out.println("No opponent: " + leftover.getName() + " is still alive with " + leftover.getEnergy() + " energy.");
        }
    }
}
