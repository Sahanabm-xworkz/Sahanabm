class Sell{
	public static void sellCoffee(String name,double cost){

	System.out.println("start sellCoffee in Sell");
	
	System.out.println("name:"+name);
	System.out.println("cost:"+cost);
	
	Coffee.makeCoffee(name,cost);

	
	}
}