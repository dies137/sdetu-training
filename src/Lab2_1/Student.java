package Lab2_1;

class Student extends Person {
	// static String type = "Student";

	Student(String fName, String lName, String SSN) {
		this.setName(fName, lName);
		this.setSSN(SSN);
		this.setId((StudentDbApp.genId(this.getSSN())));
		this.createAccount();
	}

}
