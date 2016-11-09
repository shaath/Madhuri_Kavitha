package Java;

public class StaticArrayEg
{

	public static void main(String[] args) 
	{
//		String[] course={"Manual","Selenium","UFT","RFT","SilkTest"};
		Object[] course={"Selenium",'M',2222,3333.33,false};
		//Finding the length of the array
		
		int len=course.length;
		System.out.println(len);
		
		//Read the values from Array
		
//		System.out.println(course[1]);
		
		for (int i = 0; i < course.length; i++)
		{
			System.out.println(course[i]);
		}
		
	}

}
