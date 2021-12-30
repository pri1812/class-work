import java.io.*;
import java.util.*;
class callval
{
  void display(int x,int y)
{
  x=x+20;
  y=y+60;
}
}
  class valuerun
{
  public static void main(String args[])
{
  calval obj=new callval();
   int x=15,y=20;
 System.out.println("x&y before call"+x" "+y);
    obj display(x,y);
 System.out.println("x&y after call"+x" "+y);
}
}
