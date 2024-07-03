class Hello extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("Child Thread");
try
{
Thread.sleep(3000);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}
class SleepMethod
{
public static void main(String args[]) throws Exception
{
Hello h=new Hello();
h.start();
for(int i=0;i<5;i++)
{
System.out.println("Main Thread");
}
}
}
