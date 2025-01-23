public class Recipe {

	private Ingredients ingredients = new Ingredients();
	
	public Ingredients getIngredients() {
		return ingredients;
	}
	
	public void setIngredients(Ingredients ingredients) {
		this.ingredients = ingredients;
	}
	
	public void recipe() {
		System.out.println("Recipe for other bread/cales goes here");
	}
	
}
