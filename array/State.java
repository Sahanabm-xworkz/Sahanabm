class State{
	public static void main(String[] args){
		System.out.println("start main in State");
		String states1="andra pradesh";
		String states2="arunachal pradesh";
		String states3="assam";
		String states4="bihar";
		String states5="chhattisgad";
		String states6="goa";
		String states7="gujarat";
		String states8="haryana";
		String states9="himachal pradesh";
		String states10="jharkhand";
		String states11="karanataka";
		String states12="kerala";
		String states13="madhya pradesh";
		String states14="maharastra";
		String states15="manipura";
		String states16="meghalaya";
		String states17="manipur";
		String states18="megaland";
		String states19="mizoram";
		String states20="nagaland";
		String states21="odisha";
		String states22="punjab";
		String states23="rajastansikkim";
		String states24="tamil nadu";
		String states25="telangana";
		String states26="uttar khand";
		String states28="west bengal";
	
	
	String[] states={states3,states9,states28,states22,states17};
	
    for(int index=0;index<states.length;index++)
	{
		String ref=states[index];
		System.out.println("ref:"+ref);
		System.out.println("index:"+index);
	}
	int States=states.length;
	System.out.println("States:"+States);
	
	System.out.println("end main in State");	
		
	}
}