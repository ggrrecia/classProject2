package things;
import java.util.Random;
public class Pen {
    private String color;
    private double price;
    public Pen(String color,double price){
        this.color=color;
        this.price=price;
    }
    public Pen(){
        Random rndGen = new Random();
        price = rndGen.nextInt(4)+1+rndGen.nextDouble();
    }
    public String getColor(){
        return color;
    }
    public double getPrice() {
        return price;
    }
    public void displayInfo(){
        System.out.printf("Type->Pen->\t\t\t\tColor:%s\t\t\t\tPrice:%.2f\n",color,price);
    }
}
