class Drink{
	public static void drinkCoffee(String item,double price){
	System.out.println("start drinkCoffee in drink");
	
	System.out.println("item:"+item);
	System.out.println("price:"+price);
	Sell.sellCoffee(item,price);

	}
}