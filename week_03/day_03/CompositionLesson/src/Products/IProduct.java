package Products;

public interface IProduct {

    Float getPrice();
    Long getInventory();
    void setPrice(float price);
    void setInventory(long amount);
    void setTitle(String title);
    public String getTitle();
    void addInventory(long amount);
    void removeInventory(long amount) throws Exception;

}
