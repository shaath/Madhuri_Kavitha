package Functions;

public class BasicFunctions
{

	public static void main(String[] args) 
	{
		function1();

		String res=function2();
		System.out.println(res);
		
		BasicFunctions b=new BasicFunctions();
		
		b.function3();
		
		res=b.function4();
		System.out.println(res);
		
	}
	
	//static function without  returning values
	public static void function1()
	{
		System.out.println("This is function1 code");
	}
	
	//static function with returning value
	
	public static String function2()
	{
		System.out.println("This is function2 code");
		return "Pass";
		
	}
	
	//Non static function without returning value
	
	public void function3()
	{
		System.out.println("This is function3 code");
	}
	
	//Non static function with returning values
	
	public String function4()
	{
		System.out.println("This is function4 code");
		return "Fail";
	}

}
