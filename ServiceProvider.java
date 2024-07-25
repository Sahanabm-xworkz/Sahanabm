class ServiceProvider{
	public static boolean send(String name,String msg){
		System.out.println("start send in MessageProvider");
		System.out.println("name:"+name);
		System.out.println("msg:"+msg);
		boolean yes=MessageProvider.send(name,msg);

		System.out.println("end send in MessageProvider");
		return yes;
	}
		

}