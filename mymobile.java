package week1.day2class;

public class mymobile {

		// TODO Auto-generated method stub
	
		String name ="Apple";
		char color ='B';
		int price=14000;
		String model="XR";
		byte MEMORY= 64;//-128 TO 127
		float screensize=5.8f;
		String msg="Apple iphone offer";
		int bill=12000;
		
		public static void makecall() 
		{
		
			System.out.println("getting name");
		}
		public static void sendmsg()
		{
			System.out.println("sending msg");
		}
		private static void paybills()
		{
			System.out.println("send payment bill");
		}
	
		public static void main(String[] args) {		
		mymobile a= new mymobile();
		int billamount=a.bill;
		System.out.println(billamount);
		
		a.makecall();
		a.sendmsg();
		a.paybills();	
}

}