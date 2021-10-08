import java.util.*;
import java.io.*;

public class MenuItem {
	private String name; // name; example: "sesame chicken"
	private float price; // price; example: 10.95f
	private ArrayList<String> ingredients; // a list of ingredients; Example: "cubed chicken meat", "soy sauce", "oil", "flour"


	/** Constructor that loads info about a single MenuItem from the file.
	 * Must use the BufferedReader, not Scanner.
	 * @param filename 
	 */
	public MenuItem(String filename) {
  		/* Reads info about a single menu item from the given file using the BufferedReader .
   		 The info about the menu item is in the following format: 
    		name; price; ingredient1, ingredient2, ...
 
    		Example:
        	Cheese Pizza; 10.25; Flour, eggs, cheese, tomato sauce
     
       		It is okay to assume all ingredients fit in one line. 
       		Use Float.parseFloat method to convert the price in String format 
       		to a float. IOException should be caught in this method. 
       		As you read info from the file, assign values to corresponding
	   		instance variables. 
	   	*/
	 	// FILL IN CODE



       }
	
	/** Return name of this menu item
	 *  @return name 
	 */
	public String getName() {
		return name;
	}

	
	/** Return price of this menu item 
	 *  @return price 
	 */
	public float getPrice() {
		return price;
	}
	
    

	/** Increases the price of this menu item by the given price difference
	 * @param priceDifference */
	public void increasePrice(float priceDifference) {
		// Update the price: increase it by priceDifference, assume it's >=0 
		// FILL IN CODE
		
		


	}
	
      /** Returns true if this item contains a given ingredient
        *  @param ingredient
        *  @return true if this menu item contains this ingredient
	 */
	public boolean containsIngredient(String ingredient) {
		// FILL IN CODE
		// You may NOT use contains method
		
		
	
		
		return false; 
	}

	/** Return menu item info in the following format:
	 *  name; price; ingredients separated by comma
	 *  Example: Sesame chicken, 8.25; cubed chicken meat, soy sauce, oil, flour
	 */
	public String toString() {
	    // FILL IN CODE:

		return ""; //change
	}

	/** Writes the information about this menu item to a file with the given filename, using PrintWriter
	* @param filename Name of the file where to write the information
	*/
	public void writeToFile(String filename) {
		// FILL IN CODE
	 	/* Write the menu item to a file in the following format:
	 	   name; price; ingredient1, ingredient2, ingredient3
		*/

	}
}

