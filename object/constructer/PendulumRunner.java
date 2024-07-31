class PendulumRunner{
	public static void main(String[] args){
	System.out.println("Start main in PendulumRunner");
	
   Pendulum pendulum=new Pendulum(450,"steel");
   pendulum.quantity=1;
	System.out.println("priceLocal:"+pendulum.price);
	System.out.println("materialLocal:"+pendulum.material);
	System.out.println("colorLocal:"+pendulum.color);
	System.out.println("quantityLocal:"+pendulum.quantity);
	
	
	
    Pendulum pendulum1=new Pendulum(500,"iron");
	  pendulum1.quantity=5;
	System.out.println("priceLocal:"+pendulum1.price);
	System.out.println("materialLocal:"+pendulum1.material);
	System.out.println("colorLocal:"+pendulum1.color);
	System.out.println("quantityLocal:"+pendulum1.quantity);

	
	}	
}
	
	
	
	
	
	
