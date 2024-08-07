class SoftwareEnginner{
	String name;
	int experience;
	String designation;
	double salary;
	
	public SoftwareEnginner()
	{
		System.out.println("Created SoftwareEnginner");
	}	
	public SoftwareEnginner(String name,int experience,String designation,double salary)
	{
		this.name=name;
		this.experience=experience;
		this.designation=designation;	
		this.salary=salary;
	}
   public void display(){
	   System.out.println("softwareEnginner name:"+this.name);
	   System.out.println("softwareEnginner experience:"+this.experience);
	   System.out.println("softwareEnginner designation:"+this.designation);	
	   System.out.println("softwareEnginner salary:"+this.salary);	
	   
   } 	

	
	
	
	
	
	
	
	
}