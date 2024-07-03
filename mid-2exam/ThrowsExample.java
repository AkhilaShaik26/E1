import java.util.Scanner;
class ThrowsExample extends RuntimeException
{
static void calculate(int x, int y) throws ArithmeticException
{
System.out.println("Division of two numbers is "+(x/y));
throw new ThrowsExample();
}
public static void main(String k[ ])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter first number : ");
int a=sc.nextInt();
System.out.print("Enter second number : ");
int b=sc.nextInt();
calculate(a,b);
}
}
