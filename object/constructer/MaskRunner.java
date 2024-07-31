class MaskRunner{
	public static void main(String[] args){
	System.out.println("Start main in MaskRunner");
	
   Mask mask=new Mask(50,"blue");
   mask.material="cloth";
	System.out.println("priceLocal:"+mask.price);
	System.out.println("quantityLocal:"+mask.quantity);
	System.out.println("colorLocal:"+mask.color);
	System.out.println("materialLocal:"+mask.material);
	

		
	 Mask mask1=new Mask(50,"blue");
	  mask1.material="delicate cloth";
	System.out.println("priceLocal:"+mask1.price);
	System.out.println("quantityLocal:"+mask1.quantity);
	System.out.println("colorLocal:"+mask1.color);
	System.out.println("materialLocal:"+mask1.material);

	
	}
}