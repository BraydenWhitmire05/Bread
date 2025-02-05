public class Bread {

	    private String breadName;
	    private boolean state;
	    private String shape;
	    private double flour;
	    private int water;
	    private double salt;
	    private double sugar;
	    private double bakingPowder;
	    private double yeast;
	    private String recipe;


	    public Bread(){
	        breadName = "Plain Bread";
	        shape = "loaf";
	        state = false;
	        flour = 1;
	        water = 1;
	        salt = 1;
	        sugar = 1;
	        bakingPowder = 1;
	        yeast = 1;
	        recipe = "Plain bread's recipe goes here.";
	    }

	    public Bread(String breadName, String shape,boolean state, double flour, int water, double salt, double sugar, double bakingPowder, double yeast, String recipe) {
	        this.breadName = breadName;
	        this.shape = shape;
	        this.state = state;
	        this.flour = flour;
	        this.water = water;
	        this.salt = salt;
	        this.sugar = sugar;
	        this.bakingPowder = bakingPowder;
	        this.yeast = yeast;
	        this.recipe = recipe;
	    }

	    public String getBreadName() {
	        return breadName;
	    }

	    public void setBreadName(String breadName) {
	        this.breadName = breadName;
	    }

	    public boolean isState() {
	        return state;
	    }

	    public void setState(boolean state) {
	        this.state = state;
	    }

	    public double getFlour() {
	        return flour;
	    }

	    public void setFlour(double flour) {
	        this.flour = flour;
	    }

	    public int getWater() {
	        return water;
	    }

	    public void setWater(int water) {
	        this.water = water;
	    }

	    public double getSalt() {
	        return salt;
	    }

	    public void setSalt(double salt) {
	        this.salt = salt;
	    }

	    public double getSugar() {
	        return sugar;
	    }

	    public void setSugar(double sugar) {
	        this.sugar = sugar;
	    }

	    public double getBakingPowder() {
	        return bakingPowder;
	    }

	    public void setBakingPowder(double bakingPowder) {
	        this.bakingPowder = bakingPowder;
	    }

	    public double getYeast() {
	        return yeast;
	    }

	    public void setYeast(double yeast) {
	        this.yeast = yeast;
	    }

	    public String getRecipe() {
	        return recipe;
	    }

	    public void setRecipe(String recipe) {
	        this.recipe = recipe;
	    }
	    public String getShape() {
			return shape;
		}

		public void setShape(String shape) {
			this.shape = shape;
		}

	    //double flour, int water, double salt, double sugar,
	// double bakingPowder, double yeast) {
	    public String getIngredients(){
	        return String.format("%.2f cups of flour\n%d cups of water\n%.2f table spoons of salt" +
	                "\n%.2f cups of sugar\n%.2f tsp of Baking Powder\n%.2f tsps of yeast",flour,water,salt, sugar, bakingPowder, yeast);
	    }

	    public boolean isBaked(){
	        if(state){
	            System.out.println(breadName + " is baked");
	            return true;
	        }
	        else {
	            System.out.println(breadName + " is not baked");
	            return false;
	        }
	    }

	    public boolean isBaked(boolean state){

	        this.state = state;
	        if(this.state){
	            System.out.println(breadName + " is baked");
	            return true;
	        }
	        else {
	            System.out.println(breadName + " is not baked");
	            return false;
	        }
	    }
	    public String toString(){
	        return String.format("%s\n%s\n%s\n%s\n",breadName,shape,getIngredients(),recipe);
	    }
	}
