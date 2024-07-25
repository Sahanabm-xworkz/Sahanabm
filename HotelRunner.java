 class HotelRunner{
	 public static void main(String[] args){
		 System.out.println("start  main in HotelRunner");
		 
		 String ref1=hotel.item(10);
		 System.out.println("ref1:"+ref1);
		 
		 String ref2=hotel.item(20);
		 System.out.println("ref2:"+ref2);
		 
		 String ref3=hotel.quantity(6);
		 System.out.println("ref3:"+ref3);
		 
		 String ref4=hotel.item(4);
		 System.out.println("ref4:"+ref4);
		 
		 String ref5=hotel.item(9);
		 System.out.println("ref5:"+ref5);
		  
		 System.out.println("end running main in HotelRunner");

	 }
 }