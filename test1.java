import java.util.Scanner;
//Business logoc class 
class Addition{
int add(int x,int y){
int z=x+y;
return z;
}
}


//Execution logic class
public class test1{
static public void main(String abc[])
{
int x,y,r;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number:");
x=sc.nextInt();
System.out.println("Enter Second number:");
y=sc.nextInt();
Addition obj=new Addition();
r=obj.add(x,y);
System.out.println("Sum="+r);
}
}