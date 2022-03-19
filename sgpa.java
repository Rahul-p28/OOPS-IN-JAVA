import java.util.*;

class student
{
  String name;
  String usn;
  int c[] = new int[5];
  int m[] = new int[5];
 Scanner s = new Scanner(System.in);
 void accept()
{
 System.out.println(" ENTER THE NAME OF THE STUDENT:");
 name = s.nextLine();
 System.out.println(" ENTER USN OF THE STUDENT:");
 usn = s.nextLine();
 System.out.println(" ENTER THE MARKS OBTAINED BY THE STUDENT:");
 for(int i=0;i<5;i++)
  {
    m[i] = s.nextInt();
  }
  System.out.println(" ENTER THE CREDITS FOR THE SUBJETCS:");
 for(int j=0;j<5;j++)
 {
    c[j] = s.nextInt();
 }
}
double calc()
{
  int gradepoints[] = new int[6];
double avg=0.0,sgpa=0.0;
 int n=0;
 System.out.println(" THE GRADES OBTAINED BY THE STUDENT:");
   for(int i=0;i<5;i++)
  {
    if(m[i] >= 90 && m[i] <= 100)
    {
         gradepoints[i] = 10;
        System.out.println("S");
    }
   else 
    if(m[i] >= 80 && m[i]<=89)
    {
        gradepoints[i] = 9;
       System.out.println("A");
    }
   else if(m[i] >= 70 && m[i] <= 79)
    {
      gradepoints[i] = 8;
       System.out.println("B");
    }
  else  if(m[i] >= 60 && m[i] <=69)
    {
      gradepoints[i] = 7;
       System.out.println("C");
    }
  else if(m[i] >= 50 && m[i] <= 59)
   {
    gradepoints[i] = 6;
    System.out.println("D");
    }
  else if( m[i] >= 40 && m[i] <=49)
    {
      gradepoints[i] = 5;
     System.out.println("E");
    }
   else 
    {
     System.out.println(" FAILED IN THE SUBJECT"+ (i+1));
     }
 
}
 
 for(int j=0;j<5;j++)
{
   avg += gradepoints[j] * c[j];
    n+=c[j];

}
 
sgpa =(double) (avg/n);
 return sgpa;
}
void display()
{
  System.out.println(" THE NAME OF THE STUDENT:"+ name);
  System.out.println(" THE USN OF THE STUDENT :"+ usn);
  for(int i=0; i<5;i++)
  {
  System.out.println("MARKS OBTAINED ARE:"+ m[i]);
  System.out.println(" CREDITS :"+c[i]);
  }
}
}
class sgpa
{
  public static void main(String args[])
 { 
    student s = new student();
    s.accept();
    s.display();
     System.out.println(" THE SGPA OBTAINED BY THE STUDENT IS "+ s.calc());
 }
}

 
