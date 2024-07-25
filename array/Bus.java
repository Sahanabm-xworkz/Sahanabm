class Bus{
	public static void main(String[] args){
		System.out.println("start main in Bus");
	    String busnos1="KA0965";
		String busnos2="KA1106";
		String busnos3="KA8897";
		String busnos4="KA7378";
		String busnos5="KA2002";
		
		
		
			String[] busnos={busnos1,busnos5,busnos2};

		for(int index=0;index<busnos.length;index++)
		{
		String ref=busnos[index];
		System.out.println("ref:"+ref);
 System.out.println("index:"+index);	
		}
		
		int ref1=busnos.length;
		 System.out.println("ref1:"+ref1);
								
		
		

		System.out.println("end main in Bus");
	}

}