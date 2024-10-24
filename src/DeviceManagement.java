interface DeviceManagement {
    int MAX_ITEMS = 100;
    String DEFAULT_MATERIAL = "Metal";
    String DEFAULT_MANUFACTURER = "Global Devices Ltd.";

    void displayDeviceInfo();
    void addNewItem(PurchasableItem item);
    void removeItem(PurchasableItem item);

    String getMaterial();
    void setMaterial(String material);
    String getManufacturer();
    void setManufacturer(String manufacturer);
}