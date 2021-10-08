public class MenuDriver {
	public static void main(String[] args) {

		// Create three menu items (using the provided text files)
		MenuItem item1 = new MenuItem("burrito.txt");
		MenuItem item2 = new MenuItem("chickenWrap.txt");
		MenuItem item3 = new MenuItem("fishTaco.txt");

		// Test methods in class MenuItem

		item1.increasePrice(0.10f);
		System.out.println(item1.getPrice());

		boolean res1 = item1.containsIngredient("lettuce");
		boolean res2 = item2.containsIngredient("mayo");
		boolean res3 = item3.containsIngredient("salsa");
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);


		item1.writeToFile("item1");
		item2.writeToFile("item2");
		item3.writeToFile("item3");



	}

}