class MedicalShop{
	public static void tablet(String medicinename){
	  System.out.println("Start running tablet in MedicalShop");
	  System.out.println("medicinename:"+medicinename);
	}
	public static void shop(String medicinename,int quantity){
		System.out.println("medicinename:"+medicinename);
	    System.out.println("quantity:"+quantity);
    }
	public static void bill(String customerName,String email,String mobileNo){
		System.out.println("customerName:"+customerName);
		System.out.println("email:"+email);
		System.out.println("mobileNo:"+mobileNo);
	    System.out.println("End running bill in MedicalShop");
	}
	public static void paper(String customerName,String mobileNo){
	    System.out.println("customerName:"+customerName);
		System.out.println("mobileNo:"+mobileNo);
	}
		
}



