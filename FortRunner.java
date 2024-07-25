class FortRunner{
	public static void main(String[] args){
		System.out.println("Start main in FortRunner");
		
		String ref1=Fort.location("mysore");
		System.out.println("ref1:"+ref1);
		
	    String ref2=Fort.location("delhi");
		System.out.println("ref2:"+ref2);

		String ref3=Fort.location("bidar");
		System.out.println("ref3:"+ref3);
		
		String ref4=Fort.location("byadgi");
		System.out.println("ref4:"+ref4);
		
		double ref5=Fort.fees("mysore palace");
		System.out.println("ref5:"+ref5);
		
		double ref6=Fort.fees("delhi fort");
		System.out.println("ref6:"+ref6);
		
		double ref7=Fort.fees("bidar fort");
		System.out.println("ref7:"+ref7);
		
		double ref8=Fort.fees("goa");
		System.out.println("ref8:"+ref8);
		
		System.out.println("end main in FortRunner");
		
		

			
	}
	
}