public class ReverseNumber{

	public static void main(String[] args){

		int num = 12653;
		int reverseNumber = 0;

		while(num != 0){
			reverseNumber  = reverseNumber*10 + num%10;
			num /= 10;
		}
		System.out.println("The reverse number: "+reverseNumber);
	}
	
}