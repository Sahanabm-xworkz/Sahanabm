class SyringeRunner{
	public static void main(String[] args){
	System.out.println("Start main in SyringeRunner");
	
   Syringe syringe=new Syringe(450,3);
     syringe.material="steel";
	System.out.println("priceLocal:"+syringe.price);
	System.out.println("quantityLocal:"+syringe.quantity);
	System.out.println("colorLocal:"+syringe.color);
	System.out.println("materialLocal:"+syringe.material);

	 Syringe syringe1=new Syringe(450,3);
     syringe1.material="loha";
	System.out.println("priceLocal:"+syringe.price);
	System.out.println("quantityLocal:"+syringe.quantity);
	System.out.println("colorLocal:"+syringe.color);
	System.out.println("materialLocal:"+syringe1.material);

	
	
	
	
	
	
	
	}
	
}