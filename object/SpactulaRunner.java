class SpactulaRunner{
	public static void main(String args[])
	{
		System.out.println("Start main in SIMPW_Runner");
		Spatula spatula = new Spatula();
		spatula.material = "silicone";
		spatula.price = 50;
		spatula.type = "Silicone";
		spatula.colour = "red";
		System.out.println("Material is : "+spatula.material);
		System.out.println("Price is : "+spatula.price);
		System.out.println("Type is : "+spatula.type);
		System.out.println("Colour is : "+spatula.colour);

		Spatula spatula1 = new Spatula();
		System.out.println("Material of spatula1 is : "+spatula1.material);
		System.out.println("Price of spatula1 is : "+spatula1.price);
		System.out.println("Type of spatula1 is : "+spatula1.type);
		System.out.println("Colour of spatula1 is : "+spatula1.colour);		
		
	}
	
	
	
	
	
}