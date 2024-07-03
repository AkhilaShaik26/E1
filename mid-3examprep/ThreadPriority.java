class Hello extends Thread
{
public void run()
{
System.out.println("Child Thread");
}
}
class ThreadPriority
{
public static void main(String args[ ])
{
System.out.println("Priority of present main thread : "+Thread.currentThread().getPriority());
Hello h=new Hello();
System.out.println("Priority of present child thread : "+h.getPriority());
h.setPriority(6);
System.out.println("Priority of present child thread : "+h.getPriority());
}
}
