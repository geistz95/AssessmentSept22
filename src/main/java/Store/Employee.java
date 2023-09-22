package Store;

public abstract class Employee extends Customer {
    private final double discount = .1;
    public Employee(String name, Size bodySize, Clothing[] clothes) {
        super(name, bodySize, clothes);
    }

    @Override
    public double calculateDiscountPrice(Clothing clothes, double discount) {
        return clothes.getPrice() - (clothes.getPrice()*discount);
    }
    public void printEmployeePriceAfterDiscount(Clothing clothes){
        System.out.println("After Employee Discount : " + calculateDiscountPrice(clothes, discount));
    }
    public double getDiscount(){
        return discount;
    }
}
