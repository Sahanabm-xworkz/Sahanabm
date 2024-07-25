class NewsPaper{
	public static void voting(int age){
		System.out.println("start running Voting in NewsPaper");
		System.out.println("voting age:"+age);
		if(age>=18 && age<100)
			System.out.println("age is valid");
			else
				System.out.println("age is In-valid");
		System.out.println("end running Voting in NewsPaper");
	}
	public static void marriage(int age,String name){
		System.out.println("start running marriage in newspaper");
		System.out.println("marriage age is:"+age);
		System.out.println("name:"+name);
		if(age>=21 && age<50)
		   System.out.println("marriage age is valid");
		else
			System.out.println("marriage age is in-valid");
		System.out.println("end running marriage in newspaper");
	}
	public static void policeService(double height,double weight,int age){
		System.out.println("start running policeService in newspaper");
		System.out.println("police service height is:"+height);
		System.out.println("police service weight is:"+weight);
		System.out.println("police service age is:"+age);
		if(height>=5.8 && height<=7){
			System.out.println("height is valid");
		}
		else{
			System.out.println("height is in-valid");
		}
		if(weight>=45 && weight<=70){
			System.out.println("weight is valid");
		}
		else{
			System.out.println("weight is in-valid");
		}
		if(age>=22 && age<40){
			System.out.println("age is valid");
		}
		else
			System.out.println("height is in-valid");
		System.out.println("end running policeService in newspaper");
	}
	public static void product(double price,int quantity,int pincode,int mobile){
		System.out.println("start running product in newspaper");
		System.out.println("price:" +price);
		System.out.println("quantity:" +quantity);
		System.out.println("pincode:"+pincode);
		System.out.println("mobile:"+mobile);
		if(price>40 && price<1000){
			System.out.println("price is valid");	
		}
		else{
			System.out.println("price is in-valid");
		}
		if (quantity>=0 && quantity<10){
			System.out.println("quantity is valid");
		}
		else{
			System.out.println("quantity is in-valid");
		}
		if(pincode==6 && pincode<7){
			System.out.println("pincode is valid");
		}
		else{
			System.out.println("pincode is in-valid");
		}
		if(mobile==10 && mobile==12){
			System.out.println("mobile is valid");
		}
		else
			System.out.println("mobile is in-valid");
		System.out.println("end running product in newspaper");
	}
	public static void verification(int aadharNo){
		System.out.println("start running verification in newspaper");
		System.out.println("aadharNo:"+aadharNo);
		if (aadharNo>=10 && aadharNo<=12){
			System.out.println("aadharNo is valid");
		}
			else{
				System.out.println("aadharNO IS In-valid");
			}
		System.out.println("end running verification in newspaper");
	}
}