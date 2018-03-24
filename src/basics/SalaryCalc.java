package basics;

public class SalaryCalc {
	public static void main(String[] args) {
		String career;
		System.out.println("Starting");
		career = "Developer";
		System.out.println("I'm a " + career);

		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 175000 / 21 / 8;
		
		career = "Analist";
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " +career +" is "+ salary + " per year");
	}
}
