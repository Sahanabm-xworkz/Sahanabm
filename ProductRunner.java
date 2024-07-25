class ProductRunner{
	public static void main(String[] args){
		System.out.println("start running main in productrunner");
		Product.productName("rice");
		Product.productPrice(450);
		Product.productQuantity(1000);
		Product.productQuality("good");
		Product.manufactureDate("2-8-2024");
		Product.brand("bullet");
		System.out.println("end running main in productrunner");
	}
}