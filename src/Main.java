import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<PurchasableItem> itemsList = new ArrayList<>();
        itemsList.add(new PurchasableItem("Resistor", 5, "Resistor Supplier"));
        itemsList.add(new PurchasableItem("Capacitor", 3, "Capacitor Supplier"));

        DeviceManagement device1 = new MeasuringDevice("Multimeter", itemsList);

        System.out.println("===================\nBasic Device Info:");
        device1.displayDeviceInfo();

        device1.setMaterial("Gold");
        device1.setManufacturer("New Manufacturer");
        System.out.println("\nUpdated material: " + device1.getMaterial());
        System.out.println("Updated manufacturer: " + device1.getManufacturer());

        AdvancedDeviceFeatures advancedDevice = new AdvancedMeasuringDevice("Pro", itemsList, 3);
        System.out.println("\nAdvanced Device Info:");
        advancedDevice.displayDeviceInfo();

        PurchasableItem newItem = new PurchasableItem("TestItem", 1, "Test Supplier");
        PurchasableItem newItem2 = new PurchasableItem("TestItem2", 2, "Test Supplier2");

        advancedDevice.addNewItem(newItem);
        advancedDevice.addNewItem(newItem2);
        advancedDevice.removeItem(newItem);

        System.out.println("\nWarranty Period: " + advancedDevice.getWarrantyPeriod());
        advancedDevice.setWarrantyPeriod(5);
        System.out.println("Updated Warranty Period: " + advancedDevice.getWarrantyPeriod());

        System.out.println("\n===================\nBasic Device Info:");
        device1.displayDeviceInfo();
    }
}