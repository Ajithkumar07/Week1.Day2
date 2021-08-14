package Classassignments;
public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numb = 123456;
		int sum = 0;
		//System.out.println("The number is " +numb);
	
    while(numb !=0)
    {
    	sum = sum +numb%10;
    	numb = numb/10;
    }
    System.out.println("Sum of number " +sum );
	}
}
