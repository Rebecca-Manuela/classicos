import java.util.Scanner;
public class JovemVelho {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int i=1, idade, idadeVelho, idadeNovo;
		double media, somaI=0;
		do {
			System.out.println ("Digite a idade:");
			idade = in.nextInt();
			somaI = somaI+idade;
			if (idade>=idadeVelho) {
				idadeVelho=idade;
			} else {
				idadeNovo=idade;
			}
			media = somaI/10;
			System.out.println ("A pessoa mais jovem possui"+idadeNovo+"anos e a mais velha possui"+idadeVelho+"anos");
		} while (i<=10);
		in.close();
	}

}
