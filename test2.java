import java.util.Scanner;
public class test2
{
public static void main(String args[])
{
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enetr the number of rows...");
	n=sc.nextInt ();
	for(int i=0;i<n;i++){
	for(int j=0;j<n-i;j++){
	System.out.print(" ");
}
	for(int k=0;k<2*i+1;k++){
	System.out.print("*");
}
	System.out.println("");
}
}
}