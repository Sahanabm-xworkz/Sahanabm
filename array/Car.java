class Car{
	public static void main(String[] args){
		System.out.println("start main in Car");
		String cars1="bmw";
		String cars2="maruti dzire";
		String cars3="maruti swift";
		String cars4="hyundai i20";
		String cars5="brezza";
		String cars6="baleno";
		String cars7="omni";
		String cars8="ford";
		String cars9="amaze";
		String cars10="honda city";
		String cars11="nano";
		String cars12="toyota";
		String cars13="nexon";
		String cars14="kwid";
		String cars15="nexon";
		
		String[]  cars={cars15,cars2,cars7,cars11};
		
		for(int index=0;index<cars.length;index++)
		{
		String ref=cars[index];
		System.out.println("ref:"+ref);
 System.out.println("index:"+index);	
		}
		
		int ref1=cars.length;
		 System.out.println("ref1:"+ref1);

		
		System.out.println("end main in Car");
	}
}