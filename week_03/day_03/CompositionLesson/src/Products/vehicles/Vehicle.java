package Products.vehicles;

import Products.IProduct;

public abstract class Vehicle implements IVehicle{

    private IProduct baseProduct;
    private float weight;
    private int maxSpeed;

    public Vehicle(IProduct baseProduct, float weight) {
        this.baseProduct = baseProduct;
        this.weight = weight;
        this.maxSpeed = maxSpeed;


    }


    @Override
    public Float getPrice() {
        return baseProduct.getPrice();
    }

    @Override
    public Long getInventory() {
        return baseProduct.getInventory();
    }

    @Override
    public void setPrice(float price) {
        baseProduct.setPrice(price);

    }

    @Override
    public void setInventory(long amount) {
        baseProduct.setInventory(amount);
    }

    @Override
    public void setTitle(String title) {
        baseProduct.setTitle(title);
    }

    @Override
    public String getTitle() {
        return this.baseProduct.getTitle();
    }

    @Override
    public void addInventory(long amount) {
        baseProduct.addInventory(amount);
    }

    @Override
    public void removeInventory(long amount) throws Exception {
        baseProduct.removeInventory(amount);
    }

    @Override
    public float getWeight() {
        return 0;
    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public void setWeight(float weight) {

    }

    @Override
    public void setMaxSpeed(int speed) {

    }
}
