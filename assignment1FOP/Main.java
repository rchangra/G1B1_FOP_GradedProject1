package assignment1FOP;

public class Main {
public static void main (String[]args) {
	Admindepartment obj = new Admindepartment("Welcome to Admin Department",
			"Complete your documents submission",
			"Complete by EOD",
			"Today is not a Holiday");
	obj.display();
	
Hrdepartment obj1 = new Hrdepartment("Welcome to HR Department",
		"team Lunch",
		"Fill today’s timesheet and mark your attendance",
		"Complete by EOD",
		"Today is not a Holiday");	
obj1.display();


Techdepartment obj2 = new Techdepartment("Welcome to Tech Department",
		"Complete coding of Module 1",
		"Complete by EOD",
		"Core Java",
		"Today is not a Holiday");
obj2.display();
}

}
