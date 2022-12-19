package things;
import java.util.Random;
public class Phone {
    private String number;
    private double price;
    public Phone(){
        Random rndGen = new Random();
        price = rndGen.nextInt((1449 - 150+1)+150)+rndGen.nextDouble();
        int areaCode, threeDigit, fourDigit;
        areaCode =rndGen.nextInt (999-100) + 100;
        threeDigit = rndGen.nextInt (999 - 100) + 100;
        fourDigit = rndGen.nextInt (9999 - 1000) + 1000;
        number = "("+areaCode+")-"+threeDigit+"-"+fourDigit;
    }
    public String getNumber(){
        return number;
    }
    public  double getPrice() {
        return price;
    }
    public void displayInfo(){
        System.out.printf("Type->Phone->\t\t\t%s\t\t\tPrice:%-15.2f\n",number,price);
    }
}
