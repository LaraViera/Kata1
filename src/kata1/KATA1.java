package kata1;
 
 import java.util.Date;
 
 public class KATA1 {
 
     
     public static void main(String[] args) {
         Person person= new Person("Lara",new Date(89,11,15));
         System.out.println(person.getName()+" tiene "+ person.getAge()+ " años");
         
     }
     
 }
    
