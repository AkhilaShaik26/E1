class Hello extends Thread
{
public void run()
{
for(int i=0;i<3;i++)
{
System.out.println("Child Thread");
//Thread.yield();
}
}
}
class YieldMethod
{
public static void main(String args[ ])
{
Hello h=new Hello();
h.start();
for(int i=0;i<3;i++)
{
System.out.println("Main Thread");
Thread.yield();
}
}
}
