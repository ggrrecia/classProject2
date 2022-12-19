package things;
public class Book {
    private String subject;
    private double price;
    public Book(String subject,double price){

        this.subject=subject;
        this.price=price;
    }
    public String getSubject(){
        return subject;
    }
    public double getPrice(){
        return  price;
    }
    public void displayInfo(){
        System.out.printf("Type->Book->\t\t\tSubject:%-15s\tPrice:%.2f\n",subject,price);
    }
}