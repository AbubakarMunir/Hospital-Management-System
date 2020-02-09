/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;
import java.util.*;
public class main {

    
    public static void main(String[] args) {
        
        FaisalHospital obj=FaisalHospital.getInstance();
        
        Date d=new Date(9,2,2020);
        Date bd=new Date(2,5,1980);        
        
        Doctor d1=new Doctor("Dr Ali Usmani","bahria town","male",bd,d,"fcps","orthopedics");
        Doctor d2=new Doctor("Dr Waseem Zafar","Iqbal Town","male",bd,d,"mbbs","Dietician");
        Doctor d3=new Doctor("Dr Saira Muzaffar","DHA","female",bd,d,"FCPS","oncologist");
        Doctor d4=new Doctor("Dr Amna Tanveer","Johar Town","female",bd,d,"MS Gynaecology","Gynaecologist");
        Nurse n1=new Nurse("Afia","Raajgarh","female",bd,d,"FSC","Registered Nurse");
        Nurse n2=new Nurse("Alizeh","Raajgarh","female",bd,d,"FSC","Licensed Practical Nurse");
        TechnicalStaff ts1=new TechnicalStaff("Ammar Waseem","Johar Town","male",bd,d,"Btech","Technician");
        TechnicalStaff ts2=new TechnicalStaff("Kamal Naeem","Johar Town","male",bd,d,"Diploma in Surgical tech","ScrubTech");
        Patient p1=new Patient("Ali Afnan","Jaranwala","male",bd,"Eczema",false,d);
        Patient p2=new Patient("Syed Amir","Jaranwala","male",bd,"Rhinitis",false,d);
        Patient p3=new Patient("Syed Wali ","Jaranwala","male",bd,"pollen",false,d);
        Visitor v1=new Visitor("Maham Mir","Gujranwala","female",bd,"5:20","6:30");
        
        obj.addDoc(d1);
        obj.addDoc(d2);
        obj.addDoc(d3);
        obj.addDoc(d4);
        obj.addNurse(n1);
        obj.addNurse(n2);
        obj.addTechstaff(ts1);
        obj.addTechstaff(ts2);
        
        obj.addPatient(p1);
        obj.addPatient(p2);
        obj.addPatient(p3);
       
        //Patient is also added to record when he/she enters the hospital;
        obj.addrecord(p1);
        obj.addrecord(p2);
        obj.addrecord(p3);
        //Visitor is also added to record when he/she enters. A visitor can be an attendant or a relative of patients or staff
        obj.addrecord(v1);
        
        Date visitdate=new Date(11,2,2020);
        p1.visitdoc("Dr Amna Tanveer", d);          // d is the date on which patient is visiting and it is same as her last visit date
        p1.visitdoc("Dr Amna Tanveer", visitdate);
        
        p2.visitdoc("Dr Ali Usmani", visitdate);
        p2.visitdoc("Dr Ali Usmani", visitdate);
        
        p3.visitdoc("Dr Waseem Zafar", visitdate);
        p2.visitdoc("Dr Waseem Zafar", visitdate);
        
    }
    
}
