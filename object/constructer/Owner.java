class Owner{
	String name;
	int age;
	char gender;
	
	public Owner()
	{
		System.out.println("Created Owner");
	}	
	public Owner(String name,int age,char gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;	
	}
   public void display(){
	   System.out.println("owner name:"+this.name);
	   System.out.println("owner age:"+this.age);
	   System.out.println("owner gender:"+this.gender);	   
   } 	
}