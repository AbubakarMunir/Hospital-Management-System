package hospital;
import java.util.*;

/**
 * 
 */
public class MedicalStaff extends Staff {

    /**
     * Default constructor
     */
    public MedicalStaff(String n,String a,String g,Date bd,Date j,String e,String i) {
        super( n,a,g,bd,j,e,i);
        patients=new<Patient> ArrayList(); 
    }

    
    public List<Patient> patients;

}