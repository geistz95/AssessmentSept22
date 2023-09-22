package Store;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Clothing jeans = new Clothing("Blue Jeans", 20.0, Size.M);
        Clothing tShirt = new Clothing("White T Shirt", 5.0,Size.S);
        Clothing buttonUp = new Clothing("Button Up Shirt", 30.0, Size.L);
        Clothing[] managerCart = new Clothing[3];
        managerCart[0]=jeans;
        managerCart[1]=tShirt;
        managerCart[2]=buttonUp;
        Manager manager = new Manager("Kelly", Size.S,managerCart);
        Clothing[] hourlyEmployeeCart = new Clothing[3];
        hourlyEmployeeCart[0]=jeans;
        hourlyEmployeeCart[1]=tShirt;
        hourlyEmployeeCart[2]=buttonUp;
        HourlyEmployee employee= new HourlyEmployee("Tom", Size.L,hourlyEmployeeCart);

        System.out.println(Shop.calulcateTotal(manager.getClothingList()));
        System.out.println("Do the jeans fit our hourly employee? "+ Shop.isAFit(employee,employee.getClothingList()[0]));

        Clothing[] studentCart= new Clothing[3];
        studentCart[0]=jeans;
        studentCart[1]=tShirt;
        studentCart[2]=buttonUp;
        Student student = new Student("Kelly", Size.M,studentCart,928402);
        Discountable[] discountablePeople = new Discountable[3];
        discountablePeople[0]=manager;
        discountablePeople[1]=employee;
        discountablePeople[2]=student;

        System.out.println("The hourly employee's cart is " + Shop.calulcateTotal(manager.getClothingList()) + "\nAfter discount it is : " );
        Shop.printDiscountAmountOff(discountablePeople,buttonUp);

    }

}
