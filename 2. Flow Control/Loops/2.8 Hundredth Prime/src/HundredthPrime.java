public class HundredthPrime
{
   public static void main(String[] args)
   {
      /* Make a code that displays the 100th prime number */
	   int currentNumber = 2;
	   int maxNum = 1000;
	   int count = 0;

	   while (currentNumber < maxNum) {
		   if (count == 100) {
			   System.out.println(currentNumber - 1);
			   break;
		   }
		   for (int divisor = 2; divisor <= currentNumber; divisor++) {
			   if (divisor == currentNumber) {
				   count++;
				   break;
			   }
			   if (currentNumber % divisor == 0) {
				   break;
			   }
		   }
		   currentNumber++;
	   }
   }
}
