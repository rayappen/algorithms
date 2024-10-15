package book.Intorduction_To_ALgorithm;

public class BinarySearch {
	
	public static void binarySearch(int[] input, int luckyNumber)
	{
		
		int low = 0;
		int high = input.length - 1;
		int guess = 0;
		int mid = 0;
		
		while(low <= high)
		{
			mid = (low + high) / 2;
			guess = input[mid];
			
			if(guess == luckyNumber)
				break;
			
			if(guess > luckyNumber)
				high = mid - 1;
			else
				low = mid + 1;
			
		}
		
		if(guess == luckyNumber)
			System.out.println(guess);
		else
			System.out.println("none");
	}
	
	public static void main(String[] args) {
		
		int [] array = new int[100];
		
		for(int i = 1; i <= array.length; i++)
		{
			array[i - 1] = i;
		}
		
//		System.out.println(array[0]);
		binarySearch(array, 1);
	}

}
