package Lab2_1;

public class StudentDbApp {

	private static int vId = 1;

	public static void main(String[] args) {
		// Setting Lectors:
		Lector lec1 = new Lector("John", "Smith", "123456781");
		lec1.setSex("Male");
		Lector lec2 = new Lector("Julia", "Smith", "112344432");
		lec2.setSex("FEMALE");
		Lector lec3 = new Lector("Brian", "Corvin", "098765433");
		lec3.setSex("Male");
		// Setting Courses

		Course c1 = lec1.registerCourse("Math", 20);
		Course c2 = lec1.registerCourse("Physics", 10);
		Course c3 = lec1.registerCourse("Informatics", 10);
		Course c4 = lec2.registerCourse("Geometry", 10);
		Course c5 = lec2.registerCourse("Economics", 30);
		Course c6 = lec3.registerCourse("Biology", 20);
		Course c7 = lec3.registerCourse("Chemistry", 20);

		// Setting Students:

		Student stu1 = new Student("Denis", "Bykov", "764574554");
		stu1.pay(20000);
		stu1.enroll(c1);
		stu1.enroll(c4);
		stu1.enroll(c7);
		Student stu2 = new Student("Irina", "Zubtcova", "123123125");
		stu2.pay(21000);
		stu2.enroll(c1);
		stu2.enroll(c2);
		Student stu3 = new Student("Ferrus", "Magnus", "321321326");
		stu3.pay(23400);
		stu3.enroll(c6);
		stu3.enroll(c7);
		Student stu4 = new Student("Mike", "Freed", "546736987");
		stu4.pay(20450);
		stu4.enroll(c4);
		stu4.enroll(c5);
		stu4.enroll(c6);
		Student stu5 = new Student("Victor", "Price", "876234098");
		stu5.pay(23400);
		stu5.enroll(c3);
		stu5.enroll(c4);
		Student stu6 = new Student("Veronika", "Cherepanova", "564738569");
		stu6.pay(20500);
		stu6.enroll(c2);
		stu6.enroll(c3);
		Student stu7 = new Student("Elen", "G", "875469320");
		stu7.pay(22000);
		stu7.enroll(c5);
		stu7.enroll(c7);
		Student stu8 = new Student("Annetta", "Ripple", "345509871");
		stu8.pay(26000);
		stu8.enroll(c7);
		stu8.enroll(c1);
		Student stu9 = new Student("Max", "Gin", "576483232");
		stu9.pay(27000);
		stu9.enroll(c4);
		stu9.enroll(c6);
		Student stu0 = new Student("Che", "Gevaro", "987652323");
		stu0.pay(34000);
		stu0.enroll(c1);
		stu0.enroll(c3);
		stu0.enroll(c5);
		stu0.enroll(c7);

		System.out.println("Totals");
		System.out.println("//////////////////Lectors:///////////////////////");

		printTotals(lec1);
		printTotals(lec2);
		printTotals(lec3);

		System.out.println("//////////////////Students://////////////////////");
		printTotals(stu1);
		printTotals(stu2);
		printTotals(stu3);
		printTotals(stu4);
		printTotals(stu5);
		printTotals(stu6);
		printTotals(stu7);
		printTotals(stu8);
		printTotals(stu9);
		printTotals(stu0);

	}

	// Id generation rules
	public static long genId(String SSN, boolean isPerson) {

		String cnct;

		if (isPerson) {
			int rnd = (int) (Math.random() * 10000);
			cnct = "" + vId++ + "" + rnd + "" + SSN.substring(SSN.length() - 4);
		} else
			cnct = "" + vId++;

		return Long.parseLong(cnct);

	}

	// overloading Id generation
	public static long genId() {
		return genId("", false);
	}

	public static long genId(String SSN) {
		return genId(SSN, true);
	}

	public static void printTotals(Person p) {
		System.out.println(p.toString());
		p.checkBalance();
		p.showCourses();
		System.out.println("=================================================");
	}
}