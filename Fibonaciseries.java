package Classassignments;

public class Fibonaciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnum=0;
		int secondnum=1;
		int sum;
		
		System.out.println("The First Number is:"+firstnum);
		System.out.println("Second Number is:"+secondnum);
		
		for (int i =0;i<7;i++) {
			sum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=sum;
			
			System.out.println("sum:"+sum);
		}

	}
	}

