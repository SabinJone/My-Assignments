package aug18.assignment;


public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int n=2; n<15;n++){
boolean isPrime=true;
for(int i=2;i<n;i++) {
	if(n%i==0)
	{	isPrime= false;
	break;
	}
	else isPrime=true;}
	if (isPrime) {
        System.out.println(n + " is a prime number.");
    } else {
        System.out.println(n + " is not a prime number.");
    }
}}}