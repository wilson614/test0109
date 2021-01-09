import java.util.Scanner;

public class test0109_2 {

	public static void main(String[] args) {
		int i;
		int k;
		int j=0;
		Scanner scanner = new Scanner(System.in);
		i = scanner.nextInt();
		for(k=1;k<=i;k++) {
			if(k%3!=0 & k%5!=0 | k%15==0) {
				j++;
			}
		}
		System.out.println(j);

	}

}
