package hospital;
import java.util.*;

/**
 * 
 */
public class Nurse extends MedicalStaff {

    /**
     * Default constructor
     */
    public Nurse(String n,String a,String g,Date bd,Date j,String e,String t) {
        super(n,a,g,bd,j,e,("n"+count));
        type=t;
    }

    /**
     * 
     */
    public String type;

}