class  Hotel
{
	String name="cityKeys";
	
	Owner owner=new Owner("sahana",22,'f');
	
	 public Hotel()
	 {	 
	 System.out.println("Created Hotel using no-arg const ");
	 }
	 public  void display()
	 {
		 System.out.println("Hotel name:"+name);
		 owner.display();
	 }

}

	
