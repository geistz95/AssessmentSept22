package Store;

public class Manager extends Employee implements Discountable{
    private final double discount=.15;

    public Manager(String name, Size bodySize, Clothing[] clothes) {
        super(name, bodySize, clothes);
    }

}
