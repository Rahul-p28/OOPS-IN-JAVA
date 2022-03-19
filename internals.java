package CIE;
import CIE.*;
import java.util.*;
public class internals extends CIE.student{
public int ciem[] = new int[5];

Scanner s  = new Scanner(System.in);

public void accept()
{
  for(int i=0;i<5;i++)
{
   System.out.println(" ENTER THE CIE MARKS IN THE SUBJECT"+(i+1));
    ciem[i] = s.nextInt();
}
}
}

 