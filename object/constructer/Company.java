class Company{
	String id;
	String name;
	String location;
	
SoftwareEnginner softwareEnginner=new SoftwareEnginner("Sahana",0,"softwaredeveloper",30000);
	
	 public Company()
	 {	 
	 System.out.println("Created Company using no-arg const");
	 }
	 public  void display()
	 {
		 System.out.println("Company name:"+name);
		 System.out.println("Company id:"+id);
		 System.out.println("Company location:"+location);
		 softwareEnginner.display();
	 }

}
	
	
	
	
