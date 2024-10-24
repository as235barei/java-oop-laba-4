import java.util.ArrayList;
import java.util.Scanner;

class MeasuringDevice implements DeviceManagement {
    protected String deviceName;
    protected ArrayList<PurchasableItem> items;
    protected String material;
    protected String manufacturer;

    public MeasuringDevice(String deviceName, ArrayList<PurchasableItem> items) {
        this.deviceName = deviceName;
        this.items = items;
        this.material = DEFAULT_MATERIAL;
        this.manufacturer = DEFAULT_MANUFACTURER;
    }

    public MeasuringDevice() {
        Scanner scanner = new Scanner(System.in);
        this.material = DEFAULT_MATERIAL;
        this.manufacturer = DEFAULT_MANUFACTURER;

        System.out.print("Enter device name: ");
        this.deviceName = scanner.nextLine();

        this.items = new ArrayList<>();
        System.out.println("How many purchased products do you need?");

        System.out.print("Enter the number of products: ");
        int itemCount = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        for (int i = 0; i < itemCount && items.size() < MAX_ITEMS; i++) {
            System.out.print("Enter product name: ");
            String name = scanner.nextLine();

            System.out.print("Enter product quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            System.out.print("Enter product supplier: ");
            String supplier = scanner.nextLine();

            items.add(new PurchasableItem(name, quantity, supplier));
        }
    }

    @Override
    public void displayDeviceInfo() {
        System.out.println("Device: " + deviceName);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Material: " + material);

        System.out.println("Purchasable items:");
        for (PurchasableItem item : items) {
            System.out.println(item);
        }
    }

    @Override
    public void addNewItem(PurchasableItem item) {
        if (items.size() < MAX_ITEMS) {
            items.add(item);
            System.out.println("\nItem added: " + item);
        } else {
            System.out.println("Cannot add more items. Maximum limit reached.");
        }
    }

    @Override
    public void removeItem(PurchasableItem item) {
        if (items.contains(item)) {
            items.remove(item);
            System.out.printf("Item «%s» removed successfully.", item);
        } else {
            System.out.println("Item not found in the device.");
        }
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}