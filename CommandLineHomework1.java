public class CommandLineHomework1
{
	public static void main(String args[])
	{
		for(String str:args)
		{
			System.out.println("My first name is :" + args[0]);
			System.out.println("My last name is :" + args[1]);
			System.out.println("A hobby of mine is :" + args[2]);
			System.out.println("My major is :" + args[3]);
		}
	}
}