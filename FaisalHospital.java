package hospital;
import java.util.*;

/**
 * 
 */
public class FaisalHospital {
   
    public String address;
    public int phoneNum;
    public List<Person> record=new ArrayList<Person>();
    public List<Doctor> doctors=new ArrayList<Doctor>();
    public List<Nurse> nurses=new ArrayList<Nurse>();
    public List<TechnicalStaff> techstaff=new ArrayList<TechnicalStaff>();
    public List<Patient> patients=new ArrayList<Patient>();
    
    
    public FaisalHospital(String a, int pn) {
        address=a;
        phoneNum=pn;
        record=new ArrayList<Person>();
        doctors=new ArrayList<Doctor>();
        nurses=new ArrayList<Nurse>();
        techstaff=new ArrayList<TechnicalStaff>();
        patients=new ArrayList<Patient>();
    
        
    }
    private static FaisalHospital instance;
    static FaisalHospital getInstance(){
		if(instance == null){
                        instance=new FaisalHospital("215 B block Faisal Town Lahore",04235340000);
			return instance;
		}
		return instance;
	}

    

    void checkPatient(String docName,Patient p,Date td)
    {
        int ind=0;
        for(int i=0;i<doctors.size();i++)
        {
            if(docName==doctors.get(i).name)
            {
               ind=i;
            }
        }
        Doctor d=doctors.get(ind);
        d.checkPatient(p,td);
    }
    
    void addrecord(Person p)
    {
        record.add(p);
    }
    
    public void addDoc(Doctor d)
    {
        doctors.add(d);
    }
    
    void addNurse(Nurse n)
    {
        nurses.add(n);
    }
    void addTechstaff(TechnicalStaff ts)
    {
        techstaff.add(ts);
    }
    void addPatient(Patient p)
    {
        patients.add(p);
    }
}