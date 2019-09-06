import java.util.Scanner;
public class CalculadoraMain
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numero;
		numero = sc.nextLine();

		String [] expressao = numero.split(" ");
		int tamanho = expressao.length;

		
		Calculadora calcula = new Calculadora(tamanho);

		for(int i = 0; i < expressao.length; i++)
		{
			
			if(expressao[i].equals("*"))
			{
				double a,b;
				a = (double) calcula.desempilhar();
				b = (double) calcula.desempilhar();
				double total = a * b;
				calcula.empilhar(total);
			}
			else if(expressao[i].equals("/"))
			{
				double a,b;
				a = (double) calcula.desempilhar();
				b = (double) calcula.desempilhar();
				double total = b / a;
				calcula.empilhar(total);
			}
			else if(expressao[i].equals("-"))
			{
				double a,b;
				a = (double) calcula.desempilhar();
				b = (double) calcula.desempilhar();
				double total = b - a;
				calcula.empilhar(total);
			}
			else if(expressao[i].equals("+"))
			{
				double a,b;
				a = (double) calcula.desempilhar();
				b = (double) calcula.desempilhar();
				double total = b + a;
				calcula.empilhar(total);
			}
			else
				calcula.empilhar(Double.parseDouble(expressao[i]));
		}
		System.out.println(calcula.vet[0]);
		sc.close();
	}
}