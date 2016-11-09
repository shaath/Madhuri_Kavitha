package Functions;

public class UserLoginTC {

	public static void main(String[] args) 
	{
		orgMaster om=new orgMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com/");
		System.out.println(res);
		
		res=om.org_Login("Qedge123456", "Qedge123456");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();

	}

}
