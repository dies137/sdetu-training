package Lab2;

import java.util.ArrayList;
import java.util.List;

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
		
		Student stu1=new Student("Denis","Bykov","764574554");
		stu1.pay(20000);
		stu1.enroll(c1);
		stu1.enroll(c4);
		stu1.enroll(c7);
		Student stu2=new Student("Irina","Zubtcova","123123125");
		stu2.pay(21000);
		stu2.enroll(c1);
		stu2.enroll(c2);
		Student stu3=new Student("Ferrus","Magnus","321321326");
		stu3.pay(23400);
		stu3.enroll(c6);
		stu3.enroll(c7);
		Student stu4=new Student("Mike","Freed","546736987");
		stu4.pay(20450);
		stu4.enroll(c4);
		stu4.enroll(c5);
		stu4.enroll(c6);
		Student stu5=new Student("Victor","Price","876234098");
		stu5.pay(23400);
		stu5.enroll(c3);
		stu5.enroll(c4);
		Student stu6=new Student("Veronika","Cherepanova","564738569");
		stu6.pay(20500);
		stu6.enroll(c2);
		stu6.enroll(c3);
		Student stu7=new Student("Elen","G","875469320");
		stu7.pay(22000);
		stu7.enroll(c5);
		stu7.enroll(c7);
		Student stu8=new Student("Annetta","Ripple","345509871");
		stu8.pay(26000);
		stu8.enroll(c7);
		stu8.enroll(c1);
		Student stu9=new Student("Max","Gin","576483232");
		stu9.pay(27000);
		stu9.enroll(c4);
		stu9.enroll(c6);
		Student stu0=new Student("Che","Gevaro","987652323");
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
	public static void printTotals (Person p){
		System.out.println(p.toString());
		p.checkBalance();
		p.showCourses();
		System.out.println("=================================================");
	}
}

class Person {

	private long pID;
	private String fName;
	private String lName;
	private String SSN;
	private String sex;
	private String age;
	private String phone;
	private String city;
	private String state;
	private Account pAcc;
	private boolean isLector = false;
	private List<Subscription> subscr = new ArrayList<Subscription>();

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getName() {

		String formalName = this.fName + " " + this.lName;
		if (this.sex != null && this.sex.equalsIgnoreCase("MALE")) {
			formalName = "Mr. " + formalName;
		} else if (this.sex != null && this.sex.equalsIgnoreCase("FEMALE")) {
			formalName = "Ms. " + formalName;
		}
		return formalName;
	}

	protected void setName(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}

	protected void setSSN(String SSN) {
		this.SSN = SSN;
	}

	public String getSSN() {
		return SSN;
	}

	protected void setId(long Id) {
		this.pID = Id;
	}

	protected void setisLector(boolean isLector) {
		this.isLector = isLector;
	}

	protected void createAccount() {
		this.pAcc = new Account(this.pID);
	}

	public void enroll(Course cId) {
		Subscription n = new Subscription(this, cId, isLector);
		this.subscr.add(n);
	};

	public void pay(double amount) {
		this.pAcc.credit(amount);
		;
	};

	public void checkBalance() {
		this.pAcc.getInfo();
	};

	public void showCourses() {
		System.out.println(this.getName() + " is subscribed for:");
		for (int i = 0; i < subscr.size(); i++) {
			System.out.println(subscr.get(i).getCourse().getName());
		}
	};

	protected void charge(double amount) {
		this.pAcc.debit(amount);
	};

	@Override
	public String toString() {
		return "ID: " + this.pID + ",Name: " + this.getName() + ",SSN: " + this.SSN;

	};

}

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

class Student extends Person {
	// static String type = "Student";

	Student(String fName, String lName, String SSN) {
		this.setName(fName, lName);
		this.setSSN(SSN);
		this.setId((StudentDbApp.genId(this.getSSN())));
		this.createAccount();
	}

}

class Account {

	private long accId;
	private String accountNumber;
	private double balance;

	Account(long pId) {
		this.accId = StudentDbApp.genId();
		this.accountNumber = pId + "-Account";
		this.balance = 0;
	}

	protected void credit(double amount) {
		this.balance += amount;
		System.out.println(
				"Account " + this.accountNumber + " credited by " + amount + "\n New Balance: " + this.balance);
	}

	protected void debit(double amount) {
		this.balance -= amount;
		System.out
				.println("Account " + this.accountNumber + " debited by " + amount + "\n New Balance: " + this.balance);
	}

	private double checkBalance() {
		return this.balance;
	}

	protected void getInfo() {
		System.out.println("Account: " + accountNumber);
		System.out.println("Current Balance: " + checkBalance());
	}
}

class Course implements IRate {

	private long cId;
	private Lector lId;
	private String name;
	private double countOfHours;
	private double cost;

	Course(String name, double hours, Lector lId) {
		this.cId = StudentDbApp.genId();
		this.name = name;
		this.lId = lId;
		this.countOfHours = hours;
		calcCourseCost();

		System.out.println("Registered new course: " + name + "");
		System.out.println("Lector: " + this.lId.getName() + "");
		System.out.println("Course cost: " + this.cost);
	}

	public String getName() {
		return this.name;
	}

	protected Lector getLector() {
		return this.lId;
	}

	private void calcCourseCost() {
		this.cost = countOfHours * hourCost;
	};

	protected double getCost() {
		return this.cost;
	};
}

class Subscription {

	private long subId;
	private Course cId;
	private Person pId;

	Subscription(Person pId, Course cId, boolean isLector) {
		this.subId = StudentDbApp.genId();
		this.cId = cId;
		this.pId = pId;

		System.out.println(this.pId.getName() + " Subscribed to " + this.cId.getName() + ", subscription ID = "
				+ this.subId + ".");
		if (!isLector) {

			this.pId.charge(cId.getCost());
			this.cId.getLector().pay(cId.getCost());
		}
	}

	Course getCourse() {
		return cId;
	}

}
