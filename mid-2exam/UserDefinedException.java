import java.util.Scanner;
public class UserDefinedException extends Exception
{
UserDefinedException(String s)
{
super(s);
}
public static void main(String k[])
{
Scanner sc=new Scanner(System.in);
try
{
String rno=k[0];
System.out.print("Enter your age : ");
int age=sc.nextInt();
if(age<19)
{
throw new UserDefinedException("Please enter more than 19");
}
System.out.println("Your entered age : "+age);
if(rno.length()!=7)
{
throw new UserDefinedException("Enter rollno correctly");
}
System.out.println("Your entered rollno : "+rno);
}
catch(UserDefinedException u)
{
System.out.println(u.getMessage());
}
}
}
