package hospital;
import java.util.*;

/**
 * 
 */
public class TechnicalStaff extends Staff {

   
    public TechnicalStaff(String n,String a,String g,Date bd,Date j,String e,String t) {
        super(n,a,g,bd,j,e,"t"+count);
        type=t;
    }

    public String type;
    
   

}