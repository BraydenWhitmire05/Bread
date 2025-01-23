/*
 * 
 * @class: Bread.java
 * @author:
 * @version
 * course:
 * written on:
 * description:
 */

public class Bread {
	//flour - boolean, sugar - double, eggs - int
	private boolean glutenFree;
	private Ingredients ingredients = new Ingredients();
	private Recipe recipeBread = new Recipe();
	
	public Bread() {
		
	}
	public Bread(boolean glutenFree, Ingredients ingredients) {
		this.glutenFree = glutenFree;
		this.ingredients = ingredients;
	}
	public boolean isGlutenFree() {
		return glutenFree;
	}
	public void setGlutenFree(boolean glutenFree) {
		this.glutenFree = glutenFree;
	}
	public Ingredients getIngredients() {
		return ingredients;
	}
	public void setIngredients(Ingredients ingredients) {
		this.ingredients = ingredients;
	}
	public Recipe getRecipeBread() {
		return recipeBread;
	}
	public void setRecipeBread(Recipe recipeBread) {
		this.recipeBread = recipeBread;
	}
	public String toString() {
		return "Basic Bread: \n " + ingredients + "\n";
	}
	
}
