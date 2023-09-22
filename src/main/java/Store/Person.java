package Store;

public abstract class Person {
    private String name;
    private Size bodySize;
    private Clothing[] clothingList;

    public Person(String name, Size bodySize, Clothing[] clothes) {
        this.name=name;
        this.bodySize=bodySize;
        this.clothingList=clothes;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setBodySize(Size bodySize){
        this.bodySize=bodySize;
    }
    public void setClothingList(Clothing[] clothes){
        this.clothingList=clothes;
    }
    public String getName(){
        return name;
    }
    public Size getBodySize(){
        return  bodySize;
    }
    public Clothing[] getClothingList(){
        return clothingList;
    }
}
