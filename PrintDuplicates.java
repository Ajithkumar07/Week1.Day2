package week1.day2Assignments;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrNum= {1, 2, 3, 4, 4};

		System.out.print("Duplicate elements are : ");

	//To print duplicates in Array

	for (int i = 0; i <= arrNum.length-1; i++)	
	{

		for (int j = i+1; j <=arrNum.length-1; j++) 
		{
			if (arrNum[i]==arrNum[j])
				System.out.println(arrNum[j]);
		}
	}
}
}
