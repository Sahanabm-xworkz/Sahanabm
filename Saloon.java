class Saloon{
	public static double price(String service){
		System.out.println("start service in Saloon");
		if(service == "haircut"){
			System.out.println("price of haircut");
			return 450;
		}
		if(service == "spa"){
			System.out.println("price of spa");
			return 550;	
		}
		
		if(service == "facial"){
			System.out.println("price of facial");
			return 650;	
		}
		if(service == "pedicure"){
			System.out.println("price of pedicure");
			return 750;	
		}
		if(service == "headmassage"){
			System.out.println("price of headmassage");
			return 850;
		}
		if(service == "haircolor"){
			System.out.println("price of haircolor");
			return 350;
		}
		if(service == "trimming"){
			System.out.println("price of trimming");
			return 500;
		}
		
		
		System.out.println("END service in Saloon");
		return -1;

	}
}