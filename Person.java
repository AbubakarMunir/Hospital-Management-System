package hospital;
import java.util.*;

/**
 * 
 */
public class Person {

    
    public Person(String n,String a,String g,Date bd,String i) {
        name=n;
        address=a;
        gender=g;
        id=i;
        birth_date=bd;
        count++;
    }
    
    public static int count=1;
    public String name;
    public String address;
    public String gender;
    public String id;
    public Date birth_date;

}