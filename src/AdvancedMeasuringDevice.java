import java.util.ArrayList;

class AdvancedMeasuringDevice extends MeasuringDevice implements AdvancedDeviceFeatures {
    private int warrantyPeriod;

    public AdvancedMeasuringDevice(String deviceName, ArrayList<PurchasableItem> items, int warrantyPeriod) {
        super(deviceName, items);
        this.warrantyPeriod = warrantyPeriod;
    }

    public AdvancedMeasuringDevice(int warrantyPeriod) {
        super();
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    @Override
    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayDeviceInfo() {
        super.displayDeviceInfo();
        System.out.println("Warranty period: " + warrantyPeriod + " years");
    }
}