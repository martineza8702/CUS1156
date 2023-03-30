package cus1156.lab5;
import java.util.ArrayList;

/**
 * Represents a list of cats
 * @author Bonnie MacKellar
 *
 */
public class CatList {
	private ArrayList<Cat> cats = new ArrayList<Cat>();

	/**
	 * add one cat to the list, at the last position
	 * 
	 * @param cat - a Cat to be added
	 */
	public void addCat(Cat cat) {
		cats.add(cat);
	}

	/**
	 * return the number of cats in the list
	 * 
	 * @return number of cats in the list
	 */
	public int howManyCats() {
		return cats.size();
	}

	/**
	 * return the cat at the ith position
	 * 
	 * @param pos - the position whose Cat we want to return
	 */
	public Cat getCatAtPos(int pos) {
		return cats.get(pos);
	}
	
	public int countCatsByColor(String color) 
	{
		int count=0;
		for(int x = 0; x < cats.size(); x++)
		{
			if(cats.get(x).getColor().contentEquals(color));
			{
				count++;
			}
		}

		
		return count;
		
	}
	public Cat getCatByName(String nm)
	{
		for(Cat cat:cats)
		{
			if(nm.equals(cat.getName()))
				return cat;
		}
		return null;
	}

				
		
	}


