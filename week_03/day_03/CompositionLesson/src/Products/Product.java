package Products;
// Used the IProduct interface to create a concrete implementation of IProduct, which can be used to create Product components.
// We want to use Product objects as components, and not extend it, so class set as final
public final class Product implements IProduct {

    private String title;
    private float price;
    private long inventory;

    public Product(String title, float price, long inventory) {
        this.title = title;
        this.inventory = inventory;
        this.price = price;

    }

    @Override
    public Float getPrice() {
        return this.price;
    }

    @Override
    public Long getInventory() {
        return this.inventory;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;

    }

    @Override
    public void setInventory(long amount) {
        this.inventory = amount;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;

    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void addInventory(long amount) {
        this.inventory += amount;
    }

    @Override
    public void removeInventory(long amount) throws Exception {
        //
        try {
            if(this.inventory - amount < 0) throw new Exception("Can't remove more inventory than is available");
            else {
                this.inventory -= amount;
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
