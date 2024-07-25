class NewsPaperRunner{
	public static void main(String[] args){
		System.out.println("start running main in news paper runner");
		NewsPaper.voting(21);
		NewsPaper.voting(15);
		NewsPaper.marriage(21,"abc");
		NewsPaper.marriage(12,"xyz");
		NewsPaper.policeService(6,40,23);
		NewsPaper.policeService(4,41,41);
		NewsPaper.product(45,5,7,10);
		NewsPaper.product(20,11,6,12);
		NewsPaper.verification(12);
		System.out.println("end running main in news paper runner");
	}
}