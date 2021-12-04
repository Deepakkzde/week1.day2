package Week1day2;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input =153;
		int calc =0;
		int original;
		// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
		original =input;
		// Assign input into variable original 
		while(input>0) {
			int rem = input%10; //3 , 5, 1
			calc = calc + (rem*rem*rem);//27  , 125, 1
			input =input/10; //15 , 1
		}
		if (calc == original) {
			System.out.println("It is an armstrong number");
		}else {
			System.out.println("It is not an armstrong number");
		}
		// Use loop to calculate: use while loop to set condition until the number greater than 0

		// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)

		// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)

		// Within loop: Add calculated with the cube of remainder & assign it to calculated

		// Check whether calculated and original are same

				

					//When it matches print it as Armstrong number


				



				

				

				

				



			
	}

}
