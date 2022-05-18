import java.io.*;
import java.util.*;
class Area
{
void findarea(int a,int b)
{
System.out.println("\n AREA OF RECTANGLE WITH BREADTH "+a+ " AND LENGTH "+b+ " IS: "+a*b);
}
void findarea(int a)
{
System.out.println("\n AREA OF CIRCLE WITH RADIUS "+a+" IS: "+3.14*a);
}
void findarea(int a,int b,int c)
{
double temp=(a+b+c);
double s=temp/2;
double triarea=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("\n AREA OF TRIANGLE WITH LENGTH OF SIDES "+a+" and "+c+" IS: "+triarea);
}
public static void main(String p[]) throws IOException
{
Scanner c=new Scanner(System.in);
Area d=new Area();
System.out.print("\n Find area of\n1.Rectangle\n2.Triangle\n.3Circle \n\n Select a choice : ");
int choice=c.nextInt();
switch(choice)
{
case 1:
System.out.print("\n Enter the Breadth ");
int b=c.nextInt();
System.out.print("\n Enter the length ");
int l=c.nextInt();
d.findarea(b,l);
break;
case 2:
System.out.print("ENTER THE LENGTH OF FIRST SIDE : ");
int l1=c.nextInt();
System.out.print("\n enter the length of second side : ");
int l2=c.nextInt();
System.out.print("\n enter the length of third side : ");
int l3=c.nextInt();
d.findarea(l1,l2,l3);
break;
case 3:
System.out.print("\n enter the radius : ");
int r=c.nextInt();
d.findarea(r);
break;
default:
System.out.println("\nINVALID CHOICE");
}
}
} 

