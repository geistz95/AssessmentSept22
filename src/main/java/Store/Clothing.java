package Store;

public class Clothing {
    private String description;
    private double price;
    private Size size;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Clothing(String description, double price, Size size){
        this.description=description;
        this.price=price;
        this.size=size;
    }
    @Override
    public String toString(){
        return "This is " + description + " the price is "+ price+ " the size is "+ size;
    }
}
