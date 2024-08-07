class  Key{
      double weight;
	  String brand;
	

	public Key(String brand,double weight)
	{
		this.brand=brand;
		this.weight=weight;
	}
   public void display(){
	   System.out.println("key brand:"+this.brand);
	   System.out.println("key weight:"+this.weight);
	   
   }
}