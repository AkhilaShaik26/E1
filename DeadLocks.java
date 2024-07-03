class A
{
	public synchronized void afirst(B b)
	{
		System.out.println("Thread starts execution of afirst() in A class");
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
		b.last();
		System.out.println("Thread1 trying to call last() of B class");
	}
	public synchronized void last()
	{
		System.out.println("Last method of A class");
	}
}
class B
{
	public synchronized void bfirst(A a)
	{
		System.out.println("Thread starts execution of bfirst() in B class");
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
		a.last();
		System.out.println("Thread1 trying to call last() of A class");
	}
	public synchronized void last()
	{
			System.out.println("Last method of B class");
	}
}
class DeadLocks extends Thread
{
	A a=new A();
	B b=new B();
	public void vv()
	{
		this.start();
		a.afirst(b);
	}
	public void run()
	{
		b.bfirst(a);
	}
	public static void main(String args[ ]) throws Exception
	{
		DeadLocks d=new DeadLocks();
		d.vv();
	}
}
