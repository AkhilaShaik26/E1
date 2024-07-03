class Hello extends Thread 
{
	int total=0;
	public void run( )
	{
		synchronized(this)
		{
			for(int i=0;i<=10;i++)
			{
				total=total+i;
			}
			this.notify( );
		}
	}
	// 1 thousand lines of code
}
class InterThreadCommunication 
{
	public static void main(String args[ ]) throws Exception 
	{
		Hello h=new Hello( );
		h.start( );
		synchronized(h)
		{
			h.wait( );
			System.out.println("The Sum is "+h.total);
		}
	}
}
