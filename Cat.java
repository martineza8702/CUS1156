package cus1156.lab5;

/**
 * This class represents a cat
 * @author Bonnie MacKellar
 */


public class Cat {
	private String name;
	private String color;

	/**
	 * create a default cat
	 */
	public Cat() {
	}

	/**
	 * create a cat of a given name and color
	 * 
	 * @param name  - the cat's name
	 * @param color - the cat's color
	 */
	public Cat(String name, String color) {
		this.name = name;
		this.color = color;
	}

	/**
	 * get the cat's color
	 * 
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * set the cat's color
	 * 
	 * @param color - color of the cat
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * get the cat's name
	 * 
	 * @return - the cat's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * set the cat's name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * make the cat meow
	 */
	public void meow() {
		System.out.println("Hi, my name is " + name);
		System.out.println("Meow!");
	}

}
