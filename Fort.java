class Fort{
	public static  String location(String location){
		System.out.println("start location in Fort");
		
		if(location == "mysore")
		{
			System.out.println("location is mysore");
			return "mysore";
		}
		if(location == "delhi")
		{
			System.out.println("location is delhi");
			return "delhi";
		}
		if(location == "bidar")
		{
			System.out.println("location is bidar");
			return "bidar";

		}
		System.out.println("end location in Fort");
		return "not matching";


	}
	public static  double fees(String name){
		System.out.println("start fees in Fort");
		
		if(name == "mysore palace")
		{
			System.out.println("fees is mysore");
			return 200;
		}
		if(name == "delhi fort")
		{
			System.out.println("fees is delhi");
			return 500;
		}
		if(name == "bidar fort")
		{
			System.out.println("fees is bidar");
			return 800;

		}
		System.out.println("end location in Fort");
		return -1;
	}

}
