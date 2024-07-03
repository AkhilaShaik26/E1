class Cse implements Runnable
{
	public synchronized void run()
	{
		for(int i=0;i<1;i++)
		{
			System.out.println("Thread is created with the Name : "+Thread.currentThread().getName());
		}
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("Interruted Exception raised");
		}
	}
}
class TGExample
{
	public static void main(String args[ ]) throws Exception
	{
		System.out.println("Default Parent ThreadGroup : "+Thread.currentThread().getThreadGroup()
		.getParent().getName());
		Cse a=new Cse();
		ThreadGroup tg1=new ThreadGroup("FirstTG");
		System.out.println("ThreadGroup1 is created with the Name : "+tg1.getName());
		System.out.println("Parent of ThreadGroup1 : "+tg1.getParent().getName());
		ThreadGroup tg2=new ThreadGroup("SecondTG");
		System.out.println("ThreadGroup2 is created with the Name : "+tg2.getName());
		System.out.println("Parent of ThreadGroup2 : "+tg2.getParent().getName());
		Thread t1=new Thread(tg1,a,"T1");
		Thread t2=new Thread(tg2,a,"T2");
		Thread t3=new Thread(tg1,a,"T3");
		Thread t4=new Thread(tg2,a,"T4");
		Thread t5=new Thread(tg1,a,"T5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		int count1=tg1.activeCount();
		System.out.println("No of threads ThreadGroup1 : "+count1); tg1.list();
		int count2=tg2.activeCount();
		System.out.println("No of threads ThreadGroup2 : "+count2); tg2.list();
		Thread[ ] ts=new Thread[3];
		tg1.enumerate(ts);
		for(int i=0;i<ts.length;i++)
		{
			System.out.println((i+1)+"-Thread Name : "+ts[i].getName());
		}
	}
}
