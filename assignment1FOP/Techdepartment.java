package assignment1FOP;

class Techdepartment extends SuperDepartment {
	String getTechStackInformation;
	Techdepartment(String a , String b, String c, String f, String d){
		super (a,b,c,d);
		getTechStackInformation = f;
		}
	void display() {
		super.display();
		System.out.println(departmentName);
		System.out.println(getTodayWork);
		System.out.println(getWorkDeadline);
		System.out.println(getTechStackInformation);
		System.out.println(isTodayAHoliday+"\n\n");
	}

}
