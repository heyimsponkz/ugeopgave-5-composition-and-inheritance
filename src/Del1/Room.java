package Del1;

import java.util.ArrayList;
import java.util.List;

public class Room {
    public String name;
    private final List<Lamp> lamps;
    private final List<Window> windows;

    public Room(String name)
    {
        this.name=name;
        this.lamps=new ArrayList<>();
        this.windows=new ArrayList<>();
    }

    public void addLamp(Lamp lamp)    {
        this.lamps.add(lamp);
    }

    public void addWindow(Window window)    {
        this.windows.add(window);
    }

    public int getLampCount(){
        return this.lamps.size();
    }

    public int getTotalWatts() {
        int totalWatts=0;
        for (Lamp lamp : this.lamps) {
            totalWatts += lamp.watt;
        }
        return totalWatts;
    }

    public int getTotalWindowArea() {
        int totalWindowArea=0;
        for (Window window : this.windows) {
            totalWindowArea += window.getAreaCm2();
        }
        return  totalWindowArea;
    }

    public void printRoom() {
        System.out.println("  Room: " + name);
        System.out.println("    Lamps (" + getLampCount() + "):");
        for (Lamp lamp : lamps) {
            System.out.println("      " + lamp);
        }
        System.out.println("    Windows (" + windows.size() + "):");
        for (Window window : windows) {
            System.out.println("      " + window);
        }
        System.out.println("    Total watt in room: " + getTotalWatts() + " W");
        System.out.println("    Total window area: " + getTotalWindowArea() + " cm²");
        System.out.println();
    }
}
