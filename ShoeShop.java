class ShoeShop{
	public static  double purchase( String brand){
		System.out.println("start purchase in ShoeShop");
		double ref1=ShoeFactory.order(brand);
		System.out.println("brand:"+brand);
		System.out.println("end purchase in ShoeShop");
		return ref1;

	}
}