package Store;

import java.util.ArrayList;

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
        //Get x class then get the discount
        //get y price

    }
    public static void sortAndPrintClothingByPrice(ArrayList<Clothing> x){
        double highestPrice=x.get(0).getPrice();
        Clothing swapClothes;
        for(int i = 0; i<x.size();i++){
            for(int j = i; j<x.size();j++){
                if(highestPrice<x.get(j).getPrice()){
                    highestPrice=x.get(j).getPrice();
                    
                }
            }
        }
    }
}
