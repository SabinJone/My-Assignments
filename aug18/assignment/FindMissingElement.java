package aug18.assignment;
import java.util.Arrays;
public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i[]= {1,4,3,2,8,6,7};
Arrays.sort(i);
for (int j = 0; j < i.length; j++) {
	if(i[j]!=j+1)
		{System.out.println("The missing number is " + (j + 1));
	break;}
}

	}

}
