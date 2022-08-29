package PayAndEat.entities.concretes;

import PayAndEat.entities.abstracts.Entity;

public class Product implements Entity{
	private int id;
	private int categoryId;
	private int restaurantId;
	private String name;
	private String ingredients;
	private double unitPrice;
	private boolean isAvailable;
	
	public Product(){}
	
	
	public Product(int id, int categoryId, int restaurantId, String name, String ingredients, double unitPrice,
			boolean isAvailable) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.restaurantId = restaurantId;
		this.name = name;
		this.ingredients = ingredients;
		this.unitPrice = unitPrice;
		this.isAvailable = isAvailable;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public int getRestaurantId() {
		return restaurantId;
	}


	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getIngredients() {
		return ingredients;
	}


	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public boolean isAvailable() {
		return isAvailable;
	}


	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}
