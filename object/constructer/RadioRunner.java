class RadioRunner{
	public static void main(String[] args){
	System.out.println("Start main in RadioRunner");
	
   Radio radio=new Radio(5000,"fiber");
   radio.brand="MARSHALL";
	System.out.println("priceLocal:"+radio.price);
	System.out.println("materialLocal:"+radio.material);
	System.out.println("colorLocal:"+radio.color);
	System.out.println("brandLocal:"+radio.brand);
	

	
   Radio radio1=new Radio(9000,"plastic");
     radio1.brand="FM";
	System.out.println("priceLocal:"+radio1.price);
	System.out.println("materialLocal:"+radio1.material);
	System.out.println("colorLocal:"+radio1.color);
	System.out.println("brandLocal:"+radio1.brand);
	
	
  System.out.println("end main in RadioRunner");
	
	
	}

	
}