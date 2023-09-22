package Store;

public abstract class Customer extends Person {
    public Customer(String name, Size bodySize, Clothing[] clothes) {
        super(name, bodySize, clothes);
    }
    public void printCustomerName(Customer x){
        System.out.println("The customer name is : " + x.getName());
    }

}
