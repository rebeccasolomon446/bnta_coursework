import Products.Product;
import Products.vehicles.Bicycle;
import Products.IProduct;

public class VehicleShop {

    public static void main(String[] args) {
        System.out.println("Hello world");
        // Vehicle vehicle = new Vehicle();
        IProduct product = new Bicycle(new Product("amazing bike", 300, 5,40, 30))
    }
}
