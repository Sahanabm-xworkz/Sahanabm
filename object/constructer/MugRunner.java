class MugRunner{
	
	public static void main(String[] args){
	System.out.println("Start main in MugRunner");
	
   Mug mug=new Mug(50,"pink");
   mug.quantity=1;
	System.out.println("costLocal:"+mug.cost);
	System.out.println("quantityLocal:"+mug.quantity);
	System.out.println("colorLocal:"+mug.color);
	System.out.println("materialLocal:"+mug.material);

	 Mug mug1=new Mug(50,"orange");
   mug1.quantity=9;
	System.out.println("costLocal:"+mug1.cost);
	System.out.println("quantityLocal:"+mug1.quantity);
	System.out.println("colorLocal:"+mug1.color);
	System.out.println("materialLocal:"+mug1.material);
	
	}	
}