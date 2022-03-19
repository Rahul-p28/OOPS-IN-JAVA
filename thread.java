
class first extends Thread{
public void run()
{
    try 
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("BMS COLLEGE OF ENGINEERING");
            Thread.sleep(10000);
        }
    }
        catch(InterruptedException e)
        {
            System.out.println("INTTERRUPTED "+ e);
        }
    }
}

class second extends Thread{
public void run()
{
    try 
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("CSE");
            Thread.sleep(2000);
        }
    }
        catch(InterruptedException e)
        {
            System.out.println("INTTERRUPTED "+ e);
        }
    }
}
class threaddemo{
    public static void main(String args[])
    {
        new first().start();
        new second().start();
    }
}



