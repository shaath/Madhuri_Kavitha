package Java;

public class DynamicArrayEg {

	public static void main(String[] args)
	{
		int[] sal=new int[10];
		
		System.out.println(sal.length);
		
		//write the data into array
		
		sal[0]=3000;
		sal[3]=5000;
		sal[5]=10000;
		
		//Reading the data from an array
		
		for (int i = 0; i < sal.length; i++)
		{
			System.out.println(sal[i]);
			
		}
		

	}

}
