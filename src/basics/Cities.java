package basics;

public class Cities {

	public static void main(String[] args) {
		/*
		 * String[] cities = {"NY", "SF", "Mi", "Da", "MSK"};
		 * System.out.println(cities[0]); System.out.println(cities[1]);
		 * System.out.println(cities[2]); System.out.println(cities[3]);
		 * System.out.println(cities[4]);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * String [] countries;
		 * 
		 * 
		 * countries = new String [3];
		 * 
		 * countries[0]="Ca"; countries[1]="Oh"; countries[2]="NJ";
		 */

		String[] states = new String[5];
		states[0] = "Ca";
		states[1] = "Oh";
		states[2] = "NJ";
		states[3] = "Ca";
		states[4] = "Texas";

		int i = 0;
		do {
			System.out.println(states[i]);
			i++;
		} while (i < 5);
		boolean stateFound = false;
		
		
		int n = 0;
		while (!stateFound) {
			if (states[n] == "Ca") {
				System.out.println("Found!");
				stateFound= true;
			}
			n++;
		}

		System.out.println("For loop");
		for (int x = 0; x<5; x++) {
			System.out.println(states[x] );
		}
		
		
	}

}
