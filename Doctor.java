package hospital;
import java.util.*;

/**
 * 
 */
public class Doctor extends MedicalStaff {

    
    
    public Doctor(String n,String a,String g,Date bd,Date j,String e,String s) {
        
        super(n,a,g,bd,j,e,("d"+count));
        Specialization=s;
        
    }

    
    public String Specialization;
    
    void checkPatient(Patient p,Date d)
    {
        if(d==p.last_visit)
        {
            System.out.println(p.name+ " with patientID " + p.id+" has already visited today");
        }
        else
        {
            p.last_visit=d;
            System.out.println(p.name+ " with patientID " + p.id+" is allowed");
            this.patients.add(p);
            
        }
    }
}