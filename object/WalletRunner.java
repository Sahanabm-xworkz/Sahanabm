class WalletRunner{
	public static void main(String args[])
	{
	System.out.println("Start main in WalletRunner");

	
	
	Wallet wallet = new Wallet();
		wallet.quantity = 2;
		wallet.colour = "black";
		wallet.price =1000 ;
		wallet.material = "cloth";
		wallet.quality = "bad";
		System.out.println("Colour is : "+wallet.quantity);
		System.out.println("Brand is : "+wallet.colour);
		System.out.println("Price is : "+wallet.price);
		System.out.println("Price is : "+wallet.material);
		System.out.println("Size is : "+wallet.quality);

		Wallet wallet1 = new Wallet();
		System.out.println("Colour is : "+wallet1.quantity);
		System.out.println("Brand is : "+wallet1.colour);
		System.out.println("Price is : "+wallet1.price);
		System.out.println("Price is : "+wallet1.material);
		System.out.println("Size is : "+wallet1.quality);

		System.out.println("End main in WalletRunner");

		
	
	
	}
	
	
}