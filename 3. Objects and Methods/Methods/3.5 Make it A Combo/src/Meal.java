public class Meal
{
    //Instance attributes//
    private String name;
    private double cost;

    //Class constructor//
    public Meal(String food, double price)
    {
        name = food;
        cost = price;
    }

    //Instance methods//
	public void makeItACombo() {
		name += " with fries and soda";
		cost += 3;
	}

	public String getBill() {
		return name + ", $" + cost;
	}

	public static void main(String[] args) {
		//create the object with initial values
		Meal exampleObject = new Meal("Burger", 4);
		//modify the values through a method
		exampleObject.makeItACombo();
		System.out.println(exampleObject.getBill());

	}
}