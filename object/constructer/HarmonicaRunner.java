class HarmonicaRunner{
	public static void main(String[] args){
	System.out.println("Start main in HarmonicaRunner");
	
   Harmonica harmonica=new Harmonica(3000,3);
   harmonica.material="plastic";
	System.out.println("priceLocal:"+harmonica.price);
	System.out.println("quantityLocal:"+harmonica.quantity);
	System.out.println("colorLocal:"+harmonica.color);
	System.out.println("materialLocal:"+harmonica.material);
	
	
	
   Harmonica harmonica1=new Harmonica(500,9);
    harmonica1.material="ilastic";
	System.out.println("priceLocal:"+harmonica1.price);
	System.out.println("quantityLocal:"+harmonica1.quantity);
	System.out.println("colorLocal:"+harmonica1.color);
	System.out.println("materialLocal:"+harmonica1.material);

	
	}	
}