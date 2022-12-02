import java.util.*;
public class FaixaEtaria {
	public static void main(String[]args) {
		Scanner in=new Scanner (System.in);
		int i, idade;
		double porcemIdade[], qtdIdade[];
		porcemIdade = new double [6];
		qtdIdade = new double [6];
		for(i=1;i<=15;i++) {
			System.out.println("Digite a idade:");
			idade = in.nextInt();
			if(idade<=15) {
				qtdIdade[1]=qtdIdade[1]+1;
			} else if (idade>=16 && idade<=30) {
				qtdIdade[2]=qtdIdade[2]+1;
			} else if (idade>=31 && idade<=45) {
				qtdIdade[3]=qtdIdade[3]+1;
			} else if (idade>=46 && idade<=60) {
				qtdIdade[4]=qtdIdade[4]+1;
			} else {
				qtdIdade[5]=qtdIdade[5]+1;
			}
		}
		for(i=1;i<=5;i++) {
			porcemIdade[i]=100*(qtdIdade[i]/15);
			 System.out.println("Existem "+qtdIdade[i]+" na "+i+"Âº Faixa etária.");
			 System.out.println("Representando "+porcemIdade[i]+"% do total.");
		}
		in.close();
	}
}
