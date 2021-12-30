import java.io.*;
import java.util.*;
class demo
{
  static int a=3;
  static int b;
 static void display (int x)
{
  System.out.println("x="+x);
  System.out.println("a="+a);
  System.out.println("b="+b);
}
 static
{
  System.out.println("static block called");
       b=a*4;
}
  public static void main(String args[])
{
   display(40);
}
}
