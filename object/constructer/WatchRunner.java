class WatchRunner{
	public static void main(String[] args){
	System.out.println("Start main in WatchRunner");
	
	Watch watch=new Watch(2000,"silver");
	watch.shape="round";
	System.out.println("priceLocal:"+watch.price);
	System.out.println("colorLocal:"+watch.color);
	System.out.println("brandLocal:"+watch.brand);
	System.out.println("shapeLocal:"+watch.shape);
	
	
	Watch watch1=new Watch(3000,"gold");
	watch1.shape="triangle";

	System.out.println("priceLocal:"+watch1.price);
	System.out.println("colorLocal:"+watch1.color);
	System.out.println("brandLocal:"+watch1.brand);
	System.out.println("shapeLocal:"+watch1.shape);
	
   System.out.println("end main in WatchRunner");


		
	}
	
	
	
	
	
	
}