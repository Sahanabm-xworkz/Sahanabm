class Send{
	public static void sendGift(String name,double price,String date,boolean urgent){
		System.out.println("start sendGift in Send");
		System.out.println("name:"+name);
	    System.out.println("price:"+price);	
		System.out.println("date:"+date);
		System.out.println("urgent:"+urgent);
		System.out.println("end sendGift in Send");

        Recieve.assign(name,price,date,urgent);
		
	}
}