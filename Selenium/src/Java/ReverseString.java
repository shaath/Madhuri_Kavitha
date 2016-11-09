package Java;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		String Original="Sharath";//------------>egdEQ
		
		int len=Original.length();
		System.out.println(len);

//		System.out.println(Original.charAt(3));
		for (int i = len-1; i >= 0; i--) 
		{
			System.out.print(Original.charAt(i));
		}
		
	}

}
