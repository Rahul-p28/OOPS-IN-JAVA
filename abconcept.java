import java.util.*;
abstract class shape{
int a,b;
 void acceptr(int a)
{
 this.a=a;
}
 void acceptrt(int a,int b)
{
  this.a=a;
  this.b=b;
}
abstract void printarea();// abstract method
}
class rectangle extends shape
{
  
 void printarea()
  {
    System.out.println(" THE AREA OF RECTANGLE IS :"+ (a*b));
  }
}
class triangle extends shape{
void printarea()
{
 double res;
  res = 0.5*a*b;
 System.out.println(" THE AREA OF THE TRIANGLE IS:"+ res);
}
}
class circle extends shape{
void printarea(){
  double re= (3.141*a*a);
System.out.println(" THE AREA OF THE CIRCLE IS:"+ re );
}
}
class abconcept{
public static void main(String args[])
{
 int x,y,z,w,t;
 Scanner s = new Scanner(System.in);


System.out.println(" ENTER THE length and breadth for rectangle :");
x= s.nextInt();
y=s.nextInt();
rectangle r = new rectangle();
r.acceptrt(x,y);
r.printarea();
System.out.println(" ENTER THE BASE AND HEIGHT FOR TRIANGLE :");
z=s.nextInt();
w=s.nextInt();
triangle t1 = new triangle();
t1.acceptrt(z,w);
t1.printarea();
System.out.println(" ENTER THE RADIUS OF THE CIRCLE:");
t=s.nextInt();
circle c = new circle();
c.acceptr(t);
c.printarea();
}
}