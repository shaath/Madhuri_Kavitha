package Java;

import java.util.Scanner;

public class SwitchCaseEg
{
	public static void main(String[] args)
	{
//		String course="selenium";
		Scanner sc=new Scanner(System.in);
		String course=sc.next();
		switch (course) 
		{
		case "selenium":
			System.out.println("You are selected selenium");
			break;
		case "manual":
			System.out.println("You are selected manual");
			break;
		case "LOadRunner":
			System.out.println("You are selected LoadRunner");
			break;
		case "UFT":
			System.out.println("You are selected UFT");
			break;
		default:
			System.out.println("Select a proper option");
			break;
		}
		
	}

}
