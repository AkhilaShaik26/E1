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
class DaemonThread
{
public static void main(String args[ ]) throws Exception
{
System.out.println(Thread.currentThread().isDaemon());
Hello h=new Hello();
System.out.println(h.isDaemon());
//false
h.setDaemon(true);
System.out.println(h.isDaemon());
//true
}
}
