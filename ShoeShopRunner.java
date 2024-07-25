class  ShoeShopRunner{
	public static void main(String[] args){
		System.out.println("start main in ShoeShopRunner");
		
		double pumaPrice=ShoeShop.purchase("puma");
		System.out.println("pumaPrice:"+pumaPrice);
		
		double nikePrice=ShoeShop.purchase("nike");
		System.out.println("nikePrice:"+nikePrice);
		
		double adidasPrice=ShoeShop.purchase("adidas");
		System.out.println("adidasPrice:"+adidasPrice);
		
		
		System.out.println("end main in ShoeShopRunner");
	
	}
}