import java.io.*;
import java.util.*;
class employee
{
int eid;
//String ename;
float salary;
public void accept()
{
Scanner s=new Scanner(System.in);
System.out.println("enter employee detail");
eid=s.nextInt();
//ename=s.nextLine();
salary=s.nextFloat();
}
public void display()
{
System.out.println("Emp id="+eid);
//System.out.println("Emp name="+ename);
System.out.println("Emp salary="+salary);
}
}
class runemp
{
public static void main(String args[])
{
employee e1=new employee();
e1.accept();
e1.display();
}
}

