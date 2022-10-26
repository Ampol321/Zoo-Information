package myexam1_10_26_2022;

public class ZooKeeper {

	private String name;
	private String title;
	private double payrate;
	private boolean degree;

    public ZooKeeper(String name, String title, double payrate, boolean degree) {
        this.name = name;
        this.title = title;
        this.payrate = payrate;
        this.degree = degree;
    }
	
	public String getName() {
		return name;
	}

	public String getTitle() {
		if (title.equals("MALE")) {
			return "Mr";	
		}
		return "Ms";
	}

	public double getPayrate() {
		return payrate;
	}

	public boolean hasDegree() {
		return degree;
	}
	
	public String degree() {
		if (getPayrate() < 25) {
			return "has no degree";
		}
		else {
			return "has degree";
		}
	}
	
	String ZooKeeperInfo() {
		return String.format("The zoo keeper named %s. %s has %s and paid for $%.2f per hour",
				getTitle(), getName(), degree(), getPayrate());
	}
	
}
