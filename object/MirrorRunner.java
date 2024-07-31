class MirrorRunner{
	public static void main(String args[])
	{
	System.out.println("Start main in MirrorRunner");

	Mirror mirror = new Mirror();
		mirror.type = "double sided";
		mirror.colour = "white";
		mirror.shape = "Square";
		mirror.price = 1000;
		System.out.println("Type is : "+mirror.type);
		System.out.println("Colour is : "+mirror.colour);
		System.out.println("Type is : "+mirror.shape);
		System.out.println("Price is : "+mirror.price);

		Mirror mirror1 = new Mirror();
		System.out.println("Type is : "+mirror1.type);
		System.out.println("Colour is : "+mirror1.colour);
		System.out.println("Type is : "+mirror1.shape);
		System.out.println("Price is : "+mirror1.price);
	System.out.println("end main in MirrorRunner");


	
	
	
	}
	
	
	
}