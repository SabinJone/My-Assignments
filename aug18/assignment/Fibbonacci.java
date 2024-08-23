package aug18.assignment;

public class Fibbonacci {

	public static void main(String[] args) {
		int firstnumber=0;
		int secondnumber=1;
		System.out.println(firstnumber);
		System.out.println(secondnumber);
		for (int i = 0; i <8; i++) {
			int thirdnumber= firstnumber + secondnumber;
			firstnumber=secondnumber;
			secondnumber=thirdnumber;
			System.out.println(thirdnumber);
		}
		
		// TODO Auto-generated method stub

	}

}
