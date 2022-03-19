class multiple<t,v>{
t ob1;
v ob2;
 multiple(t o1,v o2)
{
 ob1=o1;
 ob2=o2;
}

t get1()
{
 return ob1;
}

v get2()
{
 return ob2;
}
}
class generics{

public static void main(String args[])
{
 multiple<Integer,Integer> iob = new  multiple<Integer,Integer>(10,20);
  System.out.println(iob.get1()+iob.get2());
 multiple<String,String> ios  = new  multiple<String,String>("NITHIN IS A","KEVADA");
  System.out.print(ios.get1());
   System.out.print(ios.get2());
}
}
