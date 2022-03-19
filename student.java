package CIE;
import java.util.*;
public class student
{

 public String name,usn;
 public int sem;
 Scanner s = new Scanner(System.in);
 public void accept()
{
   System.out.println("NAME:");
   name=s.nextLine();
  System.out.println("USN:");
  usn= s.nextLine();
  System.out.println("SEM:");
  sem = s.nextInt();
 
}

public void display()
{
  
  System.out.println("NAME:"+  name);
  System.out.println("USN:"+ usn);
  System.out.println("SEM:"+ sem);
 
}
}