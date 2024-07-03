class Bc
{
	Bc()
	{
		System.out.println("Bc constructor called.....");
	}
	Bc(int a, int b)
	{
		System.out.println("Bc parameterized constructor called.....");
	}
}
 class Dc extends Bc
{
	Dc()
	{
	        super();
		System.out.println("Dc constructor called.....");
	}
	 Dc(int a,int b)
	{
		super(5,4);
		System.out.println("Dc parameterized constructor called.....");
	}
}
class SuperAtConstructorLevel
{
	public static void main(String k[ ])
	{
		Bc b=new Bc();
		Bc b1=new Bc(2,3);
		Dc d = new Dc(); // Calls Dc's no-argument constructor
                Dc d1 = new Dc(2, 3); // Calls Dc's parameterized constructor
	}
}
