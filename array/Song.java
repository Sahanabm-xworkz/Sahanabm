class Song{
	public static void main(String[] args){
		System.out.println("start main in Song");
		String songs1="ohh geleya";
		String songs2="mehabuba";
		String songs3="ashiq";
		String songs4="geetanjali";
		String songs5="ba sheddig hogan";
		String songs6="ni illade";
		String songs7="shi matonda";
		String songs8="ohhh gelati";
		String songs9="ninu iruvaga";
		String songs10="ninu illade";
	String[] songs={songs1,songs2,songs6,songs7,songs10,songs9};
	
	for(int index=0;index<songs.length;index++)
	{
       String ref=songs[index];
	   System.out.println("ref:"+ref);
	   System.out.println("index:"+index);
	}
	int name=songs.length;
	 System.out.println("name:"+name);
		System.out.println("end main in Song");
	}
}