package primeiroprojetojava;
import java.util.Scanner;
public class PrimeiraClasse {

	public static void main(String[] args) {
	Scanner san = new Scanner(System.in);
	System.out.println("Informe nota na prova de peso 3 no primeiro bimestre:");
	double prova = san.nextDouble();
	System.out.println("Informe nota no projeto de peso 3 no primeiro bimestre:");
	double projeto = san.nextDouble();
	System.out.println("Informe nota na lista de exercicio de peso 2 no primeiro bimestre:");
	double exercicio = san.nextDouble();
	System.out.println("Informe nota de projetos de software de peso 3 no primeiro bimestre");
	double software = san.nextDouble();
	double mediab = (((3*prova)+(3*projeto)+(2*exercicio)+(3*software))/11);
	System.out.println("Sua média neste bimestre é "+Math.round(mediab)+"");	
	System.out.println("Informe nota na prova de peso 3 no segundo bimestre:");
	double prova2 = san.nextDouble();
	System.out.println("Informe nota no projeto de peso 3 no segundo bimestre:");
	double projeto2 = san.nextDouble();
	System.out.println("Informe nota na lista de exercicio de peso 2 no segundo bimestre:");
	double exercicio2 = san.nextDouble();
	System.out.println("Informe nota de projetos de software de peso 3 no segundo bimestre");
	double software2 = san.nextDouble();
	double mediab2 = (((3*prova2)+(3*projeto2)+(2*exercicio2)+(3*software2))/11);
	System.out.println("Sua média neste bimestre é "+Math.round(mediab2)+"");	
	System.out.println("Informe nota na prova de peso 3 no terceiro bimestre:");
	double prova3 = san.nextDouble();
	System.out.println("Informe nota no projeto de peso 3 no terceiro bimestre:");
	double projeto3 = san.nextDouble();
	System.out.println("Informe nota na lista de exercicio de peso 2 no terceiro bimestre:");
	double exercicio3 = san.nextDouble();
	System.out.println("Informe nota de projetos de software de peso 3 no terceiro bimestre");
	double software3 = san.nextDouble();
	double mediab3 = (((3*prova3)+(3*projeto3)+(2*exercicio3)+(3*software3))/11);
	System.out.println("Sua média neste bimestre é "+Math.round(mediab3)+"");	
	double medias = (mediab+mediab2+mediab3)/3;
	System.out.println("Sua média semestral é de "+Math.round(medias)+"");
	System.out.println( medias >= 8 ? "Você foi APROVADO com nota :)"+medias : "Você foi reprovado :( com nota " +medias );
	double provaf = (10 - medias);
	if(provaf > 2) {
		System.out.println("Você precisa tirar a nota "+(provaf)+" na prova final");}
	else {
		
	}
	
		
	
	
		
			
	
			
			
		
	}

	private static void If(boolean b) {
		// TODO Auto-generated method stub
		
	}

	private static String Trunc(double mediab, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
