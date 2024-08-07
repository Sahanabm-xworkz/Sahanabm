class CapitalCity{
	String name;
	int population;
	
	public CapitalCity()
	{
		System.out.println("Created CapitalCity");
	}	
	public CapitalCity(String name,int population)
	{
		this.name=name;
		this.population=population;
	}
   public void display(){
	   System.out.println("capitalCity name:"+this.name);
	   System.out.println("capitalCity population:"+this.population);
   }   
}