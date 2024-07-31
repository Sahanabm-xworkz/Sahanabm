class AnkletsRunner{
	
	public static void main(String[] args){
	System.out.println("Start main in AnkletsRunner");
	
   Anklets anklets=new Anklets(110,"purple");
   anklets.quantity=67;
	System.out.println("costLocal:"+anklets.cost);
	System.out.println("quantityLocal:"+anklets.quantity);
	System.out.println("colorLocal:"+anklets.color);
	System.out.println("materialLocal:"+anklets.material);
	
	Anklets anklets1=new Anklets(110,"purple");
   anklets1.quantity=10000;
	System.out.println("costLocal:"+anklets1.cost);
	System.out.println("quantityLocal:"+anklets1.quantity);
	System.out.println("colorLocal:"+anklets1.color);
	System.out.println("materialLocal:"+anklets1.material);
	
	
	

	
	
	}
	
	
	
}