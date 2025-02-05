public class SourdoughBread_ extends Bread{
	
	private String shape = "v";
	private int sourDoughStarter = 3;
	   
	   public SourdoughBread_(){

	       super("Sourdough Bread","v",false,1,1,1,1,1,1,"Sourdough Bread Recipe goes here...");
	      
	   }

	   public SourdoughBread_(String breadName, String shape, boolean state, double flour, int water, double salt, double sugar, double bakingPowder, double yeast, String recipe){

	    super(breadName,shape,state,flour,water, salt, sugar,bakingPowder,yeast, recipe);

	   }
	   
	   public String recipe() {
		   return " 1. Mix flour, water, salt, baking powder, yeast, and ripe sourdough starter." + "\n 2. Make the dough" + 
	    		   "\n 3. Bulk Rise" + "\n 4. Stretch and fold the dough" + "\n 5. Cut and shape the dough" + "\n 6. Second rise" 
	    		   + "\n 7. Preheat the oven to 450°F towards the tail end of the second rise" + "\n 8. Spray the laof with luke warm water" + 
	    		   "\n 9. Bake the bread at 400°F for 20 minutes, until deep golden brown" + "\n 10. Let the bread cool until good to eat" +"\n"+ isBaked(true);
	   }

	   public String toString(){
	       return super.toString() + getIngredients() +"\n" + getSourDoughStarter()+ " cups of Sourdough Starter" + "\n FULL RECIPE: \n" + recipe(); 
	   }

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public int getSourDoughStarter() {
		return sourDoughStarter;
	}

	public void setSourDoughStarter(int sourDoughStarter) {
		this.sourDoughStarter = sourDoughStarter;
	}
	
	}
