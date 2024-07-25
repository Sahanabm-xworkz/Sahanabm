class Spoorthi{
	public static String SendMsg(String name,String msg,int quantity){
	    System.out.println("start accept in Queue");
		
		System.out.println("name:"+name);
		System.out.println("msg:"+msg);
		System.out.println("quantity:"+quantity);
		
		String ref1=Queue.accept(name,msg);
		
		System.out.println("end accept in Queue");
		return ref1;
	}	
}