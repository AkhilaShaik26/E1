class A extends Thread
{
public  void run()
{
System.out.println("Thread is created with the Name : "+Thread.currentThread().getName());
}
}
class CreatingMultipleThreads1
{
public static void main(String args[ ])
{
A a1=new A();
A a2=new A();
A a3=new A();
A a4=new A();
A a5=new A();
a1.start();
a2.start();
a3.start();
a4.start();
a5.start();
}
}
