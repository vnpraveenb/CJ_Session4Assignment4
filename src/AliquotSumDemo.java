import java.util.Scanner; // importing Scanner class

//Parent Class
class AliquotSum{
	
	// Instance Variable for calculating Aliquot Sum
	int aliquotSum = 0;
	
	// Method to find the divisors of a number 
	public int aliquotDivisor(int num, int divisor)
	{
		if(num % divisor == 0 )
		{
			return divisor; // Returns the divisor if num is divisible divisor
		}
		else
		{
			return 0; // Otherwise returns 0
		}
	}
	
	
	// Method to find the aliquotSum of a number and return the Aliquot Sum
	
	public int aliquotSumValue(int num)
	{
		//Evaluates the Aliquot sum of a number
		for(int i=1; i<=(num/2); i++) // num/2 because any number larger then num/2 cannot divide num
		{
			aliquotSum  = aliquotSum  + aliquotDivisor(num, i);		
		}

		return aliquotSum; 
	}
		
	// Method to check if a number is Perfect or Not. Returns a boolean value
	public boolean checkIfPerfectNumber(int num)
	{
		if(num == aliquotSumValue(num))
		{
			aliquotSum = 0 ; // Setting aliquotSum = 0 so that the when the object is reused, the aliquotSum will be refreshed to 0
			return true;
		}
		else
		{
			aliquotSum = 0 ;
			return false; // Setting aliquotSum = 0 so that the when the object is reused, the aliquotSum will be refreshed to 0
		}
	}
	
}

//Child Class
public class AliquotSumDemo extends AliquotSum{
	

	 
	public static void main(String[] args) {
		
		AliquotSumDemo obj1 = new AliquotSumDemo();  // Instantiated AliquotDemo Object
		
		System.out.println("Please input a number to check if it is Perfect Number");
		
		// Taking a number as input from the user
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		// Prints the output based on whether a number is perfect or not
		if(obj1.checkIfPerfectNumber(num) ==  true)
		{
			System.out.println("\nThe Number " + num + " is a Perfect Number");
		}
		else
		{
			System.out.println("Number " + num + " is not a Perfect Number");
		}
		
		
		// Printing all the perfect numbers between 1 to 100
		System.out.println("\nPrinting all the perfect numbers between 1 to 100");
		System.out.println("----------------------------------------------------");
		
		for(int j=1; j<=100;j++)
		{
			if(obj1.checkIfPerfectNumber(j) == true)
			{
				System.out.print(j + "\t");
			}

		}
	}
}

 