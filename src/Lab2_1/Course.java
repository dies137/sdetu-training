package Lab2_1;

class Course implements IRate {

	@SuppressWarnings("unused")
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