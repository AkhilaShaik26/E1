class Hello extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("Child Thread");
}
}
}
class ThreadMethods
{
public static void main(String args[ ])
{
System.out.println("Name of present executing thread : "+Thread.currentThread().getName());
Hello h=new Hello();
System.out.println("Name of present executing thread : "+h.getName());
Thread.currentThread().setName("Vedavyas");
System.out.println("Name of present executing thread : "+Thread.currentThread().getName());
System.out.println(10/0);
}
}
