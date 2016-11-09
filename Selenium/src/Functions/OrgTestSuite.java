package Functions;

public class OrgTestSuite 
{

	public static void main(String[] args)
	{
		orgMaster om=new orgMaster();
		//Login
		System.out.println("Login TC Execution Started");
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com/");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		System.out.println("Login TC Execution Completed");
		//Emp reg
		System.out.println("EmpReg TC Execution Started");
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com/");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_EmpReg("Qedge1234", "Technologies");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		System.out.println("EmpReg TC Execution Completed");
		//User reg
		System.out.println("UserReg TC Execution Started");
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com/");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_UserReg("Qedge1234 Technologies", "Qedge12345678", "Qedge123456", "Qedge123456");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		System.out.println("UserReg TC Execution Completed");
		//UserLogin
		System.out.println("UseLogin TC Execution Started");
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com/");
		System.out.println(res);
		
		res=om.org_Login("Qedge12345678", "Qedge123456");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		System.out.println("UseLogin TC Execution Completed");
	}

}
