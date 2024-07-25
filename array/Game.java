class Game{
	public static void main(String[] args){
		System.out.println("start main in Game");
		String games1="pubji";
		String games2="kunta halpi";
		String games3="volley ball";
		String games4="basket ball";
		String games5="foot ball";
		String games6="running race";
		String games7="throw ball";
		String games8="shettle";
		String games9="highjump";
		String games10="longjump";
		
		String[]  games={games1,games10,games2,games7};
		
		for(int index=0;index<games.length;index++)
		{
		String ref=games[index];
		System.out.println("ref:"+ref);
 System.out.println("index:"+index);	
		}
		
		int Games=games.length;
		 System.out.println("Games:"+Games);
		
		System.out.println("end main in Game");
	}	
}