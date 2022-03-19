import CIE.*;
import SEE.*;
import java.util.*;
class totalmarks{

public static void main(String args[])
{
 int i,j,n;
 Scanner sc = new Scanner(System.in);
 int total[] = new int[5];
  System.out.println("ENTER THE NUMBER OF THE STUDENTS:");
  n= sc.nextInt();
  CIE.student s[] = new CIE.student[n];
  CIE.internals cie[] = new CIE.internals[n];
  SEE.externals sm[] = new SEE.externals[n];
 for(i=0;i<n;i++)
{
   System.out.println("ENTER THE STUDENT DETAILS:");
    s[i] =new CIE.student();
   s[i].accept();
  cie[i] = new CIE.internals();
   cie[i].accept();
   sm[i] = new SEE.externals();
  sm[i].accept();
}

for(i=0;i<n;i++)
{
  System.out.println("STUDENT DETAILS:");
  s[i].display();
   for(j=0;j<5;j++)
   {
    total[j] = cie[i].ciem[j]+sm[i].seem[j];
      System.out.println(" TOTAL MARKS IN SUBJECT"+(j+1)+" "+ total[j]);

   }
}
}
}

     
  
