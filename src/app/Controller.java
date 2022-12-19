package app;
import living.Person;
import things.*;
import java.util.Random;
public class Controller {
    public static void main(String[] args){
        yourInfoHeader();
        Random rndGen = new Random();
        Person person = new Person("Mike","Johnson");
        BookBag bookbag = new BookBag(person);
        person.setBookBag(bookbag);
        for(int i=0;i<5;i++){
            int areaCode, threeDigit, fourDigit;
            areaCode =rndGen.nextInt (999-100) + 100;
            threeDigit = rndGen.nextInt (999 - 100) + 100;
            fourDigit = rndGen.nextInt (9999 - 1000) + 1000;
            String  phoneNumber = "("+areaCode+")-"+threeDigit+"-"+fourDigit;
            Phone phone = new Phone();
            bookbag.getItem().add(phone);
        }
        String[] subjects={"Math","Chemistry","Economics","CS","Physics","History"};
        for(int i=0; i<4;i++) {
            String subject = subjects[rndGen.nextInt(subjects.length)];
            double price = rndGen.nextInt(200 - 50 + 1, 200) + rndGen.nextDouble();
            Book book1 = new Book(subject, price);
            bookbag.getItem().add(book1);
        }
        PencilBag pencilBag = new PencilBag();
        bookbag.getItem().add(pencilBag);
        String[] colors = {"Red","Black","Green","Blue"};
        for( int i =0;i<5;i++){
            String color = colors[rndGen.nextInt(colors.length)];
            double price= rndGen.nextInt(3)+1+rndGen.nextDouble();
            Pen pens = new Pen(color,price);
            pencilBag.getPen().add(pens);
        }
        bookbag.displayItem();
        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println("Total Price of Possessions");
        System.out.println("-------------------------------------------------------");
        System.out.printf("Total:$%.2f\n",person.totalPriceOfPossessions());
    }








    public static void yourInfoHeader() {

        System.out.println("==============================================");
        System.out.println("PROGRAMMER: " + "Grecia Lara");
        System.out.println("PNTHER ID: " + "6236370");
        System.out.println();
        System.out.println("CLASS: \t\t COP2210");
        System.out.println("SECTION: \t " + "U02");
        System.out.println("SEMESTER:" + "FALL2022");
        System.out.println("CLASSTIME:" + "6:25-9:00");
        System.out.println();
        System.out.println("Assignment:" + "Lab 9");
        System.out.println("certification:\n I undertand FIU's academic policies, and i certify");
        System.out.println("that this work is my own and that name of it is the");
        System.out.println("work of any other person.");
        System.out.println("========================================================");
        System.out.println();

    }
}
