package hospital;
import java.util.*;

/**
 * 
 */
public class Visitor extends Person {

    
    public Visitor(String n,String a,String g,Date bd,String et,String ext) {
        super(n,a,g,bd,"v"+count);
        entryTime=et;
        exitTime=ext;
    }

    public String entryTime;
    public String exitTime;

}