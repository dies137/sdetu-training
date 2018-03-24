package basics;

public class Weather {

	public static void main(String[] args) {
		int temp = 10;
		String sunCond = "Overcast";
		if (temp > 80) {
			System.out.println("It's good, wear shorts and t-shirts");
		} else if (temp > 60 && sunCond == "Sunny") {
			System.out.println("Прохладнее, одеватесь умеренно");
			System.out.println("Оденьте шляпу!!");
		} else if (temp > 50 || sunCond == "Overcast") {
			System.out.println("Прохладно, утепляйтесь ");
		} else {
			System.out.println("Холодно, одевайтесь теплее");
		}

		System.out.println("END");
	}

}
