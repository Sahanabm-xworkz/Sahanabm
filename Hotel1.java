class Hotel1 {
	public static String item(double price){
		System.out.println("start item in hotel");
		if(item == 10){
			System.out.println("item is idli");
			return "idli";
		}
		if(item == 20){
			System.out.println("item is vada");
			return "vada";
		}
		
		
		System.out.println("end item in hotel");
		return "Not found";

	}
	public static String quantity(double item){
		System.out.println("start quantity in hotel");
		if(item>=1 &&& item<10){
			System.out.println("quantity of idli")
			return "yes";
		}
		if(item>=1 && item<10){
			System.out.println("quantity of vada")
			return "no";	
		}
		if(item>=1 && item<10){
			System.out.println("quantity of dosa-")
			return "yes";	
		}
		System.out.println("end quantity in hotel");
		return "yes";

    }
	
}