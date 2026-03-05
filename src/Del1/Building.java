package Del1;

import java.util.ArrayList;
import java.util.List;

public class Building {
    public String name;
    private final List<Room> rooms;

    public Building(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public int getTotalLampCount() {
        int totalLampCount = 0;
        for (Room room : this.rooms) {
            totalLampCount += room.getLampCount();
        }
        return totalLampCount;
    }

    public int getTotalWatt() {
        int total = 0;
        for (Room room : rooms) {
            total += room.getTotalWatts();
        }
        return total;
    }

    public void printBuilding() {
        System.out.println("Building: " + name);
        System.out.println("======================");
        for (Room room : rooms) {
            room.printRoom();
        }
        System.out.println("Summary:");
        System.out.println("  Total lamps in building: " + getTotalLampCount());
        System.out.println("  Total power consumption: " + getTotalWatt() + " W");
        System.out.println();
    }


}
