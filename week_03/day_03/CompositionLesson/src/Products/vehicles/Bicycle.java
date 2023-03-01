package Products.vehicles;

import Products.IProduct;


public final class Bicycle extends Vehicle implements ILandVehicle{

    private int wheelCount;
    public Bicycle(IProduct baseProduct, float weight, int maxSpeed) {
        super(baseProduct, weight, maxSpeed);
        this.wheelCount = 2;

    }

    @Override
    public int getWheelCount(){
        return 0;
    }

    @Override
    public void setWheelCount(int count) {
        System.out.println("cannot change number of wheels on bike");

    }

}
