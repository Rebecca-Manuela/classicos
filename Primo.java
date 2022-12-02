import java.util.*;
public class Primo {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int i, n, qtdP=0;
		System.out.println("Informe o número: ");
		n = in.nextInt();
		for (i=1; i<=n; i++) {
			if(n%i==0) {
				qtdP = qtdP+1;
			}			
		}
		if(qtdP>=3) {
			System.out.println("Esse número não é primo");
		} else {
			System.out.println("Esse número é primo");
		}
	}
}
