class TrumpetRunner{
	public static void main(String[] args){
	System.out.println("Start main in TrumpetRunner");
	
   Trumpet trumpet=new Trumpet(3000,1);
      trumpet.material="steel";
	System.out.println("priceLocal:"+trumpet.price);
	System.out.println("quantityLocal:"+trumpet.quantity);
	System.out.println("colorLocal:"+trumpet.color);
	
 Trumpet trumpet1=new Trumpet(3000,1);
       trumpet1.material="fiber";
	System.out.println("priceLocal:"+trumpet1.price);
	System.out.println("materialLocal:"+trumpet1.material);
	System.out.println("colorLocal:"+trumpet1.color);
	System.out.println("materialLocal:"+trumpet1.material);
System.out.println("end main in TrumpetRunner");

	

	
	}
	
	
	
	
	
}