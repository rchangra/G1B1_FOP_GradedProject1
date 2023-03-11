package assignment1FOP;

class Hrdepartment extends SuperDepartment {
	String doactivity;
	Hrdepartment(String a, String b, String c,String e,String d ){
		super (a,b,c,d);
		doactivity = e;
		
	}
	void display() {
		super.display();
		System.out.println(departmentName);
		System.out.println(getTodayWork);
		System.out.println(getWorkDeadline);
		System.out.println (doactivity);
		System.out.println(isTodayAHoliday+"\n\n");
	}

}
