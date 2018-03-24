package Lab2_1;
import java.util.ArrayList;
import java.util.List;

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