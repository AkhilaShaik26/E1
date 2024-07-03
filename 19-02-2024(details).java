import java.util.Scanner;
 public class loginapp \\ot execute we use execution login class
{
    public static void main(String []args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter username");
         String username=sc.nextLine();
         System.out.println("enter password");
         String pswd=sc.nextLine();
         System.out.println("re-enter same password");
         String repswd=sc.nextLine();
         
         
    }
}
class LoginBusiness
{
   String username,pswd,repswd:
   public LoginBusiness(String username,String pswd,String repswd)\\constructer
   {
       this.username=useername;
       this.pswd=pswd;
       this.repswd=repswd;
   }
   boolean validate() \\method to check the rules
   {
         
