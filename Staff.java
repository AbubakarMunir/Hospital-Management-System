package hospital;
import java.util.*;

/**
 * 
 */
public class Staff extends Person {

    /**
     * Default constructor
     */
    public Staff(String n,String a,String g,Date bd,Date j,String e,String i) {
        
        super(n,a,g,bd,i);
        joiningDate=j;
        education=e;
    }

    
    public Date joiningDate;
    public String education;


}