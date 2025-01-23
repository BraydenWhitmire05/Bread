public class Ingredients {
	private double flour; // cups
	private double sugar; // cups
	private int egg;
	
	public Ingredients() {
		this(1, 1, 1);
	}
	
	public Ingredients(double flour, double sugar, int egg) {
		super();
		this.flour = flour;
		this.sugar = sugar;
		this.egg = egg;
	}

	public double getFlour() {
		return flour;
	}

	public void setFlour(double flour) {
		this.flour = flour;
	}

	public double getSugar() {
		return sugar;
	}

	public void setSugar(double sugar) {
		this.sugar = sugar;
	}

	public int getEgg() {
		return egg;
	}

	public void setEgg(int egg) {
		this.egg = egg;
	} 
	
	public String toString() {
		return String.format("This recipe: \n flour: %.1f cup(s),\nsugar: %.1f cup(s). \n Eggs: %d eggs ", flour, sugar, egg);
	}
}

