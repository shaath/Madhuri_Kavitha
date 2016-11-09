package Java;

import java.util.ArrayList;

public class ARRAYLISTEG 
{
	public static void main(String[] args) 
	{
		ArrayList<Object> x=new ArrayList<Object>();
		
		x.add("Sharath");
		x.add("Chandra");
		x.add("QEdge");
		x.add(20000);
		x.add(7102016);
		x.add(2, "UFT");
		
		System.out.println(x.size());
		
		for (int i = 0; i < x.size(); i++)
		{
			System.out.println(x.get(i));
		}
		
	}

}
