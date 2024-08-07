class State{
	
	String name;
	String language;
   CapitalCity capitalCity=new CapitalCity("bengaluru",10000);
	
	 public State()
	 {	 
	 System.out.println("Created CapitalCity using no-arg const");
	 }
	 public State(String name,String language)

	 {
		 this.name=name;
		 this.language=language;
	 }
	 public  void display(){
		 System.out.println("State name:"+name);
		 System.out.println("State language:"+language);
		 
		 capitalCity.display();
	 }

}
	
	
	
	
