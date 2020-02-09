package hospital;
import java.util.*;

/**
 * 
 */
public class Ward {

    
    public Ward(int c) {
        capacity=c;
        staff=new ArrayList<Staff>();
        patients=new ArrayList<Patient>();
    }

    
    
    public int capacity;
    public List<Staff> staff;
    public List<Patient> patients;



}