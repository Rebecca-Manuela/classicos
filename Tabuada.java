import java.util.*;
public class Tabuada {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int i, j, p;
		for(i=1; i<=10; i++) {
			System.out.println();
			for(j=1; j<=10; j++) {
				p=i*j;
				System.out.println(i+" x "+j+" = "+p);
			}
		}
	}
}
