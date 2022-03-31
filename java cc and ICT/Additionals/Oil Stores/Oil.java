import java.util.Scanner;
public class Oil{
    
    //Fill the code here
    
    private String name;
    private int pack;
    private char category;
    private float cost;
    public Oil(String name,int pack,char category,float cost){
        this.name=name;
        this.pack=pack;
        this.category=category;
        this.cost=cost;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setPack(int pack){
        this.pack=pack;
    }
    public int getPack(){
        return pack;
    }
    public void setCategory(char category){
        this.category=category;
    }
    public char getCategory(){
        return category;
    }
    public void setCost(float cost){
        this.cost=cost;
    }
    public float getCost(){
        return cost;
    }
    public float calculateTotalCost(float qty){
        float price=((qty*1000)/pack)*cost;
        return price;
    }
}