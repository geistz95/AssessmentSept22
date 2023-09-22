package Store;

public class Student extends Person implements Discountable {
    private long studentID;
    private  final double discount = .5;

    public Student (String name, Size bodySize, Clothing[] clothes, long studentID ){
        super(name, bodySize, clothes);
        this.studentID=studentID;
    }

    @Override
    public double calculateDiscountPrice(Clothing clothes, double discount) {
        return clothes.getPrice() - (clothes.getPrice()*discount);
    }
    public double getDiscount(){
        return discount;
    }
}
