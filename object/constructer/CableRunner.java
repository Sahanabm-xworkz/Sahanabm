class CableRunner{
	public static void main(String[] args){
	System.out.println("Start main in CableRunner");
	
   Cable cable=new Cable(1000,"fiber");
   cable.brand="finic";
	System.out.println("priceLocal:"+cable.price);
	System.out.println("materialLocal:"+cable.material);
	System.out.println("colorLocal:"+cable.color);
	System.out.println("brandlocal:"+cable.brand);

	
   Cable cable1=new Cable(3000,"fiber");
   cable1.brand="pipo";
	System.out.println("priceLocal:"+cable1.price);
	System.out.println("materialLocal:"+cable1.material);
	System.out.println("colorLocal:"+cable1.color);
	System.out.println("brandlocal:"+cable1.brand);
	
	System.out.println("end main in CableRunner");

	
	
	}
	
	
}