import java.util.Scanner;
public class Fibonacci {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int n, t1=0, t2=1, i=1,pTermo=1;
		System.out.println ("Qual a quantidade de termos:");
		n = in.nextInt();
		do {
			System.out.println (pTermo);
			pTermo = t1+t2;
			t1 = t2;
			t2 = pTermo;
			i++;
			in.close();
		} while (i<=n);
	}

}
