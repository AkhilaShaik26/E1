class Display
{
	public  void greet(String name)
	{
	          for(int i=0;i<3;i++)
	          {
	                //System.out.println("hi"); 
			synchronized(Display.class)
			{
			//for(int i=0;i<3;i++)
			//{
				System.out.print("Hello...");
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(name);
			}
		}
		//System.out.println("hi");
	}
}
class Assign extends Thread
{
	Display d;
	String name;
	Assign(Display d, String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.greet(name);
	}
}
class SynchronizationBlocks
{
	public static void main(String args[ ]) throws Exception
	{
		Display d=new Display(); //object for Display class
		Assign a1= new Assign(d,"Vedavyas"); //1st child thread instantiated
		Assign a2= new Assign(d,"Mahesh"); //2nd child thread instantiated
		a1.start(); //1st child thread created, it contains 2 threads(main, c1)
		a2.start(); //2nd child thread created, it contains 3 threads(main, c1, c2)
	}
}
