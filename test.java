import java.util.Scanner;
//Business logoc class 
class Addition{
void add(){
Scanner sc = new Scanner(System.in);
System.out.println("enter first number");
int x=sc.nextInt();
System.out.println("enter Second number");
int y=sc.nextInt();
int z=x+y;
System.out.println("sum= "+z);
}

}
//Execution logic class
public class test{
static public void main(String abc[])
{

Addition obj=new Addition();
obj.add();
}
}