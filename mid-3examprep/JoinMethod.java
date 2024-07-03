class Hello extends Thread
{
public void run()
{
for(int i=0;i<3;i++)
{
System.out.println("Child Thread");
}
}
}
class JoinMethod
{
public static void main(String args[ ]) throws Exception
{
Hello h=new Hello();
h.start();
h.join();
for(int i=0;i<3;i++)
{
System.out.println("Main Thread");
}
}
}
