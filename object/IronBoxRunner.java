class IronBoxRunner{
	public static void main(String args[])
	{
	System.out.println("Start main in IronBoxRunner");

	IronBox ironBox = new IronBox();
		ironBox.brand = "philips";
		ironBox.colour = "blue";
		ironBox.type = "normal";
		ironBox.price = 1599;
		System.out.println("Brand is : "+ironBox.brand);
		System.out.println("Colour is : "+ironBox.colour);
		System.out.println("Type is : "+ironBox.type);
		System.out.println("Price is : "+ironBox.price);

		IronBox ironBox1 = new IronBox();
		System.out.println("Brand is : "+ironBox1.brand);
		System.out.println("Colour is : "+ironBox1.colour);
		System.out.println("Type is : "+ironBox1.type);
		System.out.println("Price is : "+ironBox1.price);
		
		System.out.println("end main in IronBoxRunner");


	
	
	
	}
	
	
}