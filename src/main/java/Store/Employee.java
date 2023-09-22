package Store;

public abstract class Employee extends Customer implements Discountable {
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
}
