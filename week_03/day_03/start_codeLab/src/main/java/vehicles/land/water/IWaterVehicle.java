package vehicles.land.water;

import vehicles.IVehicle;

public interface IWaterVehicle extends IVehicle {

    String getHullType();

    public void setHullType(String type) throws Exception;


}
