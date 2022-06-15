package Graphics;
import java.io.*;
import java.util.*;
public class Rectangle1
{
int l,b;
Scanner sc=new Scanner(System.in);
public void getdata()
{
System.out.println("ENTER LENGTH AND BREADTH");
l=sc.nextInt();
b=sc.nextInt();
}
public void area()
{
System.out.println("AREA OF REACTANGLE :"+(l*b));
}
}
