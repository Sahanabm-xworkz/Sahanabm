class PillowRunner{
	public static void main(String args[])
	{
	System.out.println("Start main in PillowRunner");

	
	Pillow pillow = new Pillow();
		pillow.colour = "Beige";
		pillow.brand = "Peps_mattress";
		pillow.price = 500;
		pillow.size = "Small";
		System.out.println("Colour is : "+pillow.colour);
		System.out.println("Brand is : "+pillow.brand);
		System.out.println("Price is : "+pillow.price);
		System.out.println("Size is : "+pillow.size);

		Pillow pillow1 = new Pillow();
		System.out.println("Colour is : "+pillow1.colour);
		System.out.println("Brand is : "+pillow1.brand);
		System.out.println("Price is : "+pillow1.price);
		System.out.println("Size is : "+pillow1.size);
		
		
		System.out.println("end main in PillowRunner");


	
	
	
	
	
	
	}
	
	
}