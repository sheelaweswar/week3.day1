package week3.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =5;
		int fact =1;
		//Using for loop
		/*for(int i = 1;i<=input;i++) {
			fact=fact*i;
		}*/
		//using while loop
		int i = 1;
		while(i<=input) {
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}

}
