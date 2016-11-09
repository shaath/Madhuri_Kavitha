package Java;

public class TwoDimArray {

	public static void main(String[] args)
	{
		Object[][] s=new Object[2][3];

		System.out.println(s.length);
		System.out.println(s[1].length);
		
		s[1][0]="Selenium";
		s[0][2]='M';
		s[1][0]=60000;
		
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = 0; j < s[i].length; j++)
			{
				System.out.println(s[i][j]);
				
			}
		}
		
	}

}
