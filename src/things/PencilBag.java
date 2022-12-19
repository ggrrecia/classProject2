package things;
import java.util.ArrayList;
public class PencilBag {
    private ArrayList<Pen> pens;
    public PencilBag(){
        pens = new ArrayList<>();
    }
    public  ArrayList<Pen> getPen(){
        return pens;
    }
    public void displayContains(){
        for(Pen p: pens){
            p.displayInfo();
        }
    }
}

