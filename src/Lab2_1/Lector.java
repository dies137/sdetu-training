package Lab2_1;

class Lector extends Person {
	// static String type = "Lector";

	public Course registerCourse(String name, double hours) {
		Course n = new Course(name, hours, this);
		this.enroll(n);
		return n;
	}

	Lector(String fName, String lName, String SSN) {
		this.setName(fName, lName);
		this.setSSN(SSN);
		this.setId((StudentDbApp.genId(this.getSSN())));
		this.createAccount();
		this.setisLector(true);
	}
}