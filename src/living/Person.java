package living;
import things.*;
public class Person {
    private String firstName;
    private String lastName;
    private BookBag bookBag = null;
    public Person(String firstname, String lastName) {
    }
    public Person() {
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public BookBag getBookBag() {
        return bookBag;
    }
    public void setBookBag(BookBag bookBag) {
        this.bookBag = bookBag;
    }
    public double totalPriceOfPossessions() {
        double total = 0;
        for (Object item : bookBag.getItem()) {
            if (item instanceof Phone) {
                total += ((Phone) item).getPrice();
            } else if (item instanceof Book) {
                total += ((Book) item).getPrice();
            } else if (item instanceof PencilBag) {
                for (Pen p : ((PencilBag) item).getPen()){
                    total += p.getPrice();
                }
            }
        }return total;
    }
}
