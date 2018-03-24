package Lab2_1;

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
