import java.util.*;
class quaeqn {
  
public static void main(String args[])
{
    
    int a,b,c,res;
    float root1,root2,d;
    Scanner s = new Scanner(System.in);
    System.out.println(" ENTER THE VALUES FOR A ,B AND C:");
    a = s.nextInt();
    b = s.nextInt();
    c = s.nextInt();
    d = (b*b) - (4*a*c);
    if(d>0)
      res=1;
    else if(d<0)
      res=-1;
    else
      res =0;
    switch(res)
 {
    case 1:
       System.out.println(" ROOTS ARE REAL");
       root1 = ((-1*b) + (float)(Math.sqrt(d)))/(2*a);
       root2 = ((-1*b) - (float)(Math.sqrt(d)))/(2*a);
       System.out.println(" ROOTS ARE "+ root1 +" and "+ root2);
       break;
    case -1:
       System.out.println(" ROOTS ARE IMAGINARY ");
       d = (-1 * d);
       float r1 = (-b/2*a);
       root1 = (float)(Math.sqrt(d))/(2*a);
       System.out.println(" ROOTS ARE :"+ r1 +"+i"+root1);
       System.out.println(r1+"-i"+root1);
       break;
    case 0:
       System.out.println(" ROOTS ARE EQUAL ");
       root1 = root2 = (-b)/(2*a);
       System.out.println(" ROOTS ARE:"+ root1 +" AND "+ root2);
       break;
 }
}
} 