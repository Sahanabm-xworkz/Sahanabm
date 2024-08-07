class Country{
	
	String name;
	String continent;
	String state=new State("karanataka","tamilnadu");
	
	 public Country()
	 {	 
	 System.out.println("Created Country using no-arg const");
	 }
	 public Country(String name,String continent)
	 {
		  System.out.println("created using string constructor");
		 this.name=name;
		 this.continent=continent;
		 
	 }
	 public  void display(){
		 System.out.println("country name:"+name);
		 System.out.println("country continent:"+continent); 
		 state.display();
	 }

}
	
	
	

	
	
	
