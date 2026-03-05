package Del1;

public class Main {
    public static void main(String[] args) {
        Building house = new Building("Smart Home");

        Room livingRoom = new Room("Living Room");
        livingRoom.addLamp(new Lamp(60));
        livingRoom.addLamp(new Lamp(75));
        livingRoom.addLamp(new Lamp(10));
        livingRoom.addWindow(new Window(90, 120));

        Room kitchen = new Room("Kitchen");
        kitchen.addLamp(new Lamp(40));
        kitchen.addLamp(new Lamp(40));
        kitchen.addWindow(new Window(90, 100));

        Room bedroom = new Room("Bedroom");
        bedroom.addLamp(new Lamp(25));
        bedroom.addLamp(new Lamp(25));
        bedroom.addWindow(new Window(140, 120));

        house.addRoom(livingRoom);
        house.addRoom(kitchen);
        house.addRoom(bedroom);

        house.printBuilding();

        System.out.println("• The total amount of lamps in the building is:  " + house.getTotalLampCount());
        System.out.println("• The total Wattage usage is: " + house.getTotalWatt() + " W");
    }
}