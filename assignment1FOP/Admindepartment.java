package assignment1FOP;

class Admindepartment extends SuperDepartment {

	Admindepartment(String a, String b, String c,String d) {
		super(a, b, c, d );
		// TODO Auto-generated constructor stub
	}

void display() {
	super.display();
	System.out.println(departmentName );
	System.out.println(getTodayWork);
	System.out.println(getWorkDeadline);
	System.out.println(isTodayAHoliday+ "\n\n");
}

}

