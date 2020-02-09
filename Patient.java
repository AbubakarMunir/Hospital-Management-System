package hospital;
import java.util.*;

/**
 * 
 */
public class Patient extends Person {

    /**
     * Default constructor
     */
    public Patient(String n,String a,String g,Date bd,String al,Boolean ad,Date lv) {
        super(n,a,g,bd,("P"+count));
        allergies=al;
        admitted=ad;
        last_visit=lv;
    }

    
    public String allergies;
    public Boolean admitted;
    public Date last_visit;

    void visitdoc(String docName,Date d)
    {
        FaisalHospital obj=FaisalHospital.getInstance();
        obj.checkPatient(docName, this,d);
        
    }

}