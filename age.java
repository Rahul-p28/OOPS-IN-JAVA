
import java.util.*;
class Myexception1 extends Exception{
    int age;
    Myexception1(int age)
    {
        this.age = age;
    }
    public String toString()
    {
       return ("WRONG AGE("+ age +")");
    }

}
class Myexception2 extends Exception{
    
     public String toString()
    {
       return ("SON'S AGE CANNOT TO BE GREATER THAN OR EQUAL TO THE  FATHER'S AGE.");
    }
}
class father{
    int fage;
    father(int age)
    {
        fage = age;
    }
    void disp1()throws Myexception1{
        if(fage<=0){
         throw new Myexception1(fage);
        }
        System.out.println(" THE FATHER'S AGE IS :"+ fage);
    }
}
class son extends father{
    int sage;
     son(int sage,int age1){
          super(age1);
          this.sage=sage;
     }
     void disp2()throws Myexception2,Myexception1
     {
         if(sage>fage||fage==sage)
         {
             throw new Myexception2();
         }
         if(sage==0)
         {
             throw new Myexception1(sage);
         }
         
         System.out.println("THE SON'S AGE IS :"+ sage);
     }
}
class labproblem{
    public static void main(String args[])
    {
        int a1,a2;
        Scanner s = new Scanner(System.in);
         System.out.println(" ENTER THE AGE OF THE FATHER:");
         a1 = s.nextInt();
          System.out.println("ENTER THE AGE OF THE SON:");
          a2 = s.nextInt();
          son s1 = new son(a2,a1);
          try{
              s1.disp1();
              s1.disp2();
          }
          catch(Myexception1 e)
          {
              System.out.println("CAUGHT EXCEPTION IS:" + e);
          }
          catch(Myexception2 e)
          {
              System.out.println("CAUGHT EXCEPTION IS:" + e);
          }

    }
}