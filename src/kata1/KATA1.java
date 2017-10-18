package kata1;
 
import java.util.Calendar;
 import java.util.Date;
import java.util.GregorianCalendar;
 
 public class KATA1 {
 
     public static void main(String[] args) {
         Calendar date;
         date = GregorianCalendar.getInstance();
         date.set(1989,11,15);
         
         Person person= new Person("Lara",date);
         System.out.println(person.getName()+" tiene "+ person.getAge()+ " años");
         
     }
     
 }
    
