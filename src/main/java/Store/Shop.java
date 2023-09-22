package Store;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Shop {
    public static double calulcateTotal(Clothing[] clothes){
        double sum=0.0;
        for(Clothing x : clothes){
            sum+=x.getPrice();
        }
        return sum;
    }
    public static boolean isAFit(Customer x, Clothing y){
        return x.getBodySize().equals(y.getSize());
    }
    public static void printDiscountAmountOff(Discountable[] x, Clothing y){
        //gets discount from object
        //multiplies discount * price
        //prints the result because it is the amount off
        for(Discountable discountedCustomer : x){
            if(discountedCustomer instanceof Manager){
                System.out.println("The discount for a manager is : " + ((Manager) discountedCustomer).getDiscount()*y.getPrice());
            }else if (discountedCustomer instanceof Employee){
                System.out.println("The discount for a regular employee is : " + ((HourlyEmployee) discountedCustomer ).getDiscount()* y.getPrice());
            }else{
                System.out.println("THe discount for a student is : "+ ((Student)discountedCustomer).getDiscount()*y.getPrice());
            }
        }

    }
    public static void sortAndPrintClothingByPrice(ArrayList<Clothing> x){
        x.sort(Comparator.comparingDouble(Clothing::getPrice));
        for(Clothing clothes : x){
            System.out.println(clothes.getDescription() + " : "+ clothes.getPrice());
        }
    }
}
