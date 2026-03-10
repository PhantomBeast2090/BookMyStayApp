public class UseCase3InventorySetup {
public static void main(String[] args) {
RoomInventory inventory=new RoomInventory();

System.out.println("Hotel Room Inventory");
System.out.println();

System.out.println("Single Room:");
inventory.displayRoomDetails("Single Room");
System.out.println("Available: "+inventory.getAvailability("Single Room"));
System.out.println();

System.out.println("Double Room:");
inventory.displayRoomDetails("Double Room");
System.out.println("Available: "+inventory.getAvailability("Double Room"));
System.out.println();

System.out.println("Suite Room:");
inventory.displayRoomDetails("Suite Room");
System.out.println("Available: "+inventory.getAvailability("Suite Room"));
}
}
