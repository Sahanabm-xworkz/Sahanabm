class SaloonRunner{
	public static void main(String[] args){
		System.out.println("start running main in SaloonRunner");
		double ref1=Saloon.price("haircut");
		System.out.println("ref1:"+ref1);
		double ref2=Saloon.price("spa");
		System.out.println("ref2:"+ref2);
		double ref3=Saloon.price("facial");
		System.out.println("ref3:"+ref3);
		double ref4=Saloon.price("haircut");
		System.out.println("ref4:"+ref4);
		double ref5=Saloon.price("pedicure");
		System.out.println("ref5:"+ref5);
		double ref6=Saloon.price("headmassage");
		System.out.println("ref6:"+ref6);
		double ref7=Saloon.price("haircolor");
		System.out.println("ref7:"+ref7);
		double ref8=Saloon.price("trimming");
		System.out.println("ref8:"+ref8);
		double ref9=Saloon.price("eyebrow");
		System.out.println("ref9:"+ref9);
		System.out.println("end running main in SaloonRunner");
		
		
	}
}