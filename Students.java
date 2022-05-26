package week4day3;

public class Students {

	public void getStudentInfo(String id) {
		System.out.println("ID :" +id);
	}
	
	public void getStudentInfo(int ID , String Name) {
		System.out.println("ID & Name:"+ID+Name);	
	}
	
	public void getStudentInfo(String email , long phonenumber ) {
		System.out.println("Email & Phone No :"+email+phonenumber);
		
	}
	
	public static void main(String[] args) {
		Students stu = new Students();
		stu.getStudentInfo("23456");
		stu.getStudentInfo(23456,",Mugil");
		stu.getStudentInfo("mugilkk1998@gmail.com,", 8098048);
	}

}
