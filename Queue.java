class Queue{
	public static String accept(String name,String msg){
		System.out.println("start accept in Queue");
		System.out.println("name:"+name);
		System.out.println("msg:"+msg);
		boolean ref1=ServiceProvider.send(name,msg);
		if(ref1==true){
			return "Sent";
		}else{
			return "Not sent";
		}
	
	}
}