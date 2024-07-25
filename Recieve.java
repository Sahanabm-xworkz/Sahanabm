class Recieve{
	public static void assign(String gift,double price,String date,boolean urgent){
		System.out.println("start assign in Recieve");
		System.out.println("gift:"+gift);
	    System.out.println("price:"+price);	
		System.out.println("date:"+date);
		System.out.println("urgent:"+urgent);
		System.out.println("end assign in Recieve");

        Order.deliver(gift,date,urgent);

	}
}